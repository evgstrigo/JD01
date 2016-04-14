package Lesson7;

public class Book {
	String title;
	int year;
	String author;
	int price;
	boolean isOnStore;
	
	public  void print(Book b1){
		System.out.println("Название: " + b1.title);
		System.out.println("Год издания: " + b1.year);
		System.out.println("Автор: " + b1.author);
		System.out.println("Цена: " + b1.price);
	}
	
	public Book(){
		
	}
	
	public Book(String title, int year, String author, int price){
		setTitle(title);
		setYear(year);
		setAuthor(author);
		setPrice(price);
	}	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isOnStore() {
		return isOnStore;
	}
	
	public void setOnStore(boolean isOnStore) {
		this.isOnStore = isOnStore;
	}
	
}
