package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> posts = new ArrayList<String>();
		Client c = new Client("Guilherme", posts);
		
		while (true) {
			System.out.println("\nSOCIAL MEDIA POSTS");
			System.out.println("Options\n1: Write a post\n2: Read Posts\n3: Update Post\n4: Delete Post\n5: List Posts\n6: Exit\n");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Your option: ");
			Integer option = scanner.nextInt();
			Integer postNumber;
			System.out.print("\n");
			switch(option) {
				case 1:
					System.out.print("Write your post here: ");
					scanner.nextLine();
					String post = scanner.nextLine();
					c.writePost(post);
					break;
				case 2:
					scanner.nextLine();
					System.out.print("Type your post number: ");
					postNumber = scanner.nextInt();
					System.out.print("\n");
					c.readPost(postNumber);
					break;
				case 3:
					scanner.nextLine();
					System.out.print("Type your post number: ");
					postNumber = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Type your new post: ");
					String newPost = scanner.nextLine();
					System.out.print("\n");
					c.updatePost(postNumber, newPost);
					break;
				case 4:
					scanner.nextLine();
					System.out.print("Type your post number: ");
					postNumber = scanner.nextInt();
					System.out.print("\n");
					c.deletePost(postNumber);
					break;
				case 5:
					c.listPosts();
					break;
				case 6:
					break;
				default:
					System.out.println("Invalid Option!!!");
					break;
			}

			if (option == 6) {
				System.out.println("End");
				break;
			}
		
			
		}
		
		
	
	}

}
