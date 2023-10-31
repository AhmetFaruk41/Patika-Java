package ahmet;

import java.util.Scanner;

public class gosterge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int toplam=0;
		while (true) {
			System.out.println("sayı giriniz: ");
			int sayi = input.nextInt();
			if (sayi!=0) {
				
				toplam=toplam+sayi;
				
			}
			else {
				System.out.println("toplam: "+toplam);
				break;
			}
			
		}

	}

}
