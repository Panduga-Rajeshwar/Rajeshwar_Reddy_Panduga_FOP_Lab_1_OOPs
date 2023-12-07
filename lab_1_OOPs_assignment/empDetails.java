package lab_1_OOPs_assignment;

import java.util.Scanner;

public class empDetails{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String fname,lname,dept = null;
		
		//creating scanner to read input from console
		Scanner in = new Scanner(System.in);
		
		
		/*
		 //we can even provide the first name and last name 
		  * of the employee from the console this commented one contain
		  * the code for that.
		
		
		//reading first name
		System.out.println("Enter the First name of employee:");
		fname = in.nextLine();
		
		//reading last name
		System.out.println("Enter the Last name of Employee:");
		lname = in.nextLine();
		*/
		
		//declaring first name and last name.
		fname = "Rajeshwar";
		lname = "Panduga";
		
		//reading department
		
		int flag = 0;
		while(flag==0) {
			System.out.println("Please Enter the department from the following:"
					+ "\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
			int ch = in.nextInt();
			//to catch any error in the department reader entry
			
			for (int i =1;i<5;i++) {
				if (ch == 1) {
					dept = "Technical";
					flag = 1;
				}
				else if (ch ==2){
					dept = "Admin";
					flag = 1;
				}
				
				else if (ch ==3){
					dept = "Human_Resource";
					flag = 1;
				}
				
				else if (ch ==4){
					dept = "Legal";
					flag = 1;
				}
				else {
					System.out.println("Choose the options from above only!!");
				}
			}
		}
		//initializing employee class constructor
		Employee e1 = new Employee(fname,lname,dept);
		
		//initializing credential service
		CredentialService cs = new CredentialService(e1);
		
		cs.showcredentials();
		
	}
	
}
