package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import Operations.CourseOperations;
import Operations.ProfessorOperations;
import Operations.StudentOperations;
import entity.Course;
import entity.Professor;
import entity.Student;

public class AdminMenu {

	public static void displayMenu() {
		
		System.out.println("\n\n=========================================");
		System.out.println("               ADMIN MENU");
		System.out.println("=========================================");
		System.out.println("1. Insert Course");
		System.out.println("2. Delete Course");
		System.out.println("3. Update Course");
		System.out.println("4. Insert Professor");
		System.out.println("5. Delete Professor");
		System.out.println("6. Update Professor");
		System.out.println("7. Insert Student");
		System.out.println("8. Delete Student");
		System.out.println("9. Update Student");
		System.out.println("\nPress 0 else to go back");
		System.out.println("=========================================");
		System.out.println("Enter Choice");
	}

	public static boolean switcher(Connection con) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch = Integer.parseInt(br.readLine());
		
		switch (ch) {

		case 1:	{
			System.out.println("Enter Course Name and ID");
				String name = br.readLine();
				int id = Integer.parseInt(br.readLine());
			Course cr = new Course(id, name);
			CourseOperations.insertCourse(con, cr);
			break;
		}
			
		case 2:	{
			System.out.println("Enter Course ID");
				int id = Integer.parseInt(br.readLine());
			CourseOperations.deleteCourse(con, id);
			break;
		}
		
		case 3:	{
			System.out.println("Enter Course Name and ID");
				String name = br.readLine();
				int id = Integer.parseInt(br.readLine());
			CourseOperations.updateCourse(con, name, id);
			break;
		}
		
		case 4:	{
			System.out.println("Enter Professor Name and ID");
				String name = br.readLine();
				int id = Integer.parseInt(br.readLine());
			Professor pr = new Professor(name, id);
			ProfessorOperations.insertProfessor(con, pr);
			break;
		}
			
		case 5:	{
			System.out.println("Enter Professor ID");
				int id = Integer.parseInt(br.readLine());
			ProfessorOperations.deleteProfessor(con, id);
			break;
		}
		
		case 6:	{
			System.out.println("Enter Professor Name and ID");
				String name = br.readLine();
				int id = Integer.parseInt(br.readLine());
			ProfessorOperations.updateProfessor(con, name, id);
			break;
		}
		
		case 7:	{
			System.out.println("Enter Student Name and ID");
				String name = br.readLine();
				int id = Integer.parseInt(br.readLine());
			Student st = new Student(id, name);
			StudentOperations.insertStudent(con, st);
			break;
		}
			
		case 8:	{
			System.out.println("Enter Student ID");
				int id = Integer.parseInt(br.readLine());
			StudentOperations.deleteStudent(con, id);
			break;
		}
		
		case 9:	{
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