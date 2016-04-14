package Lesson7;

public class main {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("Мы спасем мир", 1998, "Стриго", 120);
		book2.setOnStore(true);
		book1.setOnStore(false);
		book2.print(book2);
	}

}
