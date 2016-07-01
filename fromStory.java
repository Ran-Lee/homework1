package com.orilore.lr.homework0623;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fromStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File a=new File("F:\\from.txt");
		
		File c=new File("F:\\to1.txt");
		
		if (!c.exists()) {
			try {
				c.createNewFile();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(a.exists()){
					
//			try {
//				a.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

			try {
				FileInputStream fi=new FileInputStream(a);
				
				int num=(int)a.length();
					
				byte [] b=new byte[num];
					
				fi.read(b);
				
				String str=new String(b);
//				
//				System.out.println(str);
				FileOutputStream fo = 
						new FileOutputStream(c);
				
				fo.write(str.getBytes());
				
				
				fi.close();
				
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
		
		
		
		
		
		
		
		
		}
			
		}
	


	
	
	
	}

	
	
