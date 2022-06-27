package com.yash;

import java.util.Scanner;

public class PermutationsQ14 {

	static void PermutationsQ14(String perm, String word) {
	if (word.isEmpty()) {
	System.out.println(perm + word);
	System.out.println();
	} else {
	for (int i = 0; i < word.length(); i++) {

	 PermutationsQ14(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
	}
	}

	 }

	 public static void PermutationsQ14(String input) {
	PermutationsQ14(" ", input);
	}

	 public static void main(String[] args) {

	 PermutationsQ14("ABCD");
	}

	}



