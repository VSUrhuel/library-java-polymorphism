import java.util.*;
public class BorrowRecords
{
	private HashMap<Book, LibraryMember> records;

	public BorrowRecords()
	{
		this.records = new HashMap<Book, LibraryMember>();
	}
	public boolean isAvailable(Book book)
	{
		return !records.containsKey(book);
	}
	public int getNumberOfBooksBorrowed(LibraryMember member)
	{
		return records.size();
	}
	public void addBorrowingRecord(Book book, LibraryMember member)
	{
		this.records.put(book, member);
	}
	public void returnBorrowedBook(Book book)
	{
		this.records.remove(book);
	}
	@Override
	public String toString()
	{
		String str = "";
		for(HashMap.Entry<Book, LibraryMember> r : records.entrySet())
		{
			str += r.getValue();
			str += r.getKey() +"\n";
		}
		return str;
	}

}