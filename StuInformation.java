package com.orilore.lr.homework0623;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class StuInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> s=new HashMap<Integer,String>();
		
		Map<String,Integer> s1=new HashMap<String,Integer>();
		
		s.put(1313, "李然");
		
		s.put(1314, "刘明");
		
		s.put(1315, "唐重");
		
		s1.put("李然", 96);
		
		s1.put("刘明", 97);
		
		s1.put("唐重",95);
		
//		System.out.print(s);
		Set<Integer> set=s.keySet();
		
		Set<String> set1=s1.keySet();
		
//		System.out.println(set);
		
	    Iterator<Integer>  iter=set.iterator(); 
	    
	    while(iter.hasNext()){
	    	
	    	Integer m=iter.next();       //此处的Key指针用m表示
	    	
			System.out.println(m+":"+s.get(m));
	    	
	    }
        Iterator<String>  iter1=set1.iterator(); 
        
        int sum=0;
           
//        while(iter1.hasNext()){
//	    	
//	    	Integer n=iter.next();       //此处的Key指针用n表示
//	    	
//			System.out.println(n+":"+s.get(n));
//	    	
//	    }
         while(iter1.hasNext()){
	    	
	    	String n=iter1.next();     //此处的Key指针用n表示
	    	
	    	sum=sum+s1.get(n);
	    	
			}
	    
	    
	    System.out.println(sum/s1.size());
		
	}

}
