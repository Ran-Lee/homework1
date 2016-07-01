package com.orilore.lr.homework0701;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class selfobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student p=new Student();
		
		try {
			FileOutputStream fout = new FileOutputStream("F://c.dd");
		
			BufferedOutputStream  bout = new BufferedOutputStream(fout);
			
		    ObjectOutputStream  oout = new ObjectOutputStream(bout);
		    
		    oout.writeObject(p);             //写入自己定义的类的对象
		    
		    oout.flush();
		    oout.close();   
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin=new FileInputStream("F:\\c.dd");
			
			BufferedInputStream bin=new BufferedInputStream(fin);
			
			ObjectInputStream oin=new ObjectInputStream(bin);
			
			Student s=(Student)oin.readObject();
			
            System.out.println(s.name);
            
            System.out.println(s.sex);
            
            System.out.println(s.age);
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		    
		    
		    
	}

}
