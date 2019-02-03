import java.sql.*;
import java.util.Scanner;

public class FeeSlipsManagement {
	public static void main(String[] args) {
		try{
			int choice;
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/FeeSlips_DB","root", null);
			Statement stmt = conn.createStatement();
			
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to the Database\n");
			System.out.println("What Action do you want to perform");
			System.out.println("1) View Database");
			System.out.println("2) Add Record");
			System.out.println("3) Delete Record");
			System.out.println("4) Update Record");
			System.out.println("type \"0\" else to Quit");
			
			do{
				System.out.print("\n>> ");
				choice = input.nextInt();
				switch(choice){
					case 1:
						ViewTable(stmt);
						break;
					case 2:
						AddRecord(stmt);
						break;
					case 3:
						DeleteRecord(stmt);
						break;
					case 4:
						UpdateRecord(stmt);
						break;
				}
			}while(choice != 0);
			conn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}  
	}
	
	public static void ViewTable (Statement stmt) throws Exception{
		String format = "%d\t%d\t\t%-20s%-20s%-10s\t%-10s%n";
		ResultSet records = stmt.executeQuery("SELECT * FROM FeeSlips");
		System.out.println("VIEW TABLE");
		System.out.printf("%s\t%s\t%-20s%-20s%-10s\t%-10s%n", "id", "Registration", "First Name", "Last Name", "Fee Month", "Current Date");
		
		while(records.next())
			System.out.printf(format, records.getInt(1), records.getInt(2), records.getString(3), records.getString(4), records.getString(5), records.getString(6));
	}
	
	public static void AddRecord (Statement stmt) throws Exception{
		int regNumber;
		String firstName, lastName, feeMonth, currentDate;
		Scanner input = new Scanner(System.in);
		
		System.out.println("ADD RECORD");
		System.out.print("Enter Registration Number: ");
		regNumber = input.nextInt();
		System.out.print("Enter First Name: ");
		firstName = input.next();
		System.out.print("Enter Last Name: ");
		lastName = input.next();
		System.out.print("Enter the Fee Month: ");
		feeMonth = input.next();
		System.out.print("Enter the Current Date (Format: DD-MM-YYYY): ");
		currentDate = input.next();
		
		stmt.executeUpdate("INSERT INTO FeeSlips (regNumber, firstName, lastName, feeMonth, currentDate) VALUES("+ regNumber +", \""+ firstName +"\", \""+ lastName +"\", \""+ feeMonth +"\", \""+ currentDate +"\"); ");
	}
	
	public static void UpdateRecord(Statement stmt) throws Exception{
		int id, regNumber;
		String firstName, lastName, feeMonth, currentDate;
		Scanner input = new Scanner(System.in);
		
		System.out.println("UPDATING RECORDS");
		System.out.print("Enter the Record Number (\"id\") of the record you want to edit: ");
		id = input.nextInt();
		System.out.print("Enter Registration Number: ");
		regNumber = input.nextInt();
		System.out.print("Enter First Name: ");
		firstName = input.next();
		System.out.print("Enter Last Name: ");
		lastName = input.next();
		System.out.print("Enter the Fee Month: ");
		feeMonth = input.next();
		System.out.print("Enter the Current Date (Format: DD-MM-YYYY): ");
		currentDate = input.next();
		
		stmt.executeUpdate("UPDATE FeeSlips SET regNumber = "+ regNumber + ", firstName = \""+ firstName + "\", lastName = \""+ lastName +"\", feeMonth = \""+ feeMonth +"\", currentDate = \""+ currentDate +"\" WHERE id = "+ id +";");
	}
	
	public static void DeleteRecord(Statement stmt) throws Exception{
		int id;
		Scanner input = new Scanner(System.in);
		
		System.out.println("DELETING RECORD");
		System.out.print("Enter the Record Number (\"id\") of the record you want to Delete: ");
		id = input.nextInt();
		
		stmt.executeUpdate("DELETE FROM FeeSlips WHERE id = "+ id +";");
	}
}