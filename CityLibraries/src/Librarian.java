import java.util.Collection;
import java.util.Set;

import libraries.ChildrenLibrary;
import publications.KidBook;
import publications.Publicatoins;

public interface Librarian {



	void searchBook(String s);

	void searchAuth(String s,String f);
	
	void sort();
	
	void addBook(String nameLibr,Publicatoins a);
	 
	void delete(Publicatoins a);

	void printAll();
	 
	
}
