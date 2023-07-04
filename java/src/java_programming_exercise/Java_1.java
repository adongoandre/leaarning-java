package java_programming_exercise;
import java.util.Scanner;
public class Java_1 {
	public static void main(String[] args) {
		Scanner random = new Scanner(System.in);
		System.out.println("Enter a number ");
		int ranNum = random.nextInt();
		if(ranNum%2==0) {
			System.out.println(ranNum + " is an even number");
		}
		else {
			System.out.println(ranNum + " is an odd number");
		}
	}
}