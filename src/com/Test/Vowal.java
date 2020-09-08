package com.Test;
import java.util.*;
import java.lang.*;
public class Vowal {
	
	public static boolean isvowel(char ch) {
		if(ch=='a' || ch=='e'|| ch=='i' ||ch=='o' ||ch=='u' ) {
			return true;
		}
		else
			return false ;
	}
	
	public static void check(String s2) {
		int c=0;
		s2=s2.toLowerCase();
		for(int i=0;i<s2.length();i++) {
//			if(isvowel(s2.charAt(i)) && isvowel(s2.charAt(i+1)))
			
			if(isvowel(s2.charAt(i)) )
				c++;
			}
		System.out.println(c);
	}

	public static void main(String[] args) {

		String s2= "Richa is a girl ae io uuuuumc";

		check(s2);

	}

}
