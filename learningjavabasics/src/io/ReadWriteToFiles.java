package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteToFiles {
	
	private final String fileName = "C:/Temp/sample.txt";
	private final String fileName2 = "C:/Temp/sample2.txt";
	
	public void writeToFileStream() {
		System.out.println("Write To File via Stream Begin");
		FileOutputStream fStr = null;
		String bytesStr = "hello there my people||==++";
		byte [] buffer = bytesStr.getBytes(); // need to convert to bytes
		try {
			fStr = new FileOutputStream(fileName2);
			fStr.write(buffer);
			fStr.flush(); // remember to flush. always do this even in real life.
			fStr.close(); // always close.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write To File via Stream End");
	}
	
	public void readFileStream() {
		
		System.out.println("Read File via Stream Begin");
		FileInputStream fStr = null;
		byte [] buffer = new byte[100];// you control the length of each read.
		try {
			fStr = new FileInputStream(fileName2);
			int nRead = 0;
			while((nRead = fStr.read(buffer)) != -1) {
				System.out.println(new String(buffer));// need to change it back to a string
			}
			fStr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Read File via Stream End");
	}
	
	public void writeToFileBuffered() throws IOException {
		/*
		 * Buffer writer used when writing normal text to a normal file.
		 * If needing weird characters use file output stream.
		 */
		System.out.println("Write To File Begin");
		FileWriter fWrite = null;
		BufferedWriter bWrite = null;
		try {
			fWrite = new FileWriter(fileName);
			bWrite = new BufferedWriter(fWrite);
			bWrite.write("Carlo");
			bWrite.newLine();//to signal the writer to go to the next line.
			bWrite.write("Paulo");
			bWrite.newLine();
			bWrite.write("Tolentino");
			bWrite.newLine();
			bWrite.write("Testing only. Ok");
			bWrite.newLine();
			bWrite.flush();


			bWrite.close();
			fWrite.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Write To File Completed");
	}
	
	public void readFileBuffered() {
		/*
		 * Buffer reader is used when reading an ordinary txt file.
		 * For files containing wierd characters you will need to use
		 * a file input stream.
		 */
		System.out.println("Read File Begin");
		FileReader fR = null;
		BufferedReader bR = null;
		try {
			fR = new FileReader(fileName);
			bR = new BufferedReader(fR);
			String line = null;
			while((line = bR.readLine())!= null) {
				System.out.println(line);
			}
			bR.close();
			fR.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Read File End");
	}

	public static void main(String[] args) {
		ReadWriteToFiles rF = new ReadWriteToFiles();
		try {
			rF.writeToFileBuffered();
			rF.readFileBuffered();
			rF.writeToFileStream();
			rF.readFileStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
