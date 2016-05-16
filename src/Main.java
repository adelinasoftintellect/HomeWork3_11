import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type a number");
		int number = 1;
		int a = scanner.nextInt();
		System.out.println("Please, enter number a ;");

		do {
			System.out.println("Number is: " + number);

			number++;

		} while (number <= a);

		scanner.close();
	}
}
