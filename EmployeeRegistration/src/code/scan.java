package code;

import java.util.*;
import java.util.Scanner;


public class scan {
	Scanner ab = new Scanner(System.in);
	
	public void addemp(List<Employee> empList){
		System.out.print("Enter empId:-");
		long empId=10125+(empList.size()-1)+1;
		ab.nextLine();
		System.out.print("\nEnter empName:-");
		String empName = ab.nextLine().trim();
		System.out.print("\nEnter empAge:-");
		int empAge = ab.nextInt();
		ab.nextLine();
		System.out.print("\nEnter empAddress:-");
		String empAddress = ab.nextLine().trim();
		Employee empDetails = new Employee(empId,empName,empAge,empAddress);
		empList.add(empDetails);
	System.out.print("Added Succesfully");
}
	
	
	public void updateemp(List<Employee> empList) {
		System.out.print("Enter empId");
		long empIdUpdate = ab.nextLong();
		
		Employee empDetails = null;
		for(Employee update : empList) {
			if(update.getempId()==empIdUpdate || update.getempId()==10125+empIdUpdate) {
				empDetails=update;
				break;
			}
		}
		if(empDetails==null) {
			System.out.print("Invalid Input");
			return;
		}
		
		System.out.print("Details to update empName(1)/empAge(2)/empAddress(3):- ");
		int details=ab.nextInt();
		if(details==1) {
			ab.nextLine();
			System.out.print("New name:-");
			String name=ab.nextLine();
			empDetails.setempName(name);
			System.out.print("Name Updated");
		}
		if(details==2) {
			ab.nextLine();
			System.out.print("Age:-");
			int age=ab.nextInt();
			empDetails.setempAge(age);
			System.out.print("Age Updated");
		}
		if(details==3) {
			ab.nextLine();
			System.out.print("New Address:-");
			String Address=ab.nextLine();
			empDetails.setempAddress(Address);
			System.out.print("Address Updated");
		}
	}
	
	
	
	public void showDetails(List<Employee> empList) {
		System.out.print("Enter empId");
		long empIdShow = ab.nextLong();
		Employee empDetails = null;
		for(Employee Show : empList) {
			if(Show.getempId()==empIdShow||Show.getempId()==10125+empIdShow) {
				empDetails=Show;
				break;
			}
		}
		if(empDetails==null) {
			System.out.print("Invalid Input");
			return;
		}
		
		System.out.print("empID  empName  empAge  empAddress");
		System.out.print(empDetails.getempId()+" "+empDetails.getempName()+" "+empDetails.getempAge()+" "+empDetails.getempAddress());
	}
	
	
	
	public void showAllDetails(List<Employee> empList) {
		System.out.print("empID  empName  empAge  empAddress");
		for(Employee showall : empList)
		{
			System.out.print(showall.getempId()+" "+showall.getempName()+" "+showall.getempAge()+" "+showall.getempAddress());
			
	}
	}
	
	
	public void deleteemp(List<Employee> empList) {
		System.out.print("Enter empId");
		long empIdDelete = ab.nextLong();
		Employee empDetails = null;
		for(Employee delete : empList) {
			if(delete.getempId()==empIdDelete||delete.getempId()==10125+empIdDelete) {
				empDetails=delete;
				break;
			}
		}
		if(empDetails==null) {
			System.out.print("Invalid Input");
			return;
		}
		empList.remove(empDetails);
		for(int i=0 ;i<empList.size();i++) {
			empList.get(i).setempId(10125+(i-1)+1);
		}
		System.out.print("Details deleted succesfully");
	}
	
}
