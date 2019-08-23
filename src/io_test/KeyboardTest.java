package io_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		// 기반스트림(표준입력 : stdin, System.in) (키보드와 모니터는 표준입력이다)
		BufferedReader br = null;
		try {
			// 보조 스트림1 : byte|byte|byte -> char
			InputStreamReader isr = new InputStreamReader(System.in);

			// 보조스트림2
			//char|char|char|\n -> "char1char2char3"
			br = new BufferedReader(isr);

			// read
			String line = null;
			int index = 0;
			while( (line = br.readLine()) != null){
				if("exit".equals(line)) {
					break;
				}

				System.out.println(">>" + line);
			}
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
