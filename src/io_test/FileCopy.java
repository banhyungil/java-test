package io_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("iu.jpg");
			os = new FileOutputStream("iu_copy.jpg");
			
			int data = -1;
			while((data = is.read())!= -1) {		//다읽었으면 -1이 return 됨
				os.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found: " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if(is != null) {
					is.close();
				}
				if(os != null) {
					os.close();
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}

}
