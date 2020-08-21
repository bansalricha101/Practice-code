//package com.Test; 
//import java.util.*; 
//public class Kangaroo {
//	
//	public static String jump(int x1,int v1,int x2,int v2) {
//		int count1=0;
//		int count2=0;
//		int flag=0;
//		while(flag==0) {
//			if(x1<x2 && v2>v1)
//				return "NO";
//			x1=x1+v1;
//			count1++;
//			x2+=v2;
//			count2++;
//			if(x1==x2 && count1==count2)
//				{flag=1;
//				return "YES";
//				}
//			else if (x1==x2 && count1!=count2)
//			return "NO";
//		}
//		return "NO";
//	}
//
//	public static void main(String[] args) {
//		
//     Scanner sc=new Scanner (System.in);
//      int x1=sc.nextInt();
//      int x2=sc.nextInt();
//      int v1=sc.nextInt();
//      int v2=sc.nextInt();
//     System.out.println("Kangaroo");
//     System.out.println(jump(x1,v1,x2,v2));
//      
//	}
//
//}






package com.Test; 
import java.util.*; 
public class Kangaroo {
	
	public static String jump(int x1,int v1,int x2,int v2) {
		int count1=0;
		int count2=0;
		int flag=0;
		while(flag==0) {
			if(x1<x2 && v2>v1)
				return "NO";
			else{x1=x1+v1;
			count1++;
			x2+=v2;
			count2++;
			if(x1==x2 && count1==count2)
				{ 
				 flag=1;
				 break;
				}
		}
			
	}
		 if(flag==1) 
			 return "YES";
         else 
        	 return "NO";
		}

	public static void main(String[] args) {
		
     Scanner sc=new Scanner (System.in);
      int x1=sc.nextInt();
      int x2=sc.nextInt();
      int v1=sc.nextInt();
      int v2=sc.nextInt();
     System.out.println("Kangaroo");
     System.out.println(jump(x1,v1,x2,v2));
      
	}

}

