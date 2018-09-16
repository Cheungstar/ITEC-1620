
public class Book 
{
	private String title, author, publisher, copyRightDate;
	
	//constructor: set up a book with the title, author, publisher, and copy right date
	public Book(String name, String writer, String publish, String date)
	{
		title = name;
		author = writer;
		publisher = publish;
		copyRightDate = date;		
	}
	
	//sets the title of the book object
	public void setTitle(String name)
	{
		title = name;
	}
	
	//gets the title of the book object
	public String getTitle()
	{
		return title;
	}
	
	//sets the author of the book
	public void setAuthor(String writer)
	{
		author = writer;
	}
	
	//gets the author of the book
	public String getAuthor()
	{
		return author;
	}
	
	//sets the publisher of the book
	public void setPublisher(String publish)
	{
		publisher = publish;
	}
	
	//gets the publisher of the book
	public String getPublisher()
	{
		return publisher;
	}
	
	//sets the copyright date of the book
	public void setCopyRightDate(String date)
	{
		copyRightDate = date;
	}
	
	//gets the copy right date of the book
	public String getCopyRightDate()
	{
		return copyRightDate;
	}
	
	//create a to string method to describe the book in multiple lines
	public String toString()
	{
		return "Book Title: " + title + "\n" + "Author Name: " + author + "\n" + "Publisher: " + publisher + "\n" + "Copyright Date: " + copyRightDate;
	}
}
