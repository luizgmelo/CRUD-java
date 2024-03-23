package crud;

import java.util.ArrayList;

public class Client implements Crud {

	private String name;
	private int numPosts;
	private ArrayList<String> posts;
	
	
	public Client(String name, ArrayList<String>posts) {	
		this.name = name;
		this.posts = posts;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void writePost(String post) {
		this.posts.add(post);
		System.out.println("POST CREATED NUMBER: " + this.numPosts);
		this.numPosts++;
	}

	@Override
	public void readPost(int postNumber) {
		if (postNumber < 0 || postNumber >= posts.size()) {
			System.out.println("INVALID POST NUMBER");
		} else {
			System.out.println(posts.get(postNumber));
		}
	}

	@Override
	public void updatePost(int postNumber, String newPost) {
		if (postNumber < 0 || postNumber >= posts.size()) {
			System.out.println("INVALID POST NUMBER");
		} else {
			this.posts.set(postNumber, newPost);
			System.out.println("POST NUMBER" + postNumber + " MODIFIED");	
		}
	}

	@Override
	public void deletePost(int postNumber) {
		if (postNumber < 0 || postNumber >= posts.size()) {
			System.out.println("INVALID POST NUMBER");
		} else {
			this.posts.remove(postNumber);
			System.out.println("POST NUMBER " + postNumber + " REMOVED");
		}
	}
	
	
}
