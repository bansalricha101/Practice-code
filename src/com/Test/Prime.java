package com.Test;
	
	import java.util.*; 

	class Prime { 

	public static void prime(int arr[], int n) 
	{ List<Integer> l=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
		if(arr[i]==1)
			{continue;}
		else if(arr[i]==2)
			{
			l.add(arr[i]);
			System.out.println(arr[i]);
		     continue;
			}
		else if(arr[i]>2)
		{
			boolean isprime=true;
		      for(int j=2;j<arr[i];j++) {
			   if(arr[i]%j==0){
                isprime = false;
                break;
                }
			   
				}
		      if(isprime==true)
		      { l.add(arr[i]);
				System.out.println(arr[i]);
		      }
          }
		
		
		
	}
		for(Integer a:l) {
			System.out.println(a);
		}
		int max=Collections.max(l);
		int min=Collections.min(l);
		System.out.println(max+" ,"+ min);
	}
	
	
		public static void main(String[] args) { 
			int arr[] = { 1, 2, 3, 4, 5, 6, 7,8 }; 
		int n = arr.length; 

		prime(arr, n); 
		} 
	} 
	
