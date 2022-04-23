import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class UAB_Hospital_System {


	public static void main(String[] args){

		   File file = new File("uabEmployee.txt");
	       Scanner s = null;
	       try {
	           s = new Scanner(file);
	       }
	       catch (IOException e) {
	    	   System.out.println(e);
	       }
	      
	       Scanner s1 = null;
	       try {
	           s1 = new Scanner(file);
	       }
	       catch (IOException e) {
	    	   System.out.println(e);
	       } 
	       
	       
	       int again = 0;

	       Hospital_Employee[] E = new Hospital_Employee[50];
	       int count[] = countemployee(s);
	       information(E,s1);
	       do {	       

	    	   System.out.println("1.Display the employee list");
		       System.out.println("2.Add an employee");
		       System.out.println("3.Delete an employee");
		       System.out.println("4.Update the data");
		       System.out.println("Enter Number");
		       Scanner c = new Scanner(System.in);
		       int choice = c.nextInt();
	       switch(choice)
	       {
	      
	      //Display
	          
	       case 1:{
	           System.out.println("**********************************\n" +
	                   "Welcome to the UAB Employee System\n**********************************\n" +
	                   "The UAB Hospital System has the following employees:");

	           
	           System.out.println("\nTotal Number of employees = " + count[0] +"\n");
	           System.out.println("Hospital Employees : " + count[1]);
	           System.out.println("Doctors : " + count[2]);
	           System.out.println("Surgeon : " + count[3]);
	           System.out.println("Nurses : "+ count[4]);
	           System.out.println("Administrators : " + count[5]);
	           System.out.println("Receptionist : " + count[6]);
	           System.out.println("Janitor : " + count[7] + "\n");
	           	      
	           System.out.println("******************************************************************************");

	           for(int i=0;i<50;i++) 
	           {
	        	   if(E[i] != null)
	        	   {
	        		   System.out.println(E[i]);
	        	   }
	           }

	           System.out.println("******************************************************************************");
	           System.out.println("\n!!!Cannot See the Modified Content Before Updating!!!\n");
	           System.out.println("Enter 1 to rerun the program\nEnter 2 to exit");
	           again = c.nextInt();
	           break;
	       }
	      //add
	      case 2:{
	    	  
	          System.out.println("Add 1.employee, 2.doctor, 3.surgeon, 4.nurse, 5.administrator, 6.receptionist, 7.janitor");
	          System.out.println("Enter Number");
		      Scanner add1 = new Scanner(System.in);
		      int add = add1.nextInt();
		      Scanner adde = new Scanner(System.in);
		      switch(add) {
		      case 1:{
	               System.out.println("Enter employee \nRole\nName\nblazerId");
	               for(int i=0;i<E.length;i++)
	               {
	                   if(E[i] == null)
	                   {
	                       E[i] = new Hospital_Employee(adde.next(),adde.next(),adde.next());
	                       break;
	                   }
	               }
	               break;
	           }
	           case 2:{
	               System.out.println("Enter doctor \nRole\nName\nblazerId\nSpecialty");
	               for(int i=0;i<E.length;i++)
	               {
	                   if(E[i] == null)
	                   {
	                       E[i] = new Doctor(adde.next(),adde.next(),adde.next(),adde.next());
	                       break;
	                   }
	               }
	               break;
	           }
	           case 3:{
	               System.out.println("Enter surgeon \nRole\nName\nblazerId\nSpecialty\nOperating");
	               for(int i=0;i<E.length;i++)
	               {
	                   if(E[i] == null)
	                   {
	                       E[i] = new Surgeon(adde.next(),adde.next(),adde.next(),adde.next(),adde.next());
	                       break;
	                   }
	               }
	               break;
	           }
	           case 4:{
	               System.out.println("Enter nurse \nRole\nName\nblazerId\nNumber Of Patients");
	               for(int i=0;i<E.length;i++)
	               {
	                   if(E[i] == null)
	                   {
	                       E[i] = new Nurse(adde.next(),adde.next(),adde.next(),adde.next());
	                       break;
	                   }
	               }
	               break;
	           }
	           case 5:{
	               System.out.println("Enter administrator \nRole\nName\nblazerId\nDepartment");
	               for(int i=0;i<E.length;i++)
	               {
	                   if(E[i] == null)
	                   {
	                       E[i] = new Administrator(adde.next(),adde.next(),adde.next(),adde.next());
	                       break;
	                   }
	               }
	               break;
	           }
	           case 6:{
	               System.out.println("Enter receptionist \nrole\nName\nblazerId\nDepartment\nAnswering");
	               for(int i=0;i<E.length;i++)
	               {
	                   if(E[i] == null)
	                   {
	                       E[i] = new Receptionist(adde.next(),adde.next(),adde.next(),adde.next(),adde.next());
	                       break;
	                   }
	               }
	               break;
	           }
	           case 7:{
	               System.out.println("Enter janitor \nRole\nName\nblazerId\nDepartment\nSweeping");
	               for(int i=0;i<E.length;i++)
	               {
	                   if(E[i] == null)
	                   {
	                       E[i] = new Janitor(adde.next(),adde.next(),adde.next(),adde.next(),adde.next());
	                       break;
	                   }
	               }
	               break;
	           }
		      }
	          System.out.println("\nEnter 1 to rerun the program\nEnter 2 to exit");
	          again = c.nextInt();
	    	  break;
	      }
	      //delete
	      case 3:{
	    	  System.out.println("Enter the role and blazerId");
		      Scanner delete = new Scanner(System.in);

	           String role = delete.next();
	           String blazerId = delete.next();
	          
	           for(int i=0;i<E.length;i++)
	           {
	               if(E[i].getBlazerId().equals(blazerId) && E[i].getRole().equals(role))
	               {
	            	   System.out.println(E[i]+" is successfully deleted");
	                   E[i] = null;
	                   break;
	               }
	           }
	          System.out.println("\nEnter 1 to rerun the program\nEnter 2 to exit");
	          again = c.nextInt();
	    	  break;
	      }
	      //update
	      case 4:{
	    	  try {
	              BufferedWriter out = new BufferedWriter(new FileWriter(file));
	              for(int i=0;i<E.length;i++)
	              {
	              if(E[i] != null) {
	              if(E[i].getRole().equals("E")){
	                  out.write(""+E[i].getRole() + " " + E[i].getName() + " " + E[i].getBlazerId());
	                  out.newLine();
	              }
	              if(E[i].getRole().equals("D")){
	                  Doctor D = (Doctor) E[i];
	                  out.write(""+D.getRole() + " " + D.getName() + " " + D.getBlazerId() + " " + D.getSpecialty());
	                  out.newLine();
	              }
	              if(E[i].getRole().equals("S")){
	                  Surgeon S = (Surgeon)E[i];
	                  out.write(""+S.getRole() + " " + S.getName() + " " + S.getBlazerId() + " " + S.getSpecialty() + " " + S.getOperating());
	                  out.newLine();
	              }
	              if(E[i].getRole().equals("N")){
	                  Nurse N = (Nurse)E[i];
	                  out.write(""+N.getRole() + " " + N.getName() + " " + N.getBlazerId() + " " + N.getNumberOfPatients());
	                  out.newLine();
	              }
	              if(E[i].getRole().equals("A")){
	                  Administrator A = (Administrator)E[i];
	                  out.write(""+A.getRole() + " " + A.getName() + " " + A.getBlazerId() + " " + A.getDepartment());
	                  out.newLine();
	              }
	              if(E[i].getRole().equals("R")){
	                  Receptionist R = (Receptionist)E[i];
	                  out.write(""+R.getRole() + " " + R.getName() + " " + R.getBlazerId() + " " + R.getDepartment() + " " + R.getAnswering());
	                  out.newLine();
	              };
	              if(E[i].getRole().equals("J")){
	                  Janitor J = (Janitor)E[i];
	                  out.write(""+J.getRole() + " " + J.getName() + " " + J.getBlazerId() + " " + J.getDepartment() + " " + J.getSweeping());
	                  out.newLine();
	              }
	              }
	              }
	              out.flush();
	              out.close();
	              s.close();
	          }
	    	  catch(IOException exp) {
	               exp.printStackTrace();
	           }
	    	System.out.println("reopen the program");  
          	again = 2;
	    	break;
	      }
	      }
	       }while(again == 1);
}


	private static void information(Hospital_Employee[] E, Scanner file) {


	String info[];
	for(int k=0;k<50;k++) {
	if(file.hasNext() == true)
    	{
    	info = file.nextLine().split(" ");
        if(info[0].equals("E")){

            loop:for(int i=0;i<E.length;i++)
            {
                if(E[i] == null)
                {
                    E[i] = new Hospital_Employee(info[0],info[1],info[2]);
                    break loop;
                }
            }
        }
        if(info[0].equals("D")){

            loop:for(int i=0;i<E.length;i++)
            {
                if(E[i] == null)
                {
                    E[i] = new Doctor(info[0],info[1],info[2],info[3]);
                    break loop;
                }
            }
        }
        if(info[0].equals("S")){
        	
            loop:for(int i=0;i<E.length;i++)
            {
                if(E[i] == null)
                {
                    E[i] = new Surgeon(info[0],info[1],info[2],info[3],info[4]);
                    break loop;
                }
            }
        }
        if(info[0].equals("N")){

            loop:for(int i=0;i<E.length;i++)
            {
                if(E[i] == null)
                {
                    E[i] = new Nurse(info[0],info[1],info[2],info[3]);
                    break loop;
                }
            }
        }
        if(info[0].equals("A")){

            loop:for(int i=0;i<E.length;i++)
            {
                if(E[i] == null)
                {
                    E[i] = new Administrator(info[0],info[1],info[2],info[3]);
                    break loop;
                }
            }
        }
        if(info[0].equals("R")){
        	
            loop:for(int i=0;i<E.length;i++)
            {
                if(E[i] == null)
                {
                    E[i] = new Receptionist(info[0],info[1],info[2],info[3],info[4]);
                    break loop;
                }
            }
        }
        if(info[0].equals("J")){
        	
            loop:for(int i=0;i<E.length;i++)
            {
                if(E[i] == null)
                {
                    E[i] = new Janitor(info[0],info[1],info[2],info[3],info[4]);
                    break loop;
                }
            }
        }
    	}
    }
	}
	private static int[] countemployee(Scanner file) {

		int count[] = {0,0,0,0,0,0,0,0};
		String info[];
		for(int k=0;k<50;k++) {
		if(file.hasNext() == true)
        	{
        	info = file.nextLine().split(" ");
            if(info[0].equals("E")){
                count[1]++;
                count[0]++;
            }
            if(info[0].equals("D")){
                count[2]++;
                count[0]++;
            }
            if(info[0].equals("S")){
                count[3]++;
                count[0]++;
              }
            if(info[0].equals("N")){
                count[4]++;
                count[0]++;
              }
            if(info[0].equals("A")){
                count[5]++;
                count[0]++;
             }
            if(info[0].equals("R")){
                count[6]++;
                count[0]++;
             }
            if(info[0].equals("J")){
                count[7]++;
                count[0]++; 
               }
        	}
        }
		return count;
     }
}