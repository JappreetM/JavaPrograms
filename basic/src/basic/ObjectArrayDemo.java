package basic;

import java.util.Scanner;

class Product{
	// class variable
	
	public int pid;
	public String name;
	public int qty;
	public double price;
	
	// Parameterized constructor
	
	public Product(int pid, String name, int qty, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	
	
	}

public class ObjectArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Array Size: ");
		int size = sc.nextInt();
		Product[] products= new Product[size];
		Product product = null;
		System.out.println("Enter product array elements");
		for(int i=0; i<size; ++i) {
			System.out.println("Enter product id: ");
			int pid = sc.nextInt();
			System.out.println("Enter product name: ");
			String name = sc.next();
			System.out.println("Enter product quantity: ");
			int qty = sc.nextInt();
			System.out.println("Enter product price: ");
			double price = sc.nextDouble();
			
			product = new Product(pid,name,qty,price);
			products[i] = product;
					
		}
			
		System.out.println("Product List: ");
		for(Product p:products) {
			System.out.println(p.pid+"\t"+p.name+"\t"+p.qty+"\t"+p.price);
		}
			

	}

}
