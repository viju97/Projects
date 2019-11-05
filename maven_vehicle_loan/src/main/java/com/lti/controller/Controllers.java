package com.lti.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.print.attribute.standard.Severity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lti.bean.BankDetails;
import com.lti.bean.LoanDetails;
import com.lti.bean.UserDetails;
import com.lti.bean.VehicleDetails;
import com.lti.exception.*;
import com.lti.services.*;

@Controller
@SessionAttributes("email")
public class Controllers {
	
	@Resource
	private UserService service;

	@RequestMapping("/login")
	public String getLoginPage() {
		return "login";
	}

	@RequestMapping("/emi")
	public String getEmiPage() {
		return "emi";
	}

	@RequestMapping("/welcome")
	public String getwelcomePage() {
		return "welcome";
	}
	@RequestMapping("/home")
	public String getHomePage() {
		return "home";
	}

	@RequestMapping("/register")
	public String getRegisterPage() {
		return "register";
	}

	@RequestMapping(value = "/eligibilityCal", method = RequestMethod.POST)
	public ModelAndView getElPage(@ModelAttribute("email") String email,@RequestParam("loanAmount") String loanAmount, @RequestParam("roi") String roi,
			@RequestParam("loanTenure") String loanTenure, @RequestParam("emi") String emi) {
		UserDetails user1 = null;
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		LoanDetails loan = new LoanDetails(loanAmount, "6666", emi, loanTenure, roi, email, 0, 0, 0);
		System.out.println(loan);
		service.insertLoanDetails(loan);
		user1 = service.getUser(email);
		mAndv.setViewName("personaldetails");
		mAndv.addObject("user1", user1);
		return mAndv;
	}

	@RequestMapping("/finaleligibility")
	public String finalEligibility() {
		return "finaleligibility";
	}

	@RequestMapping(value = "/finalEligibilityCal", method = RequestMethod.POST)
	public ModelAndView finalEligibilityPage(@ModelAttribute("email") String email,@RequestParam("loanAmount") String loanAmount,
			@RequestParam("roi") String roi, @RequestParam("loanTenure") String loanTenure,
			@RequestParam("emi") String emi) {
		UserDetails user1 = null;
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		LoanDetails loan = new LoanDetails(loanAmount, "6666", emi, loanTenure, roi, email, 0, 0, 0);
		System.out.println(loan);
		service.updateLoanDetails(loan);
		loan = service.getLoanDetails(email);
		mAndv.setViewName("loan");
		mAndv.addObject("loan", loan);
		return mAndv;
	}

	@RequestMapping("/upload")
	public String getUploadPage() {
		return "upload";
	}

	@RequestMapping("/acceptRequest")
	public ModelAndView acceptRequest(@RequestParam("email") String email) {
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		mAndv.setViewName("admin");
		List<LoanDetails> loanList = null;
		service.acceptRequest(email);
		loanList = service.getLoanList();
		mAndv.addObject("loanList", loanList);
		System.out.println(email);
		return mAndv;

	}

	@RequestMapping("/rejectRequest")
	public ModelAndView rejectRequest(@RequestParam("email") String email) {
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		mAndv.setViewName("admin");
		List<LoanDetails> loanList = null;
		service.rejectRequest(email);
		loanList = service.getLoanList();
		mAndv.addObject("loanList", loanList);
		System.out.println(email);
		return mAndv;

	}

	@RequestMapping("/personaldetails")
	public ModelAndView getPersonalDetailsPage(@ModelAttribute("email") String email) {
		UserDetails user1 = null;
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		user1 = service.getUser(email);
		mAndv.setViewName("personaldetails");
		mAndv.addObject("user1", user1);
		return mAndv;
	}

	@RequestMapping(value = "personaldetails", method = RequestMethod.POST)
	public ModelAndView getPersonalUpdate(UserDetails user, Map model) {
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		System.out.println("sadfs");
		System.out.println(user);
		service.updateUser(user);
		mAndv.setViewName("newbankdetails");
		return mAndv;
	}

	@RequestMapping(value = "bankDetails", method = RequestMethod.POST)
	public ModelAndView getBankDetails(BankDetails bank, @RequestParam("quesResponse") String quesresponse) {
		ModelAndView mAndv = null;
		if (quesresponse.equals("Yes")) {
			mAndv = new ModelAndView();
			System.out.println(bank);
			service.insertBankDetails(bank);
			mAndv.setViewName("vehicledetails");
		}

		return mAndv;
	}

