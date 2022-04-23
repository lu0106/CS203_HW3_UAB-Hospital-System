public class Hospital_Employee {
	
	protected String role;
	protected String name;
	protected String blazerId;
  
	public Hospital_Employee(String role,String name, String blazerId) {
      
		this.role = role;
		this.name = name;
		this.blazerId = blazerId;
	}
  
	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlazerId() {
		return this.blazerId;
	}
	public void setBlazerId(String blazerId) {
		this.blazerId = blazerId;
	}

	public String toString() {
		return "Hospital Employee Name: " + this.name + ", blazerId: " + this.blazerId;
	}
}
