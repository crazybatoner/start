package libraries;

import java.util.Comparator;

import publications.KidBook;

public class ComparatorTitle implements Comparator<KidBook>  {

	
	public int compare(KidBook o1, KidBook o2) {
		String str1 = o1.getBookName();
		String str2 = o1.getBookName();
		return str1.compareTo(str2);
		
	}

}
