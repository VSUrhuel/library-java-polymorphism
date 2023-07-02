public class LibraryMember
{
	private String name;

	public LibraryMember(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean borrow(Book book, BorrowRecords borrowRecords)
	{
		if(!borrowRecords.isAvailable(book) || book instanceof FilipinianaMaterial)
			return false;
		((Borrowable)book).borrow(this, borrowRecords);
		return true;
	}
	@Override
	public String toString()
	{
		return "\nBorrow Records: \n";
	}
}