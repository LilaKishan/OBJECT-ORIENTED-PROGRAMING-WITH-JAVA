import java.util.Scanner;

class Book
{
	private String author_name="chetan";
	void disply(){
	System.out.println("name of author : "+author_name);
	}
}
class Book_Publication extends Book{
	private String book_title="2states";
	void disply(){
	System.out.println("book title : "+book_title);
	}
}
class Paper_Publication extends Book{
	private String paper_title="asdfg";
	void disply(){
	System.out.println("Paper title : "+paper_title);
	}
}
public class BookDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Book b1 = new Book();
		b1.disply();

		Book_Publication b2 = new Book_Publication();
		b2.disply();

		Paper_Publication b3= new Paper_Publication();
		b3.disply();

	System.out.println("------------------by dyanamic method dispatch-----------------------------");
		Book b4 = new Book_Publication();
		b4.disply();
		Book b5 = new Paper_Publication();
		b5.disply();
	}
}