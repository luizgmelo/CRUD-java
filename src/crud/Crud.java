package crud;

public interface Crud {
	void writePost(String post);
	void readPost(int postNumber);
	void updatePost(int postNumber, String post);
	void deletePost(int postNumber);
}
