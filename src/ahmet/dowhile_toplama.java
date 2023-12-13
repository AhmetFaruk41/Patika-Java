package ahmet;

import java.util.Scanner;

public class dowhile_toplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int toplam = 0;

		do {
			System.out.println("sayı giriniz: ");
			int sayi = input.nextInt();

			if (sayi != 0) {
				toplam = toplam + sayi;
			} else {
				System.out.println("toplam: " + toplam);
				break;
			}
		} while (true);
	}

}
