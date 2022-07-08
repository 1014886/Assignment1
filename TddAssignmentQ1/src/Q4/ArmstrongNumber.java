package Q4;

public class ArmstrongNumber {
	
	  public static boolean armnumber(int n)
	    {
	        int rem=0,sum=0;
	        int original=n;

	        while(n>0)
	        {
	            rem=n%10;
	            sum=(rem*rem*rem)+sum;
	            n=n/10;

	        }

	    if(sum==original)
	    {
	      return true;    
	    }
	    else
	    {
	        return false;
	    }
	    }
	}




