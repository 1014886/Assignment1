package Q9;

public class RemoveWhiteSpace {
	
	public static String remove(String str){  
	
	//String str= " This @ Red $car.";   
	str = str.replaceAll("[^a-zA-Z0-9]", " ");  
	System.out.println(str);
	return str;  
	} 
}
	



