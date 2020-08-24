package com.Test;
import java.util.*;

public class EquivalentSteps {
	public static void steps(int a,int b)
	{int len = Integer.toString(a).length(); 
	System.out.println(len);
		int[] ar1 =new int[len];
		int i=0;int step=0;
		int len1 = Integer.toString(b).length(); 
		int [] ar2 =new int[len1];;
		while(a>0 && b>0) {
			ar1[i]=a%10;
			a=a/10;
			ar2[i]=b%10;
			b=b/10;
			i++;
		}
		 for(int k=0;k<len;k++) {
			 if(ar1[k]>ar2[k]) {
				 int temp=ar1[k]-ar2[k];
				 step=step+temp;
			 }
			 else  {
				 int temp=ar2[k]-ar1[k];
				 step=step+temp;
			 }
		 }
		System.out.println(step);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		steps(521,123);
		//steps(a,b);
		

	}

}
