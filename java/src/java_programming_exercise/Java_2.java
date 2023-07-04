package java_programming_exercise;
import java.util.Scanner;
public class Java_2 {
	public static void main(String [] args) {
		Scanner random = new Scanner(System.in);
		System.out.println("Enter an integer ");
		int num = random.nextInt();
		if(num / 5 == 3 && num / 3 == 5) {
			System.out.println(num + " is a multiple of both 3 and 5");
		}
		else {
			System.out.println(num + " is not a multiple of both 3 and 5");
		}
	}
}
 