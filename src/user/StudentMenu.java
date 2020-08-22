package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import Operations.StudentOperations;

public class StudentMenu {

	public static void displayMenu() {

		System.out.println("\n\n=========================================");
		System.out.println("               STUDENT MENU");
		System.out.println("=========================================");
		System.out.println("1. Update");
		System.out.println("\nPress 0 else to go back");
		System.out.println("=========================================");
		System.out.println("Enter Choice");
	}

	public static boolean switcher(Connection con) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch = Integer.parseInt(br.readLine());
		
		switch (ch) {

		case 1:	{
			System.out.println("Enter Student Name and ID");
				String name = br.readLine();
				int id = Integer.parseInt(br.readLine());
			StudentOperations.updateStudent(con, name, id);
			break;
		}

		default:
			System.out.println("Invalid Input !!!");
			return false;
		}
		
		return true;
	}

}
