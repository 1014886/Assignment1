package Q3;

import java.util.ArrayList;
import java.util.List;

public class User{
    String email;
    String password;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}

 class UserPass {
	 static List<User> a=new ArrayList<>();
	    public static void main(String[] args) {
	        System.out.println();
	    }
	     public static boolean checkEmailandPassword(String email,String password) {

	            a.add(new User("swapnil@gmail.com","swapnil23"));
	            a.add(new User("sandip@gmail.com","sandip12"));
	            a.add(new User("nikhil@gmail.com","nikhil123"));


	            for(int i=0;i<=a.size()-1;i++) {
	                if(a.get(i).email.contains(email)&&a.get(i).password.contains(password)) {
	                    return true;
	                }break;
	            }
	            return false;
	    }
	  }
		





