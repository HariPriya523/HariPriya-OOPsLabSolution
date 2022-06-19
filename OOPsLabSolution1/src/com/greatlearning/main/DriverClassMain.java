package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.exceptionhandling.DepartmentException;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClassMain {

	public static void main(String[] args) {

		CredentialService service = new CredentialService();
		System.out.println(
				"Please enter the department from the following \n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		Scanner sc = new Scanner(System.in);
		int department = sc.nextInt();
		System.out.println("Please enter the first name");
		String firstName = sc.next();
		System.out.println("Please enter the last name");
		String lastName = sc.next();
		String companyName = "abc";
		sc.close();
		if (department <= 0 || department > 4) {
			throw new DepartmentException("Department value must be 1 to 4");
		}

		Employee emp1 = new Employee(firstName, lastName);
		String emailAddress = service.generateEmailAddress(emp1, department, companyName);
		char[] password = service.generatePassword();
		service.showCredentials(emailAddress, password, emp1.getFirstName());
	}

}
