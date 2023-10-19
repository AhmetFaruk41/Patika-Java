package ahmet;

import java.util.Iterator;

public class ahmet1 {
	
	static void helloWorld() {
		System.out.println("merhaba dünya");
	}

	static int power(int base, int exp) {
		int result = 1;
		for (int i = 1; i <=exp; i++) {
			result *= base;
		}

		return result;

	}

	public static void main(String[] args) {
		
		
		int case1= power(2, 3);
		System.out.println(case1);
	}

}
