import java.util.Scanner;

public class ValidationDemo {
	
	//Amna Anjum
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Name validation 
		String name = Validator.getStringMatchingRegex(scnr, 
				"Enter first name: ", "[A-Z][a-z]*");
		
		//email validation
		String email = Validator.getStringMatchingRegex(scnr, 
				"Enter your email ", "[A-Za-z0-9]{10}@[A-Za-z0-9]{5}.[A-Za-z]{2,3}");
		
		//phone number validation
		String phone = Validator.getStringMatchingRegex(scnr, 
				"Enter your phone number ", "[0-9]{3}-[0-9]{3}-[0-9]{4}");
		
		//birthday validation 
		String bday = Validator.getStringMatchingRegex(scnr,
				"Enter your birthday " , "^\\d{2}/\\d{2}/\\d{4}" );
				
		System.out.println();
		
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		System.out.println("Birthday: " + bday);

		scnr.close();
	}

	
	
	
}