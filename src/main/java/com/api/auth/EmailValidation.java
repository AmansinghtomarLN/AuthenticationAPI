package com.api.auth;

public class EmailValidation {
   public boolean checkEmail(String email) {
	   int a=email.indexOf("@");
	   int b=email.indexOf(".com");
	  
		   if(a!=0 && b!=0) {  
			   if(a>0 && b>a) {  
		  if(b==email.length()-4) {
			  return true;
		     }
	      }
	   }
	   return false;
   }
   

   public boolean countOfCharacterInEmail(String email) {
	   int countOfA = 0;
	   
	   for(int i=0; i<email.length(); i++) {
		  char c=email.charAt(i);
		  if(c=='@') {
			  countOfA++;
		  }
	   }
	   if(countOfA==1) {
		   return true;
	   }
	   
	   return false;
   }
   
   public boolean countOfCharacterInEmailCom(String email) {
	   int countOfA = 0;
	   
	   for(int i=0; i<email.length(); i++) {
		  char c=email.charAt(i);
		  if(""==".com") {
			  countOfA++;
		  }
	   }
	   if(countOfA==1) {
		   return true;
	   }
	   
	   return false;
   }
   
}
