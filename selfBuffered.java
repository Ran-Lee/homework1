package com.orilore.lr.homework0701;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class selfBuffered {

	public static void main(String[] args) {    //相当于在input 或者 output 外部在包装一层增加方法
		// TODO Auto-generated method stub      
		                                         //这个方法简单 但是总觉得太简单可变性不好
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("F:\\abc.txt",false);
		
			OutputStreamWriter outw=new OutputStreamWriter(fout,"UTF-8");  //这里没写编码方式也没错
			
			BufferedWriter buw=new BufferedWriter(outw);
			
			buw.write("两个黄鹂鸣翠柳");
			
			buw.newLine();
			
			buw.write("一行白鹭上青天");
			
			buw.newLine();
		
			buw.write("窗含西岭千秋雪");
		
			buw.newLine();
			
			buw.write("门泊东吴万里船");
			
			buw.flush();
			
			buw.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
