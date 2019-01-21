import java.util.Scanner;

public class GetData {
	int  empno[], basic[], hra[], it[], da[], emp, i, salary;
	String empname[], joindate[], department[], designationcode[], designation[], reinput;
	Scanner keyboardInput = new Scanner(System.in);
	
	public void userInput() {

		System.out.println("Enter how many employees you would like to register: ");
		emp = keyboardInput.nextInt();
		
		empno = new int[emp];
		empname = new String[emp];
		joindate = new String[emp];
		designationcode = new String[emp];
		department = new String[emp];
		basic = new int[emp];
		hra = new int[emp];
		it = new int[emp];
		da = new int[emp];
		
		for(i=0;i<emp;i++) {
			System.out.print("Enter employee number: ");
			empno[i] = keyboardInput.nextInt();
			
			System.out.print("Enter employee name: ");
			empname[i] = keyboardInput.next();
			
			System.out.print("Enter join date: ");
			joindate[i] = keyboardInput.next();
			
			System.out.print("Enter designation code: ");
			designationcode[i] = keyboardInput.next();
			
			System.out.print("Enter department: ");
			department[i] = keyboardInput.next();
			
			System.out.print("Enter basic: ");
			basic[i] = keyboardInput.nextInt();
			
			System.out.print("Enter hra: ");
			hra[i] = keyboardInput.nextInt();
			
			System.out.print("Enter it: ");
			it[i] = keyboardInput.nextInt();
		}
		for(i=0;i<emp;i++) {
			System.out.println("Employee number: " + empno[i]);
			System.out.println("Employee name: " + empname[i]);
			System.out.println("Department: " + department[i]);
			switch(designationcode[i]) {
			case "E":
			case "e":
				System.out.println("Designation: Engineer");
				da[i] = 20000;
				System.out.println(da[i]);
				salary = basic[i] + hra[i] + da[i] - it[i];
				System.out.println("Salary: " + salary);
				break;
			case "C":
			case "c":
				System.out.println("Designation: Consultant");
				da[i] = 32000;
				System.out.println(da[i]);
				salary = basic[i] + hra[i] + da[i] - it[i];
				System.out.println("Salary: " + salary);
			case "K":
			case "k":
				System.out.println("Designation: Clerk");
				da[i] = 12000;
				System.out.println(da[i]);
				salary = basic[i] + hra[i] + da[i] - it[i];
				System.out.println("Salary: " + salary);
			case "R":
			case "r":
				System.out.println("Designation: Receptionist");
				da[i] = 15000;
				System.out.println(da[i]);
				salary = basic[i] + hra[i] + da[i] - it[i];
				System.out.println("Salary: " + salary);
			case "M":
			case "m":
				System.out.println("Designation: Manager");
				da[i] = 40000;
				System.out.println(da[i]);
				salary = basic[i] + hra[i] + da[i] - it[i];
				System.out.println("Salary: " + salary);
			}
		}
	}
	public void retryInput() {
		System.out.println("Enter Y/y to register more employees | Enter N/n to exit");
		reinput = keyboardInput.next();
		if(reinput.equals("Y") || reinput.equals("y")) {
			userInput();
		}
		else if(reinput.equals("N") || reinput.equals("n")) {
			System.exit(0);
		}
	}
}
