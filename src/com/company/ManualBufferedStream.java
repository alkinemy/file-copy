package com.company;

import java.io.*;

public class ManualBufferedStream {

    public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		byte[] buffer = new byte[128];
		for (int i = 0; i < 10; i++) {
			try (InputStream inputStream = new FileInputStream("/Users/joke/Downloads/hello.txt");
				OutputStream outputStream = new FileOutputStream("/Users/joke/Downloads/xxxx" + i + ".xlsx")) {
				int count;
				while ((count = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, count);
				}
			}
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}
}
