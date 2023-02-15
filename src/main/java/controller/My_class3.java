package controller;

import java.util.Scanner;

import dao.My_class2;

public class My_class3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		My_class2 a = new My_class2();
		boolean flag = true;

		while (flag) {
			System.out.println("1.Add Std_datails");
			System.out.println("2.Fetch Std_details");
			System.out.println("3.Update Std_details");
			System.out.println("4.Fetch Std_details");
			System.out.println("5.remove Std_details");
			System.out.println("6.Fetch all Std_details");
			System.out.println("7.delete Std_details");
			System.out.println("8.greating");

			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Enter the Std_ID");
				int id = sc.nextInt();
				System.out.println("Enter the Std_Name");
				String name = sc.next();
				System.out.println("Enter the Std_Branch");
				String branch = sc.next();
				System.out.println("Enter the Std_USN");
				String usn = sc.next();
				System.out.println("Enter the College");
				String college = sc.next();

				a.Add_details(id, name, branch, usn, college);
				System.out.println("Std_details is Updated");
			}
				break;

			case 2: {
				System.out.println("Enter the Std_Id");
				int id = sc.nextInt();

				a.fetch(id);
				System.out.println("Std_details is Updated");
			}
				break;

			case 3: {
				System.out.println("Enter the Std_ID");
				int id = sc.nextInt();
				System.out.println("Enter the Std_Branch");
				String branch = sc.next();

				a.update(id, branch);
				System.out.println("Std_details is Updated");
			}
				break;
			case 4: {
				System.out.println("Enter the Std_ID");
				int id = sc.nextInt();

				a.remove(id);
				System.out.println("Std_details is Updated");
			}
				break;

			case 5: {
				a.fetchAll();
			}
				break;
			case 6: {
				a.deleteAll();
			}
				break;
			case 7: {
				flag = false;
				System.out.println("TQ");
			}
				break;
			default: {
				System.out.println("Correct agiro I/P kodo***********");
			}
				break;

			}
		}
	}
}
