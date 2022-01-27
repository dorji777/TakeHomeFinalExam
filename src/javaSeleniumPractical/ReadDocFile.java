package javaSeleniumPractical;

import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadDocFile {

	public static void main(String[] args) {

		doesFileExist();
		
		
		try {
			Path path = Paths.get("src\\documents\\NotePadText");
			File obj = path.toFile();
			Scanner scn= new Scanner(obj);
		while (scn.hasNextLine()) {
			String data = scn.nextLine();
			System.out.println(data);	
		} 
		scn.close();			
		
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		

	}

	public  static void doesFileExist() {

		Path path = Paths.get("src\\documents\\NotePadText");
		File f= path.toFile();
		
		if (f.exists()) {
			System.out.println("File Name :"+ f.getName());
			System.out.println("Absoluth path :" + f.getAbsolutePath());
			System.out.println("Writeable :" + f.canWrite());
			System.out.println("Readable :" + f.canRead());
			System.out.println("File size in bytes : " + f.length());
			System.out.println("File exists :");
			
			
		}
	}

}
