package ahmet;

public class diziler {

	public static void main(String[] args) {

		int[][] matris = {  
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 }, 
				{ 10, 11, 12 } 
				};
		for (int[] is : matris) {
			for (int is2 : is) {
				System.out.print(is2+" ");
				
			}
			System.out.println();
			
		}
	}

}
