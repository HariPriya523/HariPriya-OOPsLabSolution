package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatePassword() {
		Random random = new Random();
		String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String specialChars = "!@#$";
		String numbers = "0123456789";
		char[] randomPassword = new char[8];

		randomPassword[0] = capitalCase.charAt(random.nextInt(capitalCase.length()));
		randomPassword[1] = specialChars.charAt(random.nextInt(specialChars.length()));
		randomPassword[2] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 3; i < 8; i++) {
			randomPassword[i] = lowerCase.charAt(random.nextInt(lowerCase.length()));
		}
		return randomPassword;
	}

	public String generateEmailAddress(Employee emp1, int departmentno, String companyName) {

		String emailAddress;
		String department = null;
		switch (departmentno) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			break;
		}
		emailAddress = emp1.getFirstName() + emp1.getLastName() + "@" + department + "." + companyName + ".com";

		return emailAddress;
	}

	public void showCredentials(String emailAddress, char[] password, String firstName) {
		System.out.println("Dear " + firstName + " your generated credentials are as follows");
		System.out.println("Email    ---> " + emailAddress);
		System.out.print("Password ---> ");
		System.out.println(password);

	}
}
