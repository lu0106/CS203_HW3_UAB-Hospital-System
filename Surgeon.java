public class Surgeon extends Hospital_Employee {
	
	private String specialty;
	private String operating;
	
	public Surgeon(String role,String name, String blazerId, String specialty, String operating) {
		
		super(role,name,blazerId);
		this.role = role;
		this.name = name;
		this.blazerId = blazerId;
		this.specialty = specialty;
		this.operating = operating;
	}
  
	public String getSpecialty() {
		return this.specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getOperating() {
		return this.operating;
	}
	public void setOperating(String operating) {
		this.operating = operating;
	}
   
	public String toString() {
		return "Surgeon Name: " + this.name + ", BlazerId: " + this.blazerId + ", Specialty: " + this.specialty + ", Operating: "+ this.operating;
	}
}
