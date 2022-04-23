public class Janitor extends Hospital_Employee {

	private String department;
	private String sweeping;
  
	public Janitor(String role,String name, String blazerId, String department, String sweeping) {
		
		super(role,name,blazerId);
		this.role = role;
		this.name = name;
		this.blazerId = blazerId;
		this.department = department;
		this.sweeping = sweeping;
	}
  
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSweeping() {
		return this.sweeping;
	}
	public void setSweeping(String sweeping) {
		this.sweeping = sweeping;
	}
	public String toString() {
		return "Janitor Name: " + this.name + ", blazerId: " + this.blazerId + ", Department: " + this.department + ", sweeping: "+ this.sweeping;
	}
}
