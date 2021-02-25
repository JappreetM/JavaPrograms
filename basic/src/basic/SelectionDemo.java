package basic;

public class SelectionDemo {
	
	/*
	 * if
	 * ternary
	 * switch
	 */

	public static void main(String[] args) {

		int n = 7;
		if (n==0)
			System.out.println("It is a zero neither odd nor even");
		else if (n%2==0)
			System.out.println("Even Number");
		
		else
			System.out.println("Odd Number");
	}

}
