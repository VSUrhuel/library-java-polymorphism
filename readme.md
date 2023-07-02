# Library
### Problem Created by Sir Jomari Joseph Barera - Instructor at VSU

A **Novel** is a Book that can be borrowed only 10 times. It can only be borrowed if it is available based on the BorrowRecords. A LibraryMember can only borrow a maximum of 3 different books. When a LibraryMember borrows successfully any book, the BorrowRecords should be updated by adding a borrowing record.

![Library UML Diagram](https://photos.app.goo.gl/QWB4YDYTgAQsEPxG8)

Given the UML with relationships above, implement the **Novel** class with the following constraints:

1. Implement the Novel class according to the UML above.
2. Declare the attributes of the class Novel according to the UML.
3. For the Novel constructor, initialize the title, mainAuthor, and publicationYear attributes using the constructor of the superclass. Then, initialize the genre attribute by its corresponding parameter while the numTimesBorrowed to 0.
4. For the Novel copy constructor, call the copy constructor of the superclass with the parameter as argument followed by initializing the genre attribute with the parameter's genre attribute value while the numTimesBorrowed is assigned with the value 0.
5. Implement the accessors according to the UML specification.
6. Override the borrow method by applying the necessary procedures stated above. If the borrow transaction is executed successfully it must return true, otherwise return false. Update the necessary attributes based on the specification.
Override the toString method using the code snippet below:
	@Override
	public String toString()
	{
	return "[N:" + this.numTimesBorrowed + "] " + super.toString();
	}

Implement the **Book** abstract class with the following contraints:

1. Implement the Book abstract class according to the UML above.
2. Declare the attributes of the abstract class Book according to the UML.
3. For the Book constructor, initialize the authors collection and append the mainAuthor paramater object as its first author. Then, initialize the title and publicationYear attributes using their corresponding parameters.
4. For the Book copy constructor, initialize the title and publicationYear attributes based on the equivalent attributes from the parameter object while for the authors attribute, just copy the object collection of the authors attribute from the parameter object.
5. Implement the accessors according to the UML specification with the getAuthors method only returning a copy of the object held by the authors attribute.
Implement the addAdditionalAuthor method by adding the parameter as an element of the authors attribute (object collection).
6. Override the toString method using the code snippet below:
	@Override
	public String toString()
	{
	String text = this.title + "(" + this.publicationYear + ") by ";
	for(Author a : this.authors)
	{
	text += a;
	if(!a.equals(this.authors.get(this.authors.size()-1)))
	text += ", ";
	}
	return text + " ";
	}

For the **LibraryMember** class, a LibraryMember can borrow any books as long as it is Borrowable. A successful transaction of book borrowing by a LibraryMember will always depend on the result after executing the borrow method call from a Borrowable book. Implement the class with thefollowing constraints:

1. Implement the LibraryMember class according to the UML above.
2. Declare the attributes of the class LibraryMember according to the UML.
3. For the LibraryMember constructor, initialize its attributes based from the parameter given.
4. Implement the accessor according to the UML specification.
5. Implement the borrow method by applying the specifications stated above. If a borrow transaction succeeds, a true value will return, otherwise, it will return false.

Author, BorrowRecords, FilipinianaMaterial, PhilippineIslandGroup, Genre, and Textbook class were implemented based on the UML presented.  

### This problem was a Mock Laboratory Exam at Java OOP for Final Laboratory Exam covering Inheritance and Polymorphism.