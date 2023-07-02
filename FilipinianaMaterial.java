public class FilipinianaMaterial extends Book
{
	private PhilippineIslandGroup islandGroupOrigin;

	public FilipinianaMaterial(String title, Author mainAuthor, int publicationYear, PhilippineIslandGroup islandGroupOrigin)
	{
		super(title, mainAuthor, publicationYear);
		this.islandGroupOrigin = islandGroupOrigin;
	}
	public PhilippineIslandGroup getIslandGroupOrigin()
	{
		return this.islandGroupOrigin;
	}
}