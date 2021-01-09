package day7.file_handling;

import java.io.*;

// writing into file
public class Example2 {

	public static void main(String[] args) {
		try {
		FileWriter fileWriter = new FileWriter("courses.txt");
		fileWriter.write("Python \n");
		fileWriter.write("Core Java \n");
		fileWriter.write("Advance Java \n");
		fileWriter.close();
		System.out.println("Successfully wrote to the file.");
		
		}catch(IOException  e) {
			System.out.println("Exception Occured:"+e);
		}
	}
}
