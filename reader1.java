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
			
			
			
			
			char[] a = new char[10];        //���еĺ�����ʲô

			int readlength = 0;

			while ((readlength = inr.read(a)) != -1) {     //reaber.read(a); ����ֵ�ǳ���Ϊa������

				String str = new String(a, 0, readlength);     // ���в���

				System.out.println(str);

			}
			inr.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
