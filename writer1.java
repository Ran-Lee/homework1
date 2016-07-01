package com.orilore.lr.homework0701;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class writer1 {

	public static void main(String[] args) {     //本例子是练习用字节流写入数据
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fout=new FileOutputStream("F:\\d.txt",false);
			
			OutputStreamWriter outw=new OutputStreamWriter(fout,"UTF-8");
			
//			String a="大家好";
//			
//			String b="我很好";
			
			outw.write("大家好");
			
			outw.write(0);
			
			outw.write("\n");         // 需要程序员自己手动换行
			
			outw.write("我很好");
			
			outw.flush();
			
			outw.close();
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
