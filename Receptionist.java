public class Receptionist extends Hospital_Employee {
	
	private String department;
	private String answering;
	
	public Receptionist(String role,String name, String blazerId, String department, String answering) {
		
		super(role,name,blazerId);
		this.role = role;
		this.name = name;
		this.blazerId = blazerId;
		this.department = department;
		this.answering = answering;
	}
  
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAnswering() {
		return this.answering;
	}
	public void setAnswering(String answering) {
		this.answering = answering;
	}
	
	public String toString() {
		return "Receptionist Name: " + this.name + ", BlazerId: " + this.blazerId + ", Department: " + this.department + ", Answering: "+ this.answering;
	}
}
