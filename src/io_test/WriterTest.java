package io_test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WriterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		BufferedReader br = null;
		FileWriter fw = null;

		try {
			fos = new FileOutputStream("test.txt");
			isr = new InputStreamReader(System.in);		//보조스트림에 키보드 주스림을 연결한다.

			int data;
			while((data = isr.read()) != 'e') {				//한 글자씩 읽는다 e를 만나면 stop
				fos.write(data);
			}
			fos.close();
			
			//FileWriter를 통해 쓰기 작업 (UTF-8)
			fw = new FileWriter("test.txt");							//한글을 넣기위해 FileWriter를 생성한다
			br = new BufferedReader(isr);								//FileOutputStream으로는 char단위로 받기때문에 불가능

			String str;
			while((data = isr.read()) != 'e') {				//한글지원은 [Input|Output}Stream{Reader|Writer}, 
				System.out.println((char)data);				//File{Input|Ouput}{Reader|Writer} 단에서 지원
				fw.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if(fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
