package com.orilore.lr.homework0701;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Buffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileOutputStream fout;
		try {
			//д��
			
			fout = new FileOutputStream("F:\\a.bb");
			
			BufferedOutputStream bout=new BufferedOutputStream(fout);     //Buffered��Ϊ���� ���ǹ���̫��
			
			DataOutputStream dout=new DataOutputStream(bout);             //��չ����
			
			dout.writeInt(11);
			
			dout.write(12);                                              //���в������� .writeInt(); ����
			
			dout.writeBoolean(true);
			
			dout.writeUTF("hello java world!!!");                  
			
			dout.flush();
			
			dout.close();
       //   ����
			
			FileInputStream fin=new FileInputStream("F:\\a.bb");
			
			BufferedInputStream bin=new BufferedInputStream(fin);
			
			DataInputStream din=new DataInputStream(bin);
			
			Integer a=din.readInt();
			
			Integer d=din.read();
			
			Boolean b=din.readBoolean();
			
			String c=din.readUTF();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			din.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
