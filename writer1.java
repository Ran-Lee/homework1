package com.orilore.lr.homework0701;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class writer1 {

	public static void main(String[] args) {     //����������ϰ���ֽ���д������
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fout=new FileOutputStream("F:\\d.txt",false);
			
			OutputStreamWriter outw=new OutputStreamWriter(fout,"UTF-8");
			
//			String a="��Һ�";
//			
//			String b="�Һܺ�";
			
			outw.write("��Һ�");
			
			outw.write(0);
			
			outw.write("\n");         // ��Ҫ����Ա�Լ��ֶ�����
			
			outw.write("�Һܺ�");
			
			outw.flush();
			
			outw.close();
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
