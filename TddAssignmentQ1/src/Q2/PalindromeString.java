package Q2;

public class PalindromeString {
    public static Object isPalindrome(String str){  
        StringBuilder sb=new StringBuilder(str);  

        

        sb.reverse();  
        String rev=sb.toString();  
        if(str.equals(rev)){  
            return true;  
        }else{  
            return false;  
        }  
    }

}
