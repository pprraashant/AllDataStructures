package dataStructures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solutiondivisibledone {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		long noofa = 0;
		long q = n / s.length();
		long n1 = s.length() * q;
		for (int i = 0; i < s.length(); i++)
		{

			if (s.charAt(i) == 'a') {
				noofa++;
			}
		}
		noofa = noofa * q;
		for (int i = 0; i < n - n1; i++) {

			if (s.charAt(i) == 'a') {
				noofa++;
			}
		}

		return noofa;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		System.out.println(result);
		scanner.close();
	}
}
