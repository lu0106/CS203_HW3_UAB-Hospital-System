public class Administrator extends Hospital_Employee {

	private String department;
	public Administrator(String role,String name, String blazerId, String department) {

		super(role,name,blazerId);
		this.role = role;
		this.name = name;
		this.blazerId = blazerId;
		this.department = department;
		
		}

	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return "Administrator Name: " + this.name + ", BlazerId: " + this.blazerId + ", Department: " + this.department;
	}
}
