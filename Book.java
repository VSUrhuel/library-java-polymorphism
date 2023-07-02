import java.util.*;
public abstract class Book
{
	private String title;
	private int publicationYear;
	private List<Author> authors;

	public Book(String title, Author mainAuthor, int publicationYear)
	{
		this.title = title;
		this.authors = new ArrayList<Author>();
		this.authors.add(mainAuthor);
		this.publicationYear = publicationYear;
	}
	public Book(Book book)
	{
		this.title = book.title;
		this.publicationYear = book.publicationYear;
		this.authors = new ArrayList<Author>(book.authors);
	}
	public String getTitle()
	{
		return this.title;
	}
	public int getPublicationYear()
	{
		return this.publicationYear;
	}
	public List<Author> getAuthors()
	{
		return new ArrayList<Author>(this.authors);
	}
	public void addAdditionalAuthor(Author author)
	{
		this.authors.add(author);
	}
	@Override
	public String toString()
	{
		String text = this.title + "(" +this.publicationYear+ ") by ";
		for(Author a : authors)
		{
			text += a;
			if(!a.equals(this.authors.get(this.authors.size()-1)))
				text += ", ";
		}
		return text + " ";
	}


}