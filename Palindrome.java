package assignment.w1d3;

import java.util.Scanner;

public class Palindrome {

		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Prompting user for input
	        System.out.println("Enter a number:");
	        int output = input.nextInt();

	        // Checking if input is a palindrome
	        if (isPalindrome(output)) {
	            System.out.println("The input number is a palindrome.");
	        } else {
	            System.out.println("The input number is not a palindrome.");
	        }

	        input.close();
	    }


	    public static boolean isPalindrome(int num) {
	        int originalNum = num;
	        int reversedNum = 0;

	        for (int i = num; i > 0; i /= 10) {
	            int rem = i % 10;
	            reversedNum = reversedNum * 10 + rem;
	        }

	        // Checking if the reversed number is equal to the original number
	        return originalNum == reversedNum;
	    }
	}


