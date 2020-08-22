package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import Operations.CourseOperations;
import Operations.ProfessorOperations;
import Operations.StudentOperations;

public class DisplayMenu {
	
	public static void displayMenu() {
		
		System.out.println("\n\n=========================================");
		System.out.println("			DISPLAY MENU");
		System.out.println("=========================================");
		System.out.println("1. Display Course");
		System.out.println("2. Display Professor");
		System.out.println("3. Display Student");
		System.out.println("\npress anything else to go back");
		System.out.println("=========================================");
		System.out.println("Enter Choice ");
	}

	public static boolean switcher(Connection con) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch = Integer.parseInt(br.readLine());
		
		switch (ch) {

		case 1:
			CourseOperations.displayCourse(con);
			break;
			
		case 2:
			ProfessorOperations.displayProfessor(con);
			break;
		
		case 3:
			StudentOperations.displayStudent(con);
			break;

		default:
			System.out.println("Invalid Input !!!");
			return false;
		}
		
		return true;
	}

}
