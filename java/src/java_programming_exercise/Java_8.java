package java_programming_exercise;
import java.util.Scanner;
public class Java_8 {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
		System.out.println("Enter 5 different numbers ");
			int num1 = numbers.nextInt();
			int num2 = numbers.nextInt();
			int num3 = numbers.nextInt();
			int num4 = numbers.nextInt();
			int num5 = numbers.nextInt();
		int[] array = new int[5];
		array[0]= num1;
		array[1]= num2;
		array[2]= num3;
		array[3]= num4;
		array[4]= num5;
		
		int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
		for(int number:array) {
			if (number > highest) {
                secondHighest = highest;
                highest = number;
            } else if (number > secondHighest && number < highest) {
                secondHighest = number;
            }
			System.out.print(number + " ");
		}
		System.out.println("These are the numbers you entered. The second highest number is: " + secondHighest);
	}
}
