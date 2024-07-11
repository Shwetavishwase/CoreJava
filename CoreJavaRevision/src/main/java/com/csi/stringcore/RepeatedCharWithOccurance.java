package com.csi.stringcore;

import java.util.Arrays;

public class RepeatedCharWithOccurance {

	public static void main(String[] args) {

		String name = "ahemednagar";

		char[] str = name.toCharArray();

		Arrays.sort(str);

		System.out.println(str);

		for (int i = 0; i < name.length(); i++) {
			char tempChar = str[i];

			int count = 1;

			for (int j = i + 1; j < name.length(); j++) {
				if (tempChar == str[j]) {
					count++;
					i++;
				}
			}
			if (count > 1) {
				System.out.println("" + tempChar + ":" + count);
			}
		}
	}
}
