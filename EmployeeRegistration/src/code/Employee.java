package code;

public class Employee {

long empId;
String empName;
int empAge;
String empAddress;
Employee(long empId, String empName, int empAge, String empAddress){
	this.empId = empId;
	this.empName = empName;
	this.empAge = empAge;
	this.empAddress = empAddress;
}
public void setempId(long empId) {
	this.empId = empId;
}
public long getempId() {
	return empId;
}
public void setempName(String empName) {
	this.empName = empName;
}
public String getempName() {
	return empName;
}
public void setempAge(int empAge) {
	this.empAge = empAge;
}
public int getempAge() {
	return empAge;
}
public void setempAddress(String empAddress) {
	this.empAddress = empAddress;
}
public String getempAddress() {
	return empAddress;
}
}
