package com.orilore.lr.homework0701;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class selfBuffered {

	public static void main(String[] args) {    //�൱����input ���� output �ⲿ�ڰ�װһ�����ӷ���
		// TODO Auto-generated method stub      
		                                         //��������� �����ܾ���̫�򵥿ɱ��Բ���
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("F:\\abc.txt",false);
		
			OutputStreamWriter outw=new OutputStreamWriter(fout,"UTF-8");  //����ûд���뷽ʽҲû��
			
			BufferedWriter buw=new BufferedWriter(outw);
			
			buw.write("�������������");
			
			buw.newLine();
			
			buw.write("һ�а���������");
			
			buw.newLine();
		
			buw.write("��������ǧ��ѩ");
		
			buw.newLine();
			
			buw.write("�Ų��������ﴬ");
			
			buw.flush();
			
			buw.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
