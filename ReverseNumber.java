package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int reverse =0, num = scanner.nextInt();
		while (num>0)
		{
			reverse = reverse*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse of number "+num+ " is "+reverse);

		scanner.close();
	}

}
