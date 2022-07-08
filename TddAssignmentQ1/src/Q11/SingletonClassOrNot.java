package Q11;

import java.util.HashMap;
import java.util.Map;

public class SingletonClassOrNot {
	 private static volatile SingletonClassOrNot singletonInstance = new SingletonClassOrNot();
     
	    //making constructor as private to prevent access to outsiders
	    private SingletonClassOrNot() {
	         
	    }
	     
	    public static SingletonClassOrNot getInstance(){
	        return singletonInstance;
	    }
	 
	}



