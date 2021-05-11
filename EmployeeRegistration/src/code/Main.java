package code;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
	Scanner ab = new Scanner(System.in);
	scan s=new scan();
	
	while(true){
		System.out.print("\nEmployee Registration");
	System.out.print("\nWrite ADD/UPDATE/SHOW or SHOWID/DELETE to edit ");
	String edit = ab.nextLine();
	switch(edit) {
	case "ADD":
		s.addemp(empList);
		break;
	case "UPDATE":
		s.updateemp(empList);
		break;
	case "SHOW":
		s.showAllDetails(empList);
		break;
	case "SHOWID":
		s.showDetails(empList);
		break;
	case "DELETE":
		s.deleteemp(empList);
		break;
	default:
		System.out.print("Invalid Input");
		}
}
	
}
}