	@RequestMapping(value = "bankNewDetails", method = RequestMethod.POST)
	public ModelAndView getNewBankDetails(@ModelAttribute("email") String email,@RequestParam("quesResponse") String quesresponse) {
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		// System.out.println(bank);
		UserDetails user = new UserDetails();
		user.setFirstName("md");
		service.newBankDetails(email, user);
		mAndv.setViewName("vehicledetails");

		return mAndv;
	}

	@RequestMapping(value = "vehicledetails", method = RequestMethod.POST)
	public ModelAndView getVehicle(VehicleDetails vehicle, Map model) {
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		System.out.println("sadfs");
		System.out.println(vehicle);
		service.insertDetails(vehicle);
		mAndv.setViewName("upload");
		return mAndv;
	}

	@RequestMapping("/applyloan")
	public ModelAndView getApplyLoanPage(@ModelAttribute("email") String email) {
		ModelAndView mAndv=new ModelAndView();
		mAndv.setViewName("applyloan");
		return mAndv;
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public ModelAndView uploadFile(@ModelAttribute("email") String email,@RequestParam("files")MultipartFile[] files, HttpServletRequest request, Model model) {

		String relativeWebPath="/upload_files";
		String absoluteFilePath=request.getRealPath(relativeWebPath);
		System.out.println("Location"+absoluteFilePath);
		File dir=new File(absoluteFilePath);
		if(!dir.exists()){
			dir.mkdir();
		}
		int file_chk = 1;
		String doc_type=null;
		for (MultipartFile file : files) {
		if(!file.isEmpty()){
			try{
				if(file_chk == 1)
					doc_type = "aadhar";
				else if (file_chk == 2)
					doc_type = "pancard";
				else if (file_chk == 3)
					doc_type = "voterId";
				else if (file_chk == 4)
					doc_type = "salarySlip";
				else if (file_chk == 5)
					doc_type = "loa";
				else if (file_chk == 6)
					doc_type = "noc";
				else 
					doc_type = "agreement";
				
				
				byte[] bytes=file.getBytes();
				File uploadFile=new File(dir.getAbsolutePath()+File.separator+"Nirmal"+"-"+doc_type+file.getOriginalFilename());
				BufferedOutputStream outputStream=new BufferedOutputStream(new FileOutputStream(uploadFile));
				outputStream.write(bytes);
				outputStream.close();
				
				
				model.addAttribute("uploadMessage","File Upload Successfully, File Name:"+file.getOriginalFilename());
			}catch(Exception e){
				e.printStackTrace();
			}
		}//end of if
		
		file_chk++;
		}
		
	
		ModelAndView mAndv = null;
		mAndv = new ModelAndView();
		LoanDetails loan = service.getLoanDetails(email);
		mAndv.setViewName("loan");
		mAndv.addObject("loan", loan);
		return mAndv;
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView getRegInsert(UserDetails user, Map model) {
		ModelAndView mAndv = null;
		try {

			mAndv = new ModelAndView();
			System.out.println("sadfs");
			System.out.println(user);
			boolean flag = service.insertRegDetails(user);
			mAndv.setViewName("registersuccess");
		} catch (Exception e) {
			System.out.println(e);
		}

		return mAndv;
	}

	@RequestMapping("finalLoan")
	public ModelAndView finalLoan(@ModelAttribute("email") String email) {
		ModelAndView mAndv = null;
		mAndv.setViewName("loanpage");
		LoanDetails loan = service.getLoanDetails(email);
		BankDetails bank = service.getBankDetails(email);
		UserDetails user= service.getUser(email);
		mAndv.addObject("loan",loan);
		mAndv.addObject("bank",bank);
		mAndv.addObject("user",user);
		return mAndv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(ModelMap model, @RequestParam("email") String email,
			@RequestParam("password") String password) {
		
		ModelAndView mAndv = null;
		System.out.println("LOGIN CHECK..........." + service.checkAdmin(email, password));
		if (service.checkAdmin(email, password)) {
			mAndv = new ModelAndView();
			mAndv.setViewName("admin");
			List<LoanDetails> loanList = null;
			loanList = service.getLoanList();
			mAndv.addObject("loanList", loanList);

		} else if (service.checkLogin(email, password)) {
			
			mAndv = new ModelAndView();
			mAndv.setViewName("welcome");
			mAndv.addObject("email",email);
			UserDetails user=service.getUser(email);
			mAndv.addObject("name",user.getFirstName());

		}

		return mAndv;
	}

}
