package io_test;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedOuputStreamTest {			//보조스트림 사용방법

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BufferedOutputStream bos = null;
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//FileOutputStream fos = new FileOutputStream("test.txt");				//보조스트림을 쓴다면 주스트림을 따로 쓸일이 없다
			bos = new BufferedOutputStream(new FileOutputStream("test.txt"));		//보조스트림에 주스트림을 넣는다.
																					
			for(int i = 'a'; i <= 'z'; i++) {
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
		} catch(IOException e) {
			
		} finally {
			try {
				if(bos != null)
					bos.close();							//보조스트림을 닫으면 연쇄적으로 주스트림도 닫힌다.(동적확장을 하였기 때문)
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
