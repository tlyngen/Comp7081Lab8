package comp7081;

import java.util.ArrayList;

import comp7081.interfaces.IMovie;
import comp7081.interfaces.IMovieList;

/**
 * @author COMP7081 - Lab 8 - Group 2. kchan, msato, tlyngen
 *
 */
public class MovieList implements IMovieList{
    private int numberOfMovies = 0;
    private ArrayList<IMovie> movies = new ArrayList<IMovie>();
	public int size() {
		return numberOfMovies;
	}
	
	public String add(IMovie m) {
		if(m.getName().equals(null)||ifExist(m.getName())){
			return "FAIL";
		}else{
			numberOfMovies++;
			movies.add(m);
			return "OK";
		}
	}
	
	private boolean ifExist(String m){
		for (IMovie movie : this.movies) {
	        if(movie.getName().toLowerCase().equals(m.toLowerCase())){
	        	return true;
	        }
	    }
		return false;
	}
	
	public String getMovieName(int index){
		return movies.get(index).getName();
	}
	
	public String renameMovie(int index, String mName){
		IMovie movie = movies.get(index);
		if(mName == null || ifExist(mName)){
			return "FAIL";
		}else{
			return movie.setName(mName);
		}
	}

}
