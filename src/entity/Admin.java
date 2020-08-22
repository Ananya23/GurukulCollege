package entity;
import java.util.*;

public class Admin {

	Scanner sc = new Scanner(System.in);

	public static void displayMenu() {

		System.out.println("Menu");
		System.out.println("1. Accept the details");
		System.out.println("2. Display the details");
		System.out.println("3. withdraw");
		System.out.println("4. Deposit");
		System.out.println("5. Transfer");
		System.out.println("6. Exit");
		System.out.println("=========================================");
	}

	public static boolean switcher() {
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {

		case 1:
			System.out.println("please enter accno , name , balance");
			int accNo = sc.nextInt();
			String name = sc.next();
			double bal = sc.nextDouble();
			break;

		case 2:
			System.out.println("Displaying the details ....................");
			break;

		case 3:
			System.out.println("Enter the amount to withdraw.....");
			int amt = sc.nextInt();
			if (true)
				System.out.println("withdraw operation is successful!!!!!!");
			else
				System.out.println("Not enough funds...........");
			break;

		case 4:
			System.out.println("Enter the amount to deposit.....");
			int amt1 = sc.nextInt();
			break;

		case 5:
			System.out.println("Enter the amount to tranfer.....");
			int amt2 = sc.nextInt();
			System.out.println("Tranfering funds..in process");
			System.out.println("Tranfering funds..is completed ");
			break;

		case 6:
			System.out.println("Exiting..");
			return false;

		default:
			System.out.println("invalid input !!!");
			break;

		}
		return true;
	}

}