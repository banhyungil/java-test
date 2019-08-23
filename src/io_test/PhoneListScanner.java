package io_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneListScanner {

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
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scanner.hasNextLine()) {
			String name = scanner.next();			//tab이나 space가 divider로 되어있다.
			String phone1 = scanner.next();
			String phone2 = scanner.next();
			String phone3 = scanner.next();
			
			System.out.println(name + ":" + phone1 + "-" + phone2 + "-" + phone3);
		}
		// 기반스트림
		
		if(scanner != null) {
			scanner.close();
		}
	}//end main

}
