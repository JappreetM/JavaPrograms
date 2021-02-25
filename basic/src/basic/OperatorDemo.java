package basic;

public class OperatorDemo {

	
	/*
	 * Arithmetic +,-, *, /, %
	 * Bitwise
	 * Relational
	 * Logical
	 *  
	 */
	public static void main(String[] args) {
		
		int m = 6 , n=4 , s=6;
		int r1 = m+n; //10
		int r2  = m-n; //2
		int r3 = m/n;  // 1
		double r5 = (double)m/n; //1.5
		
		int r4 = m% n;   //2
		
		n+=m; // same as n = n+m
		n++; // n = n +1 post increment
		++n; // pre increment	
		
		int t = ++m;
		int t2 = s++; 
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(n);
		System.out.println(t);
		System.out.println(m);
		
		System.out.println(t2);
		System.out.println(s);




	}

}
