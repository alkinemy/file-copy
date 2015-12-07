package com.company;

import java.nio.ByteBuffer;

public class ByteToInteger {
	public static void main(String[] args) {
		int input = 128371837;
		System.out.println("Expected output: " + input);
		byte[] bytes = showAnswer(input);
		convert4ByteToInteger(bytes);
	}

	private static void convert4ByteToInteger(byte[] bytes) {
		int output = 0;
		for(int i = 0; i < bytes.length; i++) {
			byte b = bytes[3 - i];
			output += convertByteToInteger2(b, i);
		}
//		for(int i = 3; i >= 0; i--) {
//			byte b = bytes[i];
//			output += convertByteToInteger(b, i);
//		}
		System.out.println("Actual output: " + output);
	}

	private static int convertByteToInteger2(byte b, int i) {
		int output = (int) b & 0xff;
		return output << (4 * i * 2);
	}

	private static int convertByteToInteger(byte b, int pos) {
		int output = (int) b & 0xff;
		return (int) (output * Math.pow(16, Math.abs(pos - 3) * 2));
	}

	public static byte[] showAnswer(int i) {
		byte[] bytes = ByteBuffer.allocate(4).putInt(i).array();

		System.out.print("Input: ");
		for (byte b : bytes) {
			System.out.format("0x%x ", b);
		}
		System.out.println();
		return bytes;
	}
}
