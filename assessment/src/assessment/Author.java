package assessment;

public class Author {
public static void main(String[] args) {
	
	 String name="java for dummies";
	 String email="James@IBM.com";
	 char gender='m';
	 String author="james gosling";
	 System.out.println("Author details:");
	 System.out.println(name+" by " +author+" at "+email);
	 
	 
	 Book b=new Book(name ,author,8.88,88);
	

}
	
}
