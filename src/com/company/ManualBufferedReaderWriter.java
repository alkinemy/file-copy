package com.company;

import java.io.*;

public class ManualBufferedReaderWriter {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		char[] buffer = new char[128];
		try(Reader reader = new FileReader("/Users/joke/Downloads/hello.txt");
			Writer writer = new OutputStreamWriter(System.out, "UTF-8")) {

			int count;
			while((count = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, count);
			}
			writer.flush();

			long end = System.currentTimeMillis();

			System.out.println("Manually buffered: " + (end - start));
		}
	}

}
