package in.co.cg.fileexistence;

import java.io.File;
import java.util.Scanner;

//class to check is file exist or not
public class CheckFileExist {
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		String path;
		System.out.println("Enter file path");
		path = get.next();// file path

		File file = new File(path); // passing path to file

		if (file.exists() && !file.isDirectory()) {// checking for existence
			System.out.println("File Exist!!!");
		} else {
			System.out.println("File does'nt Exist!!");
		}
		get.close();
	}
}
