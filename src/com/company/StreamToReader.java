package com.company;

import java.io.*;

public class StreamToReader {

	public static void main(String[] args) throws IOException {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/joke/Downloads/hello.txt")));
			PrintWriter writer = new PrintWriter(System.out)) {

			String line;
			while((line = reader.readLine()) != null) {
				writer.println(line);
			}
		}
	}

}
