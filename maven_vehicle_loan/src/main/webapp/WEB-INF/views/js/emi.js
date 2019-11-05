function emicalculator(){

    var loanamount=document.getElementById("loanamount").value;
    var rateofinterest=document.getElementById("rateofinterest").value;
    var tenure=document.getElementById("tenure").value;
    var loanvalidate=document.getElementById("loanvalidate");
    var roivalidate=document.getElementById("roivalidate");
    var tenurevalidate=document.getElementById("tenurevalidate");
    var totalemi=document.getElementById("totalemi");
    var P=loanamount;
    var r=rateofinterest/(12*100);
    var n=tenure;
    var f1=0,f2=0,f3=0;
   
    
    
    //LOAN AMOUNT
    if(loanamount==""){
    loanvalidate.style.color="red";
    loanvalidate.textContent="Enter Amount";
    }
    else if(loanamount<100000 || loanamount>1000000 ){
        loanvalidate.style.color="red";
        loanvalidate.textContent=" Range Between 3Lakhs and 10Lakhs";
    }
    else if(isNaN(loanamount))
    {
    loanvalidate.style.color="red";
    loanvalidate.textContent="NUMBERS ONLY";
    }
    else {
    loanvalidate.style.color="green";
    loanvalidate.textContent="VALID";
    f1=1;
    }


    //ROI
    if( rateofinterest==0){
    roivalidate.style.color="red";
    roivalidate.textContent="Enter Amount";
    }
    else if(isNaN(rateofinterest))
    {
    roivalidate.style.color="red";
    roivalidate.textContent="NUMBERS ONLY";
    }
    else if(rateofinterest>12){
    
        roivalidate.style.color="red";
        roivalidate.textContent="Please choose below 12%";
    
    }
    else if((rateofinterest%0.5)!==0){
        roivalidate.style.color="red";
        roivalidate.textContent="Please insert in Multiples of 0.5";
    }
    else {
        roivalidate.style.color="green";
        roivalidate.textContent="VALID";
        f2=1;
        }

    //TENURE AMOUNT
    if(tenure==""){
    tenurevalidate.style.color="red";
    tenurevalidate.textContent="Enter Amount";
    }else if(tenure==0){
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="Tenure cannot be zero";
    }
    else if(isNaN(tenure))
    {
    tenurevalidate.style.color="red";
    tenurevalidate.textContent="NUMBERS ONLY";
    }
    else if((tenure%(Math.floor(tenure)))!=0){
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="Tenure cannot be in decimal";
    }
    else if(tenure>60){
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="Tenure should be less than 60 months (5 years)";
    }
   else {
        tenurevalidate.style.color="green";
        tenurevalidate.textContent="VALID";
        f3=1;
        }
    if(f1==1 && f2==1 && f3==1)
    {
        var E=(P * r * Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
    totalemi.textContent=( E.toFixed(2));
  //  emi.value=( E.toFixed(2));
    }
    else
    {
        totalemi.textContent=("-----");

    }
}
/////LOGIN PAGE
function loginvalidate()
{
var email=document.getElementById("email").value;
var password=document.getElementById("password").value;
var loginvalidate=document.getElementById("loginvalidate");
var passvalidate=document.getElementById("passvalidate");
var f1=0,f2=0;

//LOGIN PAGE EMAIL  VALIDATION
if(!email.match( /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/))
{
    loginvalidate.style.color="red";
    loginvalidate.textContent="Email format invalid";  
}
else{
    loginvalidate.textContent="";  
    f1=1;

}

//LOGIN PAGE PASSWORD VALIDATION
if(!password.match(/^(?=.*\d)(?=.*[a-z])(?=.*[!@#$%^&*])(?=.*[A-Z]).{6,20}$/))
{
    passvalidate.style.color="red";
    passvalidate.textContent="Password format invalid";  
   
}
else{
    passvalidate.textContent="";  
    f2=1;
   
}
if(f1==1 && f2==1){
    return true;
}
else{
    return false;
}
}






//ELIGIBILITY FOR LOAN
function eligibility(){
    
	 var emi=document.getElementById("emi1");
    var eligage=document.getElementById("eligage").value;
    var validateage=document.getElementById("validateage");
   

    var elisalary=document.getElementById("elisalary").value;
    var validatesal=document.getElementById("validatesal");


    var eliemptyp=document.getElementsByName("eliemptyp").value;

    var dis=document.getElementById("disable");

    var loanamount=document.getElementById("loanamount").value;
    var loanvalidate=document.getElementById("loanvalidate");

    var existingemi=document.getElementById("existingemi").value;
    var existingemidiv=document.getElementById("existingemidiv");

    var rateofinterest=document.getElementById("rateofinterest").value;
    var roivalidate=document.getElementById("roivalidate");

    var elisalary=document.getElementById("elisalary").value;

    var tenure=document.getElementById("tenure").value;
    var tenurevalidate=document.getElementById("tenurevalidate");

    var totalemi=document.getElementById("totalemi");
    var finalCheck=document.getElementById("finalCheck");
    var tenureage=document.getElementById("tenureage");

    var P=loanamount;
    var r=rateofinterest/(12*100);
    var n=tenure;
    var f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;

    //EMI
    if(isNaN(existingemi)){
        existingemidiv.style.color="red";
        existingemidiv.textContent="ONLY NUMBERS";

    }


    //SALARY
    if(elisalary==0 || elisalary==""){
        validatesal.style.color="red";
        validatesal.textContent="INVALID AMOUNT";

    }else if(isNaN(elisalary)){
        validatesal.style.color="red";
        validatesal.textContent="ONLY NUMBERS";
    }else if(elisalary<240000){
        validatesal.style.color="red";
        validatesal.textContent="CRITERIA NOT SATISFIED";
    }
    else{
        validatesal.style.color="green";

        validatesal.textContent="VALID AMOUNT";
    }
    //AGE
    if(eligage>=21 && eligage<=70 && eligage!="")
    {
        
        validateage.style.color="green";
        validateage.textContent="VALID AGE";
        f1=1;
       
    }else if(isNaN(eligage)){
        validateage.style.color="red";
        validateage.textContent="ONLY NUMBERS";
    }
    else
    {
        
        validateage.style.color="red";
        validateage.textContent="INVALID AGE";
        f1=0;
    }

    //LOANAMOUNT
    if(isNaN(loanamount) || loanamount=="")
    {
        loanvalidate.style.color="red";
        loanvalidate.textContent="INSERT NUMBERS";
    }
    else if(loanamount >= 100000 && loanamount<=1000000  )
    {
        
        f2=1;
        if((((loanamount*2))+(loanamount*rateofinterest/(100*12*4.5)))<(((elisalary))-(existingemi*12)))
        {   
            loanvalidate.style.color="green";
            loanvalidate.textContent="LOAN AMOUNT ACCEPTED";     
            f3=1;
        }
        else
        {    
            loanvalidate.style.color="red";
            loanvalidate.textContent="LOAN AMOUNT EXCEEDED ";
            f3=0;
        }
    }
    else
    {
       
        loanvalidate.style.color="red";
        loanvalidate.textContent="Invalid amount";
       f2=0;
    } 

   
    
///tenure
    if(tenure=="")
    {    
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="Enter Amount";
        f4=0;
    }
    else if(tenure==0)
    {
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="Tenure cannot be zero";
        f4=0;
    }
    else if(isNaN(tenure))
    {
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="NUMBERS ONLY";
        f4=0;
    }
    else if((tenure%(Math.floor(tenure)))!=0)
    {
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="Tenure cannot be in decimal";
        f4=0;
    }else  if((tenure/12)>(70-eligage)){
        tenurevalidate.style.color="red";
        tenurevalidate.textContent="TENURE LIMIT EXCEEDED";
        f6=0;
    }
    else{

        tenurevalidate.style.color="green";
        tenurevalidate.textContent="VALID";
        f4=1;
        f6=1;
    }



////RATE OF INTEREST
    if(rateofinterest=="")
    {
        roivalidate.style.color="red";
        roivalidate.textContent="Enter Amount";
        f5=0;
    }
    else if(rateofinterest==0)
    {
        roivalidate.style.color="red";
        roivalidate.textContent="Interest cannot be zero";
        f5=0;
    }
    else if(isNaN(rateofinterest))
    {
        roivalidate.style.color="red";
        roivalidate.textContent="NUMBERS ONLY";
        f5=0;
    }
    else if(rateofinterest>12)
    {
    
        roivalidate.style.color="red";
        roivalidate.textContent="Please choose below 12%";
        f5=0;
    
    }
    else if((rateofinterest%0.5)!==0)
    {
        roivalidate.style.color="red";
        roivalidate.textContent="Please insert in Multiples of 0.5";
        f5=0;
    }
    else 
    {
        roivalidate.style.color="green";
        roivalidate.textContent="VALID";
        f5=1;
    }
   




    //////
    if(f1==1 && f2==1 && f3==1 &&f4==1&&f5==1&&f6==1)
    {   
        finalCheck.style.color="green";
        finalCheck.textContent="You are Eligible ";
        var E=(P * r * Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
        totalemi.textContent=("Estimated Rs: "+ E.toFixed(2)+ "/month");
        emi.value=E.toFixed(2);
        dis.disabled=false;
        return true;
        
        
    }
    else
    {
        finalCheck.style.color="red";
        finalCheck.textContent="You are not Eligible,Sorry! ";
        totalemi.textContent=("");
        dis.disabled=true;
        return false;

    }

}

function registervalidate(){
    var first_name = document.getElementById("first_name").value;
    var last_name = document.getElementById("last_name").value;
    var age = document.getElementById("age").value;
    var gender = document.getElementsByClassName("gender").value;
    var mob = document.getElementById("mob").value;
    var email= document.getElementById("email").value;
    var password= document.getElementById("pass").value;
    var employment= document.getElementsByClassName("employment").value;
    var err_msg_first_name=document.getElementById("err_msg_first_name");
    var err_msg_last_name=document.getElementById("err_msg_last_name");
    var err_msg_age=document.getElementById("err_msg_age");
    var err_msg_mobile=document.getElementById("err_msg_mobile");
    var err_msg_email=document.getElementById("err_msg_email");
    var err_msg_password=document.getElementById("err_msg_password");
    if(first_name.match(/^[A-Za-z]+$/)){
    err_msg_first_name.style.color="green";
    
    err_msg_first_name.textContent="VALID";
    }else{
    err_msg_first_name.style.color="red";
    
    err_msg_first_name.textContent="Please Enter Only Alphabets ";
    
    }
    if(last_name.match(/^[A-Za-z]+$/)){
    err_msg_last_name.style.color="green";
    
    err_msg_last_name.textContent="VALID";
    }else{
    err_msg_last_name.style.color="red";
    
    err_msg_last_name.textContent="Please Enter Only Alphabets ";
    
    }
    if(age>21 && age<70 )
    {
    err_msg_age.style.color="green";
    err_msg_age.textContent="VALID AGE";
    f1=1;
    }
    else
    {
    err_msg_age.style.color="red";
    err_msg_age.textContent="INVALID AGE";
    f1=0;
    }
    if(!mob.match(/(7|8|9)\d{9}/))
    {
    err_msg_mobile.style.color="red";
    err_msg_mobile.textContent="Mobile format invalid";
    }
    else{
    err_msg_mobile.style.color="green";
    err_msg_mobile.textContent="VALID";
    }
    
    if(!email.match( /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/))
    {
    err_msg_email.style.color="red";
    err_msg_email.textContent="Email format invalid";
    }
    else{
    err_msg_email.style.color="green";
    
    err_msg_email.textContent="VALID";
    }
    if(!password.match(/^(?=.*\d)(?=.*[a-z])(?=.*[!@#$%^&*])(?=.*[A-Z]).{6,20}$/))
    {
    err_msg_password.style.color="red";
    err_msg_password.textContent="Password format invalid";
    return false;
    }
    else{
    err_msg_password.style.color="green";
    
    err_msg_password.textContent="VALID";
    }
    return true;
}

    