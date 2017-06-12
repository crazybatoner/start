import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import libraries.ChildrenLibrary;
import libraries.CityLibrary;
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
		Author ivPal = new Author("Ivan", "Fish");
		ScientificPublication boo = new ScientificPublication("Boosfera", ivPal, 1050, 3);

		ChildrenLibrary childLibr1 = new ChildrenLibrary("№1", 1);
		ChildrenLibrary childLibr2 = new ChildrenLibrary("№2", 2);
		ChildrenLibrary childLibr3 = new ChildrenLibrary("№3", 3);

		ScientificLibrary scLibr1 = new ScientificLibrary("№1", 1);
		ScientificLibrary scLibr2 = new ScientificLibrary("№2", 2);
		ScientificLibrary scLibr3 = new ScientificLibrary("№3", 3);

		CityLibrary cityLibr1 = new CityLibrary("№1");
		CityLibrary cityLibr2 = new CityLibrary("№2");
		CityLibrary cityLibr3 = new CityLibrary("№3");

		ChildrenLibrarianImpl CityChilLibr = new ChildrenLibrarianImpl();
		ScientificLibrarianImpl CityScieLibr = new ScientificLibrarianImpl();
		CityLibraryImpl cityCityLibr = new CityLibraryImpl();

		CityScieLibr.addLibrary(scLibr1);
		CityScieLibr.addLibrary(scLibr2);
		CityScieLibr.addLibrary(scLibr3);

		CityChilLibr.addLibrary(childLibr2);
		CityChilLibr.addLibrary(childLibr1);
		CityChilLibr.addLibrary(childLibr3);

		cityCityLibr.addLibrary(cityLibr1);
		cityCityLibr.addLibrary(cityLibr2);
		cityCityLibr.addLibrary(cityLibr3);

		scLibr1.addScienPubl(noo);
		scLibr1.addScienPubl(tan);

		scLibr2.addScienPubl(noo);
		scLibr2.addScienPubl(noo);

		scLibr3.addScienPubl(boo);

		// CityScieLibr.printAll();
		// CityScieLibr.searchAuth("Zigmund", "Freid");
		// CityScieLibr.delete(noo);

		childLibr1.addBooks(karlson);
		childLibr1.addBooks(kolobok);
		childLibr1.addBooks(moidod);

		childLibr2.setLibrName("N2");
		childLibr2.addBooks(kolobok);
		childLibr2.addBooks(little);

		// childLibr3.setLibrName("N3");
		childLibr3.addBooks(little);
		childLibr3.addBooks(little);
		
		cityLibr1.addCityBook(karlson);
		cityLibr1.addCityBook(noo);
		cityLibr1.addCityBook(karlson);
		
		cityLibr2.addCityBook(noo);
		cityLibr2.addCityBook(little);
		cityLibr2.addCityBook(boo);
		
		cityCityLibr.printAll();
		//cityCityLibr.delete(karlson);
		
		//cityCityLibr.searchBook("Noosfera");

		// CityChilLibr.printAll();

		// CityChilLibr.delete(little);

		// CityChilLibr.printAll();

		// CityChilLibr.sort();

		// CityChilLibr.printAll();
		// CityChilLibr.searchBook("Kolobok");// Поиск книги по названию
		// CityChilLibr.searchAuth("Astrid","Lindgren");// Поиск книги по автору

		// ---- SERIALIZATION------
		/*
		 * try { FileOutputStream fos = new FileOutputStream(
		 * "D://eclipse//12byte sequence.txt");
		 * 
		 * ObjectOutputStream oos = new ObjectOutputStream(fos); ChildrenLibrary
		 * childLibr4 = new ChildrenLibrary(); childLibr4.setLibrName("5");
		 * childLibr4.addBooks(little); //
		 * System.out.println(little.getBookName());
		 * childLibr4.addBooks(karlson);
		 * 
		 * oos.writeObject(childLibr4);
		 * 
		 * oos.reset(); childLibr4 = new ChildrenLibrary();
		 * childLibr4.setLibrName("1"); oos.writeObject(childLibr4);
		 * oos.reset(); //childLibr4 = new ChildrenLibrary();
		 * childLibr4.setLibrName("2"); oos.writeObject(childLibr4);
		 * oos.reset(); //childLibr4 = new ChildrenLibrary();
		 * childLibr4.setLibrName("3"); oos.writeObject(childLibr4);
		 * oos.reset();
		 * 
		 * childLibr4.setLibrName("4"); oos.writeObject(childLibr4);
		 * 
		 * 
		 * oos.flush(); oos.close(); fos.close();
		 * 
		 * FileInputStream fis = new FileInputStream(
		 * "D://eclipse//12byte sequence.txt");
		 * 
		 * ObjectInputStream ois = new ObjectInputStream(fis);
		 * 
		 * ChildrenLibrary chilllLibr = (ChildrenLibrary) ois.readObject();
		 * ChildrenLibrary chilllLibr1 = (ChildrenLibrary) ois.readObject();
		 * 
		 * // chilllLibr.addBooks(karlson);
		 * System.out.println(chilllLibr.getLibrName());
		 * System.out.println(chilllLibr1.getLibrName());
		 * 
		 * for (Iterator<KidBook> it = chilllLibr.getKidBooks().iterator();
		 * it.hasNext();) { it.next().print(); } // CityChilLibr.printAll();
		 * 
		 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } catch (FileNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */

	}
}
