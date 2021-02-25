package basic;

public class DataTypesNVariables {

	public static void main(String[] args) {
		long l = 500000000l; // 8 bytes
		int i = 5; // 4 bytes
		short s = 5; // 2 bytes
		byte b = 5; // 1 byte
		float f = 5.5f; // 4 bytes
		double d = 5.5;
		
		char c = 'A';
		c = 66; // ASCII
		
		System.out.println(c);
		
		double d1 = 5; // implicit conversion(assign int value to double it is coverted to double)
		System.out.println(d1);
		
		int k = (int)5.5;
		System.out.println(k); // explicit type conversion

	}

}
