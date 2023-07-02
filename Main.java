public class Main
{
	public static void main(String[] args) {
		/*
		//results were commented
		Author a = new Author("Coelho", "Paulo");
		Novel j = new Novel("The Alchemist", a, 1988, Genre.Fantasy);
		System.out.println(j.getGenre());  //Fantasy

		Author a3 = new Author("Pratchett", "Terry");
		Author a4 = new Author("Gaiman", "Neil");
		Novel m = new Novel("Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch", a3, 1990, Genre.ScienceFiction);
		m.addAdditionalAuthor(a4);
		System.out.println(m.getNumTimesBorrowed());  //0

		Author a1 = new Author("Pratchett", "Terry");
		Author a2 = new Author("Gaiman", "Neil");
		Novel n = new Novel("Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch", a1, 1990, Genre.ScienceFiction);
		n.addAdditionalAuthor(a2);
		System.out.println(n.getNumTimesBorrowed());

		BorrowRecords logs = new BorrowRecords();
		LibraryMember[] members = new LibraryMember[4];
		members[0] = new LibraryMember("Juan");
		members[1] = new LibraryMember("Anita");
		members[2] = new LibraryMember("Eliza");
		members[3] = new LibraryMember("Klay");

		System.out.println();
		System.out.println(n.borrow(members[0], logs));
		System.out.println(n.borrow(members[1], logs));
		System.out.println(n.getNumTimesBorrowed());

		System.out.println();
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[1], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[2], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[3], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[1], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[3], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[1], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[2], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[3], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[2], logs));
		logs.returnBorrowedBook(n);
		System.out.println(n.borrow(members[1], logs));
		System.out.println(n.getNumTimesBorrowed());
		/*
		0

		true
		false
		1

		true
		true
		true
		true
		true
		true
		true
		true
		true
		false
		10*/
		/*
		Author a5 = new Author("Pratchett", "Terry");
		Author a6 = new Author("Gaiman", "Neil");
		Novel l = new Novel("Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch", a5, 1990, Genre.ScienceFiction);
		l.addAdditionalAuthor(a6);
		System.out.println(l);*/
		/*
		Author a1 = new Author("Pratchett", "Terry");
		Author a2 = new Author("Gaiman", "Neil");
		Novel n = new Novel("Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch", a1, 1990, Genre.ScienceFiction);
		n.addAdditionalAuthor(a2);
		System.out.println(n);

		BorrowRecords logs = new BorrowRecords();
		LibraryMember[] members = new LibraryMember[4];
		members[0] = new LibraryMember("Juan");
		members[1] = new LibraryMember("Anita");
		members[2] = new LibraryMember("Eliza");
		members[3] = new LibraryMember("Klay");

		n.borrow(members[0], logs);
		n.borrow(members[1], logs);

		logs.returnBorrowedBook(n);
		n.borrow(members[3], logs);
		logs.returnBorrowedBook(n);
		n.borrow(members[1], logs);
		logs.returnBorrowedBook(n);
		n.borrow(members[2], logs);
		System.out.println(n);
		//[N:0] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		//[N:4] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		*//*
		Author a1 = new Author("Pratchett", "Terry");
		Author a2 = new Author("Gaiman", "Neil");
		Novel n = new Novel("Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch", a1, 1990, Genre.ScienceFiction);
		n.addAdditionalAuthor(a2);
		System.out.println(n);

		BorrowRecords logs = new BorrowRecords();
		LibraryMember[] members = new LibraryMember[4];
		members[0] = new LibraryMember("Juan");
		members[1] = new LibraryMember("Anita");
		members[2] = new LibraryMember("Eliza");
		members[3] = new LibraryMember("Klay");

		n.borrow(members[0], logs);
		n.borrow(members[1], logs);

		logs.returnBorrowedBook(n);
		n.borrow(members[3], logs);
		logs.returnBorrowedBook(n);
		n.borrow(members[1], logs);
		logs.returnBorrowedBook(n);
		n.borrow(members[2], logs);
		System.out.println(n);

		Borrowable n2 = new Novel(n);
		System.out.println(n2);
		//[N:0] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		//[N:4] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		//[N:0] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		*//*
		Author a1 = new Author("Pratchett", "Terry");
		Author a2 = new Author("Gaiman", "Neil");
		Novel n = new Novel("Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch", a1, 1990, Genre.ScienceFiction);
		n.addAdditionalAuthor(a2);
		System.out.println(n);

		BorrowRecords logs = new BorrowRecords();
		LibraryMember[] members = new LibraryMember[4];
		members[0] = new LibraryMember("Juan");
		members[1] = new LibraryMember("Anita");
		members[2] = new LibraryMember("Eliza");
		members[3] = new LibraryMember("Klay");

		n.borrow(members[0], logs);
		n.borrow(members[1], logs);

		logs.returnBorrowedBook(n);
		n.borrow(members[3], logs);
		logs.returnBorrowedBook(n);
		n.borrow(members[1], logs);
		System.out.println(n);

		Borrowable n2 = new Novel(n);
		System.out.println(n2);

		logs.returnBorrowedBook(n);
		n.borrow(members[2], logs);
		n2.borrow(members[1], logs);
		logs.returnBorrowedBook((Book)n2);
		n2.borrow(members[2], logs);
		System.out.println();
		System.out.println(n);
		System.out.println(n2);
		//[N:0] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		//[N:3] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		//[N:0] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.

		//[N:4] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		//[N:2] Good Omens: The Nice and Accurate Prophecies of Agnes Nutter, Witch(1990) by Pratchett, T., Gaiman, N.
		*//*

		Book[] books = new Book[3];
		books[0] = new FilipinianaMaterial("Baybayin: Ang Sinaunang Sulat", new Author("Giro", "Julian"), 1911, PhilippineIslandGroup.Visayas);
		books[1] = new TextBook("Data Structures: A Pseudocode Approach with C", new Author("Gilberg", "Richard"), 1998, "Computer Science");
		books[1].addAdditionalAuthor(new Author("Forouzan", "Behrouz"));
		books[2] = new Novel("The Long Earth: The Long Cosmos", new Author("Pratchett", "Terry"), 2016, Genre.ScienceFiction);
		books[2].addAdditionalAuthor(new Author("Baxter", "Stephen"));

		BorrowRecords logs = new BorrowRecords();
		LibraryMember[] members = new LibraryMember[4];
		members[0] = new LibraryMember("Juan");
		members[1] = new LibraryMember("Anita");
		members[2] = new LibraryMember("Eliza");
		members[3] = new LibraryMember("Klay");

		System.out.println(members[0].borrow(books[0], logs));
		System.out.println(members[0].borrow(books[1], logs));
		System.out.println(members[0].borrow(books[2], logs));
		System.out.println(members[1].borrow(books[1], logs));
		System.out.println(members[1].borrow(books[2], logs));
		/*
		false
		true
		true
		false
		false
		*/

		Book[] books = new Book[6];
		books[0] = new TextBook("Data Structures: A Pseudocode Approach with C", new Author("Gilberg", "Richard"), 1998, "Computer Science");
		books[0].addAdditionalAuthor(new Author("Forouzan","Behrouz"));
		books[1] = new FilipinianaMaterial("Baybayin: Ang Sinaunang Sulat", new Author("Giro", "Julian"), 1911, PhilippineIslandGroup.Visayas);
		books[2] = new Novel("The Long Earth: The Long Cosmos", new Author("Pratchett", "Terry"), 2016, Genre.ScienceFiction);
		books[3] = new FilipinianaMaterial("Kadang-kadang", new Author("Lopez", "Carlos"), 1985, PhilippineIslandGroup.Mindanao);
		books[4] = new TextBook("Understanding The Self", new Author("Cellona", "Michelle"), 2018, "Psychology");
		books[5] = new TextBook("Physics of Atomic Nuclei", new Author("Zelevinsky", "Vladimir"), 2017, "Physics");
		books[5].addAdditionalAuthor(new Author("Volya","Alexander"));

		BorrowRecords logs = new BorrowRecords();
		LibraryMember[] members = new LibraryMember[4];
		members[0] = new LibraryMember("Rene");
		members[1] = new LibraryMember("Carl");
		members[2] = new LibraryMember("Nina");
		members[3] = new LibraryMember("Judy");


		System.out.println(members[0].borrow(books[0], logs));
		System.out.println(members[0].borrow(books[1], logs));
		System.out.println(members[0].borrow(books[2], logs));
		System.out.println(members[0].borrow(books[5], logs));

		System.out.println();
		System.out.println(members[1].borrow(books[0], logs));
		System.out.println(members[1].borrow(books[2], logs));
		System.out.println(members[1].borrow(books[4], logs));
		System.out.println(members[1].borrow(books[5], logs));
		logs.returnBorrowedBook(books[2]);
		logs.returnBorrowedBook(books[5]);
		System.out.println(members[1].borrow(books[2], logs));
		System.out.println(members[1].borrow(books[5], logs));

		System.out.println();
		System.out.println(logs);

		logs.returnBorrowedBook(books[0]);
		logs.returnBorrowedBook(books[2]);
		System.out.println(members[2].borrow(books[0], logs));
		System.out.println(members[3].borrow(books[2], logs));

		System.out.println();
		System.out.println(logs);

		logs.returnBorrowedBook(books[0]);
		logs.returnBorrowedBook(books[2]);
		logs.returnBorrowedBook(books[4]);
		System.out.println(members[1].borrow(books[0], logs));
		System.out.println(members[1].borrow(books[2], logs));
		System.out.println(members[1].borrow(books[4], logs));

		System.out.println();
		System.out.println(logs);
		/*
		true
		false
		true
		true

		false
		false
		true
		false
		true
		true


		Borrow Records:
		Data Structures: A Pseudocode Approach with C(1998) by Gilberg, R., Forouzan, B.

		Borrow Records:
		Physics of Atomic Nuclei(2017) by Zelevinsky, V., Volya, A.

		Borrow Records:
		[N:2]The Long Earth: The Long Cosmos(2016) by Pratchett, T.

		true
		true


		Borrow Records:
		Data Structures: A Pseudocode Approach with C(1998) by Gilberg, R., Forouzan, B.

		Borrow Records:
		Physics of Atomic Nuclei(2017) by Zelevinsky, V., Volya, A.

		Borrow Records:
		[N:3]The Long Earth: The Long Cosmos(2016) by Pratchett, T.

		true
		true
		true


		Borrow Records:
		Data Structures: A Pseudocode Approach with C(1998) by Gilberg, R., Forouzan, B.

		Borrow Records:
		Physics of Atomic Nuclei(2017) by Zelevinsky, V., Volya, A.

		Borrow Records:
		[N:4]The Long Earth: The Long Cosmos(2016) by Pratchett, T.
		*/
	}
}