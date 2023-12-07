package lab_1_OOPs_assignment;

import java.util.Random;

public class CredentialService {
	Employee emp;
	public CredentialService(Employee emp) {
		this.emp = emp;
	}

	public String generateEmail() {
		return (emp.Firstname.toLowerCase()+emp.Lastname.toLowerCase()+
				"@"+emp.Department.toLowerCase()+".abc.com");
		
	}
	
	public String generatePassword() {
		String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcde"
				+ "fghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
		Random rand = new Random();
		StringBuilder pass = new StringBuilder();
		for (int i=0;i<8;i++) {
			pass.append(character.charAt(rand.nextInt(character.length())));
			
			}
		return pass.toString();
		
	}
	
	public void showcredentials() {
		String pass = generatePassword();
		String mail = generateEmail();
		System.out.println("Dear "+emp.Firstname+" your generated credentials are as follows");
		System.out.println("Email"+" ---> "+mail);
		System.out.println("Password"+" ---> "+pass);
		
		
	}

}
