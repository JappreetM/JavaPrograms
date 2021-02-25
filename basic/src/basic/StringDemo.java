package basic;

public class StringDemo {

	public static void main(String[] args) {
		String str = "This is a string class";
		System.out.println("String size: " + str.length());
		System.out.println("First character of string: " + str.charAt(0));
		System.out.println("First index of 'c': " +str.indexOf('c'));
		System.out.println("Uppar case: " +str.toUpperCase());
		System.out.println("Lower case: " +str.toLowerCase());
		System.out.println("Find a substring 'is': " +str.contains("is"));
		System.out.println("Return a substring starting at index 4 ending at 13: " +str.substring(4,13));
		System.out.println("Replace a substring: " +str.replace("is", "was"));
	}

}
