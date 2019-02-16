package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewIOJavaOnePointSeven {
	/*
	 * This is a review on the NIO2 File API introduced in Java 1.7.
	 * Basic file manipulation.
	 */
	
	private final String fileName = "C:/Temp/sample.txt";
	private final String fileName7 = "C:/Temp/sample7.txt";
	private Path p = Paths.get(fileName);
	private Path p2 = Paths.get(fileName7);
	
	public void filesNioTwoSamples() throws IOException {
		
		System.out.println(fileName +" exist: "+Files.exists(p));
		System.out.println(fileName +" Last TimeStamp: "+ Files.getLastModifiedTime(p));
		System.out.println(fileName +" Owner: "+ Files.getOwner(p));
	}
	
	public void filesManipulation() throws IOException {
		Files.deleteIfExists(p2);
		BufferedReader bR = Files.newBufferedReader(p);
		String curLine = null;
		System.out.println("=Reading file cotents using new buffer reader:");
		while ((curLine = bR.readLine() ) != null) {
			System.out.println(curLine);
		}
		/* Nio 2 simplified file reading*/
		System.out.println("=Reading file cotents using read all lines:");
		List <String> content = Files.readAllLines(p);
		for(String con : content) {
			System.out.println(con);
		}
	}
	
	public static void main (String [] args) {
		NewIOJavaOnePointSeven n = new NewIOJavaOnePointSeven();
		try {
			n.filesNioTwoSamples();
			n.filesManipulation();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
