package ahmet;

import java.util.Scanner;

public class Polidrom_Sayi {

	static boolean isPalindrom(int number) {
		int temp = number, reverseNember = 0, lastnumber;
		while (temp != 0) {
			System.out.println("===========");
			System.out.println("sayı=> " + temp);
			lastnumber = temp % 10;
			System.out.println("sonbasamak =>" + lastnumber);
			reverseNember = (reverseNember * 10) + lastnumber;
			System.out.println("yenisayı =>" + reverseNember);
			temp /= 10;
		}

		if (number == reverseNember) {
			System.out.println(number + " bir palindromik sayıdır ");

			return true;
		} 
		else {
			System.out.println(number+" bir palindomik sayı değildir");
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz: ");
		int sayi = input.nextInt();
		isPalindrom(sayi);

	}

}
