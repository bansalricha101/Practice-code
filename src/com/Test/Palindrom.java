package com.Test;


import java.util.*;

public class Palindrom {


    public static boolean ispalindrom(String str){
        String temp1=str;
        String rev="";
        char[] ch=str.toCharArray();
        Set<String> list=new HashSet<String>();
        for(int j=ch.length-1;j>=0;j--){
         rev=rev+ch[j];
                
        }
        if(rev.equals(temp1)){
        	if(temp1.length()>1)
            {list.add(temp1);
            System.out.println(temp1);
              return true;
            }
        	else 
        		return false;
        }
        else 
            return false;
    }

   public static int palindrom(String s){
       int count=0;
         for(int i=0;i<s.length();i++){
          for(int j=i+1;j<=s.length();j++){
             String temp=s.substring(i,j);
             if(ispalindrom(temp)){
               ++count;
             }
          }
     }
     return count;
   }

    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palindrom(s));
    }

	
}
