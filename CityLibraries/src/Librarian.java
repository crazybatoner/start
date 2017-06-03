import java.util.Collection;
import java.util.Set;

import libraries.ChildrenLibrary;
import publications.KidBook;

public interface Librarian {



	void searchBook(String s);

	void searchAuth(String s,String f);
	
	void sort();
	
	void addBook(String nameLibr,KidBook a);
	 
	void delete(KidBook a);

	void printAll();
	 
	
}
