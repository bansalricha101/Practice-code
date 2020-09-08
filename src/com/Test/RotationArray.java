package com.Test;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class RotationArray {
	


public static void Rotate(int A[],int K,int N){
    StringBuffer sb=new StringBuffer();
    int pre,temp;
    for(int i=0;i<K;i++)
   {  temp=A[N-1];
     {for(int j=0;j<N;j++){
         pre=A[j];
         A[j]=temp;
         temp=pre;
      }

     }
   }
     for(int x=0;x<N;x++)
      {sb.append(A[x]);
      sb.append(" ");
      }
      System.out.println(sb);
}

    public static void main(String args[] ) throws Exception {
   
    Scanner s=new Scanner(System.in);
    int T=s.nextInt();
    while(T>0){
      int N=s.nextInt();
       int K=s.nextInt();
        int[] A=new int[N];
   for(int i=0;i<N;i++){
    A[i]=s.nextInt();
   }
         Rotate(A,K,N);
        
    }
  }
 
}



