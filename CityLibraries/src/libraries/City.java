package libraries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import publications.Publicatoins;

public class City {
	 //ArrayList<Library> allLibrary= new ArrayList<Library>();
	private Map<Library, ArrayList<Library>> CitLibrPubl = new HashMap();

	public Map<Library, ArrayList<Library>> getCitLibrPubl() {
		return CitLibrPubl;
	}

	public void setCitLibrPubl(Map<Library, ArrayList<Library>> citLibrPubl) {
		CitLibrPubl = citLibrPubl;
	}
	
	
	
}
