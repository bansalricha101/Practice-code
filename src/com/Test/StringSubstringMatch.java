package com.Test;

import java.util.*; 
import java.io.*;

public class StringSubstringMatch {
	

	  public static String MinWindowSubstring(String[] strArr) {
	    // code goes here  
	    String s1=strArr[0];
	     String s2=strArr[1];
	       int n=s1.length();
          String temp;
	       char [] ch1=s2.toCharArray();
	       Arrays.sort(ch1);
	       int flag=0;
	              
	for (int i=0;i<n;i++){
	  for(int j=i+1;j<n;j++){
	    String arr,str;
	    arr=s1.substring(i,j);
	    str=arr;
	    char [] ch2=arr.toCharArray();
	    Arrays.sort(ch2);
	     if(ch1==ch2)
	     {	 flag=1;
	          break;
	     }
	  }
	}
	 if(flag==1)
		 return temp;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(MinWindowSubstring(s.nextLine())); 
	  }

	}


