
public class Bookshelf 
{
	//create multiple books and uses the methods from the Book class
	
	public void main (String[] args)
	{
		//3 books created with the 4 instance data for each book
		Book book1 = new Book("Java Software Solutions 8th Edition", "John Lewis and William Loftus", "Pearson", "2015");
		Book book2 = new Book("The Adventures of Captain Underpants", "Dav Pilkey", "Scholastic Inc.", "1997");
		Book book3 = new Book("Artemis Fowl", "Eoin Colfer", "Scholastic Inc.", "2001");
		
		book1.setAuthor("Noctis Caelum");
		book1.setTitle("Final Fantasy XV");
		book2.setPublisher("The Machines");
		book2.setCopyRightDate("3000");
		book2.getAuthor();
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		
	}
}
