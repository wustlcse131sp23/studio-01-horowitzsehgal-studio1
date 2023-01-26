package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double average;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int n1 = in.nextInt();
		System.out.println("Please enter an integer");
		int n2 = in.nextInt();
		average = (n1 + n2)/2.0;
		System.out.println("The average of your two values is: " + average);
		// TODO Auto-generated method stub

	}

}
