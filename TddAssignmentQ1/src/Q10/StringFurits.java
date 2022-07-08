package Q10;

public class StringFurits {
	   public static String concatString(String s[]) {
	        String s1="";

	        int a = s.length-1;
	        for(int i = 0;i<s.length;i++) {
	            if(i==a)
	                s1 =s1+s[i];
	            else
	                s1 =s1+s[i]+"-";
	        }
	        return s1;
	    }
	}


