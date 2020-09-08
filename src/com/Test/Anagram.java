package com.Test;
import java .util.*;
public class Anagram {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="richa";
		String s2="idrcha";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		String str1=new String(ch1);
		Arrays.sort(ch2);
		String str2=new String(ch2);
		if(str1.equals(str2)) 
			System.out.println("Anagram String");
		
		else
			System.out.println("not Anagram String");
	
	}

}
