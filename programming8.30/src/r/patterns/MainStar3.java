package r.patterns;

import java.util.Scanner;

public class MainStar3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value: ");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) // no of lines
		{
			for (int j = 1; j <= n - i; j++) // no of spaces
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) // no of stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}