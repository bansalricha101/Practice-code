package com.Test;import java.util.*;
import java.lang.*;
import java.io.*;


public class MultiplierDigit {

	
	
	/*package whatever //do not write package name here */

	
	
		public static void main (String[] args) {
			int t=2;
			int n1=100;
//	 		int n2=26;
			int flag=0;
			List<Integer> l=new ArrayList<Integer>();
			
			for(int i=9;i<0;i--){
			    while(n1>0){
			    if(n1%i==0){
			        n1=n1%i;
			        l.add(n1);
			        flag=1;
			          
			    }  
			    }
			}
			if(flag==0){
			    System.out.println("-1");
			    
			}
			else if(flag==1){
			    Collections.sort(l);
			    System.out.println(l);
			    
			}
		}
	}

