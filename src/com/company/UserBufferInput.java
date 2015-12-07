package com.company;

import java.io.*;

public class UserBufferInput {

    public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		byte[] buffer = new byte[128];
		for (int i = 0; i < 10; i++) {
			try (InputStream inputStream = new FileInputStream("/Users/joke/Downloads/2015.12 온라인 과정 목록_공지용.xlsx");
				OutputStream outputStream = new FileOutputStream("/Users/joke/Downloads/xxxx" + i + ".xlsx")) {
				while (inputStream.read(buffer) != -1) {
					outputStream.write(buffer);
				}
			}
		}
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}
}
