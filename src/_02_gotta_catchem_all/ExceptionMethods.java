package _02_gotta_catchem_all;

public class ExceptionMethods {
	//In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	Double divide(double d1, double d2) throws IllegalArgumentException{
		if(d2 == 0) {
			throw new IllegalArgumentException();
		}
		else {
			return d1/d2;
		}
	}
	
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
		//   String and returns the reverse of that String. It should throw an IllegalStateException
		//   if the String passed in is empty
		String reverseString(String s) throws IllegalStateException{
			String rs = "";
			if(s.isEmpty()) {
				throw new IllegalStateException();
			}
			else {
				for(int i = s.length()-1; i >= 0;i--) {
					rs = rs + s.charAt(i);
				}
				return rs;
			}
		}
	
	
	
}


