package core;

public class PNC {
	public boolean check(final int pn){
		for (int i = 2; i<=(pn/2); i++) {
			if (pn % i ==0) {return false;}
		}//for
		return true;
	}//check
	}//class
