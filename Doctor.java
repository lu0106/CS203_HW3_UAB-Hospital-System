public class Doctor extends Hospital_Employee {
	
	private String specialty;
	
	public Doctor(String role,String name, String blazerId, String specialty) {
		
		super(role,name,blazerId);
		this.role = role;
		this.name = name;
		this.blazerId = blazerId;
		this.specialty = specialty;
	}

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

   public String toString() {
	   return "Doctor Name: " + this.name + ", blazerId: " + this.blazerId + ", Specialty: " + this.specialty;
   }
}
