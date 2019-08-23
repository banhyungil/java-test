package io_test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FR_FIS_ISR_BR {		//FileReader, FileInputStream-InputStreamReader, FIS-ISR-BR 테스트

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis = null;
		BufferedReader br = null;
		try {
			
			//1.FileReader Test
			fr = new FileReader("hello.txt");
			int data = -1;
			
			int count = 0;
			while((data = fr.read()) != -1) {				//한글자단위로 받는다. encoding 방식은 utf-8로 설정되어있다.
				System.out.print((char)data);
				count++;
			}	
			System.out.println("\ncount : " + count);
			
			//2.InputStreamReader Test
			fis = new FileInputStream("ms949.txt");		
			InputStreamReader isr = new InputStreamReader(fis,"MS949");		//주스트림을 보조스트림과 연결, encoding을 설정할 수 있다.
			count = 0;
			while((data = isr.read()) != -1) {				//한글자씩
				System.out.print((char)data);
				count++;
			}
			System.out.println("\ncount : " + count);		
			
			//3.BufferedReader Test
			isr = new InputStreamReader(new FileInputStream("ms949.txt"),"MS949");
			
			br = new BufferedReader(isr);
			String line;
			count = 0;
			
			while((line = br.readLine()) != null) {			//한 라인씩 읽어들일 수 있다. end는 null
				System.out.println(line);
				count++;
			}
			System.out.println("count : " + count);
		} //end try
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Foundation : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if(fr !=null)
					fr.close();
				if(br !=null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


}
