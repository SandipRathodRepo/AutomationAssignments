package com.java.assignments;

public class Assignment_ConditionalStatement {

	public static void main(String[] args) {

		// given data
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		// Checking for creditScore 
		
		//if creditScore is >750
		if (creditScore > 750) {
			System.out.println("loan is  approved.");

		} 
		
		//if creditScore is in btwn 650 and 750
		else if (creditScore > 650 && creditScore < 750) {
			System.out.println("creditScore.: " + creditScore + " which is btwn 650-750 ");
			System.out.println("Additional checks are Required.");
			if (income >= 50000.0) {

				if (isEmployed) {
					System.out.println("Is Employeed: " + isEmployed + " ==>check for debtToIncomeRatio ");
					if (debtToIncomeRatio < 40.0) {
						System.out.println("debtToIncomeRatio.: " + debtToIncomeRatio + "  ");
						System.out.println("Hi, " + customerName + " Your CreditScore is " + creditScore
								+ ", EmployeeStatus is " + isEmployed + " And debtToIncomeRatio is  "
								+ debtToIncomeRatio + " .So loan is  approved.");

					} else {
						System.out.println("debtToIncomeRatio.: " + debtToIncomeRatio
								+ "  Exceeding debtToIncomeRatio, Not Eligible For Loan");
					}
				} else {
					System.out.println("Employee Status is:" + isEmployed
							+ " you are not Employeed ==>So you are not eligible for Loan, the loan is denied.");

				}

			} else {

				System.out.println("your income is:" + income + " you are not eligible for Loan, the loan is denied.");
			}
		} 
		//if creditScore is <650
		else if (creditScore < 650) {
			System.out.println(
					"our creditScore Is " + creditScore + " You are not eligible for Loan, the loan is denied.");

		}
	}

}
