package com.lti.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.bean.BankDetails;
import com.lti.bean.LoanDetails;
import com.lti.bean.User1;
import com.lti.bean.UserDetails;
import com.lti.bean.VehicleDetails;
import com.lti.services.*;

public class TestDao {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("v-core.xml");

		UserService services = ctx.getBean("UserService", UserService.class);

//		List<UserDetails> list = services.getuserlist();
//		System.out.println(list);
//		UserDetails user=new UserDetails();
//		user.setFirstName("vijit");
//		user.setLastName("tiwari");
//		user.setAge(1);
//		user.setEmail("vijit@email.com");
//		user.setMobile("123434");
//		user.setPassword("1234");
//		user.setAddress("fdgfgfsg");
//		user.setGender("male");
//		user.setState("maharashtra");
//		services.insertRegDetails(user);

//		VehicleDetails vehicle=services.getVehicle("rahul@gmail.com");
//		System.out.println(vehicle);

//		VehicleDetails vehicle= new VehicleDetails("Hyundai","i20","10Lakh","vt@gmail.com");
//		System.out.println(services.insertDetails(vehicle));

		// BankDetails bank =(BankDetails) services.getBankDetails("vijit@gmail.com");
		// BankDetails bank= new
		// BankDetails("HARSHAL",54654,"harshal@gmail.com","HDFC786");
		// services.insertBankDetails(bank);
		// System.out.println(bank);
//		LoanDetails loan=services.getLoanDetails("rahul@gmail.com");
//		System.out.println(loan);
//		
//		LoanDetails loan=new LoanDetails(100000,77777,1000,5,10,"mdddd@gmail.com",0,10000);
//		services.insertLoanDetails(loan);

//		List<LoanDetails> list = services.getLoanList();
//		for (LoanDetails li : list)
//			System.out.println(li);

	}

}
