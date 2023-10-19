package ahmet;

public class Recursive {

	
	static int sum (int x) {
		
		int result = 0;
		for (int i = 1; i < x; i++) {
			result+=i;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(4));
		
	}

}
