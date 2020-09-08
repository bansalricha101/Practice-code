package com.Test;
import java.lang.*;
public class RemoveDuplicateString {


		public static void main(String args[]) 
		{ 
			String str = "geekss@for@geekss@rrr"; 
			String[] arrOfStr = str.split("@"); 
	        int n=arrOfStr.length;
	      
	        for(int i=0;i<n;i++)
	          {for(int j=i+1;j<n;j++) {
	        	if(arrOfStr[j].equals(arrOfStr[i])) {
	        		
	        	}
	          }
	        }
	      for (String a : arrOfStr) 
	        System.out.println(a);
		} 
	
}
