package ahmet;

import java.util.Scanner;

public class carpımTablosu {

	public static void main(String[] args) {
		int satirSayisi = 10;
        int sutunSayisi = 10;

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= sutunSayisi; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        
        
               
        
        
        int boyut = 5; // Baklava deseninin boyutu

        for (int i = 1; i <= boyut; i++) {
            // Boşlukları ekle
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = boyut - 1; i >= 1; i--) {
            // Boşlukları ekle
            for (int j = 1; j <= boyut - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        
        
        
        
        
        
        
        
        
	}

}
