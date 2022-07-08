package Q13;

public class Calculator {
	
	  static int result;
	    //Method for addition
	    public static int add(int num1, int num2){
	        result = num1+num2;
	        return result;

	    }
	    //Method for subtraction
	    public static int substract(int num1, int num2){
	        result = num1-num2;
	        return result;
	    }
	    //Method for multiplication
	    public static int multiply(int num1, int num2){
	        result = num1*num2;
	        return result;
	    }
	    //Method for division
	    public static int divide(int num1, int num2){
	        result = num1/num2;
	         if (num2 == 0)
	                throw new IllegalArgumentException("Cannot divide by zero!");
	        System.out.println(result);
	        return result;
	    }

	    public static int modulus(int num1, int num2){
	        result = num1%num2;
	         if (num2 == 0)
	                throw new IllegalArgumentException("Cannot divide by zero!");
	        System.out.println(result);

	        return result;
	}
	    public static int power(int num1,int power){
	        int result1=0;
	        result1 = (int) Math.pow(num1,power);
	        if (power<0) 
	            throw new IllegalArgumentException("power is always positive!");


	        else 
	            return result1;

	}
	    public static int squareroot(int num1){
	         int result1 = (int) Math.sqrt(num1);
	        return result1;    
	}
	    public static int cuberoot( int num2){
	    int result2 = (int) Math.cbrt(num2);
	        return result2;
	}
	}

