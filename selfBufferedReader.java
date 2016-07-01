package com.orilore.lr.homework0701;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class selfBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileInputStream fin;
		try {
			fin = new FileInputStream("F:\\abc.txt");
			
			InputStreamReader isr=new InputStreamReader(fin,"UTF-8"); //写和读必须用同样的编码方式
			
			BufferedReader bread=new BufferedReader(isr);
		
//			System.out.println(bread.readLine());
//			System.out.println(bread.readLine());
//			System.out.println(bread.readLine());
//			System.out.println(bread.readLine());
			
			
			//这里便利懂了
			 String strline = new String();
			 
			 
			 
			 while((strline = bread.readLine())!=null){
				 
				 System.out.println(strline);
				 
			 }
			 
			
			
			bread.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
