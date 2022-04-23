public class Nurse extends Hospital_Employee {
	
	private String numberOfPatients;
  
	public Nurse(String role,String name, String blazerId,String numberOfPatients) {
		
		super(role,name, blazerId);
		this.role = role;
		this.name = name;
		this.blazerId = blazerId;
		this.numberOfPatients = numberOfPatients;
	}
  
	public String getNumberOfPatients() {
		return this.numberOfPatients;
	}
	public void setNumberOfPatients(String numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}
	public String toString() {
		return "Nurse Name: " + this.name + ", BlazerId:" + this.blazerId + ", Number Of Patients:" + this.numberOfPatients;
	}
}
