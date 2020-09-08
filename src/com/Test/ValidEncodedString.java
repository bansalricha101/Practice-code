package com.Test;

public class ValidEncodedString {
 public static boolean check(String s1,String s2) {
	 System.out.println("welcome");
	 char[] ch1=s1.toCharArray();
	 char[] ch2=s2.toCharArray();
	 boolean flag=true;
	 int counter=0;
	 for(int i=0;i<ch1.length;i++) {		  
		 if(ch1[i]=='+')
		 {
			 int num=ch2[counter];
			 counter++;
			 if(!(num>=65 && num<=122)) {
				 flag=false;
				 break;
			 }
		 }
		 if(ch1[i]=='$')
		 {
			 int num=ch2[counter];
			 counter++;
			 if(!(num>=48 && num<=57)) {
				 flag=false;
				 break;
			 }
		 }
		 if(ch1[i]=='*')
		 {
			 int num=ch2[counter];
			 counter++;
			 if(!(num>65 && num<122)) {
				 flag=false;
				 break;
			 }
			 else {
				 char ch=ch2[counter];
				 counter++;
			 while(ch2[i+1]==ch)
				 i++;
			 }
		 }
	 }
	 if (flag==false)
		 return false;
	 else 
		 return true;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="$+++**$$";
		String s2="1abcuuuutttt13";
		System.out.println(check(s1,s2));

	}

}
