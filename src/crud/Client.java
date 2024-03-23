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
	
}
