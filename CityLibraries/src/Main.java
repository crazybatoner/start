import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import libraries.ChildrenLibrary;
import libraries.ScientificLibrary;
import publications.Author;
import publications.KidBook;
import publications.ScientificPublication;

public class Main {

	public static void main(String[] args) {
		Author astLin = new Author("Astrid", "Lindgren");
		KidBook karlson = new KidBook("Karlson", astLin, 150, 90);
		Author antEcz = new Author("Antuan", "Eczuperi");
		KidBook little = new KidBook("Little Prince", antEcz, 130, 70);
		Author narod = new Author("Babka", "Ded");
		KidBook kolobok = new KidBook("Colobok", narod, 150, 90);
		Author chuk = new Author("Kornei", "Chukowskii");
		KidBook moidod = new KidBook("Moidodir", chuk, 130, 10);
		Author zigFr = new Author("Zigmund", "Freid");
		ScientificPublication tan = new ScientificPublication("Tanatos", zigFr, 1000, 1);
		Author vladver = new Author("Vladimir", "Vernadskii");
		ScientificPublication noo = new ScientificPublication("Noosfera", vladver, 1100, 2);

		ChildrenLibrary childLibr1 = new ChildrenLibrary("№1", 1);
		ChildrenLibrary childLibr2 = new ChildrenLibrary("№2", 2);
		ChildrenLibrary childLibr3 = new ChildrenLibrary("№3", 3);
		ScientificLibrary scLibr1 = new ScientificLibrary();
		ScientificLibrary scLibr2 = new ScientificLibrary();

		ChildrenLibrarianImpl CityChilLibr = new ChildrenLibrarianImpl();
		// System.out.println(childLibr1.equals(childLibr2));
		// System.out.println(childLibr2.equals(childLibr4));
		// CityChilLibr.addAll(c)
		// CityChilLibr.addLibrary(childLibr4);
		CityChilLibr.addLibrary(childLibr2);
		CityChilLibr.addLibrary(childLibr1);
		CityChilLibr.addLibrary(childLibr3);

		// CityChilLibr.add(childLibr4);
		// CityChilLibr.addAll(CityChilLibr);
		// CityChilLibr.setAllChildrenLibrary(CityChilLibr);

		// CityChilLibr.setAllChildrenLibrary(childLibr2);
		// childLibr1.setLibrName("N1");
		childLibr1.addBooks(karlson);
		childLibr1.addBooks(kolobok);
		childLibr1.addBooks(moidod);
		// childLibr2.setLibrName("N2");
		childLibr2.addBooks(kolobok);
		childLibr2.addBooks(little);
		// childLibr3.setLibrName("N3");
		childLibr3.addBooks(little);
		childLibr3.addBooks(little);
		// childLibr4.setLibrName("N4");
		// childLibr4.addBooks(karlson);
		// childLibr4.addBooks(little);

		CityChilLibr.addBook("N1", kolobok);

		// CityChilLibr.setAllChildrenLibrary(CityChilLibr);*/

		// childLibr1.setKidBooks(childLibr1);
		// childLibr2.setKidBooks(childLibr2);

		/*
		 * ChildrenLibrarianImpl CityChilLibr=new ChildrenLibrarianImpl();
		 * CityChilLibr.add(childLibr1); CityChilLibr.add(childLibr2);
		 * CityChilLibr.setAllChildrenLibrary(CityChilLibr);
		 */

		CityChilLibr.printAll();

		// CityChilLibr.delete(little);

		// CityChilLibr.printAll();

		// CityChilLibr.sort();

		// CityChilLibr.printAll();
		// CityChilLibr.searchBook("Kolobok");// Поиск книги по названию
		// CityChilLibr.searchAuth("Astrid","Lindgren");// Поиск книги по автору

	}

}
