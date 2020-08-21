package com.Test;
import java.util.ArrayList;
import java.util.List;


public class Rodcut {

	public static List<Integer> rodcutting(List<Integer> list){
		boolean flag=true;
		int new_val=0;
		List<Integer> numList=new ArrayList<Integer>();
		while(flag) {
			numList.add(list.size());
			int min=java.util.Collections.min(list);
			for(int i=0;i<list.size();i++)
			{
				new_val=list.get(i)-min;
				if(new_val==0) {
				list.remove(i);
				i-=1;
				}
				else
				list.set(i, new_val);
			}
			if(list.size()==0) {
				flag=false;
			}
		}
		return numList;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		
		System.out.println(rodcutting(list));
		
	}

}
