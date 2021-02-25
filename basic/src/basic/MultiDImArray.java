package basic;

import java.util.Scanner;

public class MultiDImArray {

	public static void main(String[] args) {
//		int[][] arr= {{1,2,3},{4,5,6}, {7,8,9}};
//		System.out.println(arr[0][2]);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for 2D array: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols for 2D array: ");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The array you entered is: ");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}

		System.out.println("The row sum of array you entered is: ");
		for (int i = 0; i < rows; ++i) {
			int sum = 0;
			for (int j = 0; j < cols; ++j) {
				System.out.print(arr[i][j] + "   ");
				sum += arr[i][j];
			}
			System.out.println(" = " + sum);
		}

		System.out.println("The diagonal sum of array you entered is: ");
		int sum = 0;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (i == j)
					System.out.print(arr[i][j] + "   ");
				sum += arr[i][j];
			}
		}
		System.out.println(" = " + sum);

	}

}
