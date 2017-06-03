package libraries;

import java.util.HashMap;

import publications.Publicatoins;

public class CityLibrary extends HashMap<Publicatoins, Integer>{
private HashMap<Publicatoins, Integer>  CitLibrPubl;

public HashMap<Publicatoins, Integer> getCitLibrPubl() {
	return CitLibrPubl;
}

public void setCitLibrPubl(HashMap<Publicatoins, Integer> citLibrPubl) {
	CitLibrPubl = citLibrPubl;
}
}
