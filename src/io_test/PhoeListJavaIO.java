package io_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoeListJavaIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;

		File file = new File("phone.txt");
		if(!file.exists()) {
			System.out.println("File Not Found");
			return;
		}

		System.out.println("=====================");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "bytes");
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
		System.out.println("\n");

		// 기반스트림
		try {
			FileInputStream fis = new FileInputStream(file);

			// 보조스트림1(bytes->char)
			InputStreamReader isr = new InputStreamReader(fis);

			// 보조스트림2(chars\n -> String)
			br = new BufferedReader(isr);

			String line;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t ");			//탭과 스페이스를 divider로 사용
				int index = 0;
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token);

					if(index == 0) {		//이름
						System.out.print(":");
					}else if(index == 1) {	//번호1
						System.out.print("-");
					}else if(index == 2) {	//번호2
						System.out.print("-");
					}
					//System.out.println(line);		
					index++;
				}
				System.out.println("");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error : " + e);
		} finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end finally
	}

}
