package crud;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			System.out.println("\nSOCIAL MEDIA POSTS");
			System.out.println("Options\n1: Write a post\n2: Read Posts\n3: Update Post\n4: Delete Post\n5: Exit\n");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Your option: ");
			Integer option = scanner.nextInt();
			System.out.print("\n");
			if (option < 1 || option > 5) {
				System.out.println("Ivalid Option!!!");
			} else if (option == 5) {
				System.out.println("End");
				break;
			}
		}
		
	}

}
