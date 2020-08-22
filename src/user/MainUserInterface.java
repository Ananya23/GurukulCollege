package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import Operations.MakeDBConnection;

public class MainUserInterface {
	
	public static void displayMenu() {

		System.out.println("\n\n=========================================");
		System.out.println("                MAIN MENU");
		System.out.println("=========================================");
		System.out.println("1. Admin");
		System.out.println("2. Professor");
		System.out.println("3. Student");
		System.out.println("4. Display Details");
		System.out.println("5. Exit");
		System.out.println("=========================================");
		System.out.println("Enter Choice");
		
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Connection con = MakeDBConnection.connect();
		
		boolean main=true, admin=false, prof=false, stu=false, disp=false; 
		
		while(true)	{
			if(main)	{
				displayMenu();
				int ch = Integer.parseInt(br.readLine());
				
				switch(ch)	{
				
				case 1:	main=false;
						admin=true;
						break;
				
				case 2:	main=false;
						prof=true;
						break;
						
				case 3:	main=false;
						stu=true;
						break;
				
				case 4:	main=false;
						disp=true;
						break;
				
				case 5:
						System.out.println("THANKS FOR USING!\nSEE YOU SOON");
						return;
						
				default:
						System.out.println("Invalid Input !!!");
						break;
				}
			}
			
			else if(admin)	{
				while(admin)	{
					AdminMenu.displayMenu();
					admin = AdminMenu.switcher(con);
				}
				main = !admin;
			}
			
			else if(prof)	{
				while(prof)	{
					ProfessorMenu.displayMenu();
					prof = ProfessorMenu.switcher(con);
				}
				main = !prof;
			}
			
			else if(stu)	{
				while(stu)	{
					StudentMenu.displayMenu();
					stu = StudentMenu.switcher(con);
				}
				main = !stu;
			}
			
			else {
				while(disp)	{
					DisplayMenu.displayMenu();
					disp = DisplayMenu.switcher(con);
				}
				main = !disp;
			}
			
		}
		
	}

}
