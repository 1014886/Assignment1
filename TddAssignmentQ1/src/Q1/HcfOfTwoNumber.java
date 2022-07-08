package Q1;

public class HcfOfTwoNumber {


	 public static int getHCF (int num1, int num2)
	  {
	    // Handles the case when one of the number is 0 (num1) 
	    // Check alert above in explanation
	    if (num1 == 0)
	      return num2;

	    // Handles the case when one of the number is 0 (num2)
	    // Check alert above in explanation
	    if (num2 == 0)
	      return num1;

	    // base case
	    if (num1 == num2)
	      return num1;

	    // num1 is greater
	    if (num1 > num2)
	      return getHCF (num1 - num2, num2);

	    return getHCF (num1, num2 - num1);
	  }
	}

