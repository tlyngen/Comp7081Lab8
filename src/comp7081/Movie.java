package comp7081;

import comp7081.interfaces.IMovie;


public class Movie implements IMovie {
	private String name;

	public String getName() {
		return name;
	}
	public String setName(String mName) {
		if(mName == null|| mName.equals("")){
			return "FAIL";
		}else{
			name = mName;
			return "OK";
		}
	
	}
}