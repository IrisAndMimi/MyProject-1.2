package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
		try{
			FileOutputStream out = new FileOutputStream("data.txt");
			out.write(65);
			out.flush();
			out.close();
		}catch(FileNotFoundException e){
			System.out.println("找不到檔案啦啦啦");
		} catch (IOException e) {
			System.out.println("寫錯東西囉");
		}
	}

}
