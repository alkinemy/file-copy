package com.company;

import java.io.*;

public class BufferedReaderWriter {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		try(BufferedReader reader = new BufferedReader(new FileReader("/Users/joke/Downloads/hello.txt"));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out, "UTF-8"))) {

			String data;
			while((data = reader.readLine()) != null) {
				writer.write(data);
				writer.newLine();
			}
			writer.flush();

			long end = System.currentTimeMillis();

			System.out.println("Supported buffered: " + (end - start));
		}
	}

}
