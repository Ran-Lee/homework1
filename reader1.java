package com.orilore.lr.homework0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class reader1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fin;
		try {
			fin = new FileInputStream("F:\\d.txt");
			InputStreamReader inr = new InputStreamReader(fin, "UTF-8");

			
//			int  a =inr.read();
//			
//			System.out.println(a);
			
			
			
			
			char[] a = new char[10];        //本行的含义是什么

			int readlength = 0;

			while ((readlength = inr.read(a)) != -1) {     //reaber.read(a); 返回值是长度为a的整数

				String str = new String(a, 0, readlength);     // 这行不懂

				System.out.println(str);

			}
			inr.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
