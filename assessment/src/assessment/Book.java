package assessment;

public class Book {

	String name;
	double price;
	int qty;
	String author;
	Book(String name,String author,double price,int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
		System.out.println("Book details:");
		System.out.println("name is :"+name);
		System.out.println("price is :"+price);
		System.out.println("qty is :"+qty);
		System.out.println("Author is :" +author);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
