package object_classes.com;

/*As mentioned previously in this tutorial, processing starts from the main method. 
Therefore in-order for us to run this Employee class there should be main method and objects should be created. We will be creating a separate class for these tasks.
Given below is the EmployeeTest class, which creates two instances of the class Employee and invokes the methods for each object to assign values for each variable.*/

public class EmployeeTest{

	   public static void main(String args[]){
	       /* Create two objects using constructor */
		   Employee e1 = new Employee ("Stan Smith");
		   Employee e2 = new Employee ("Michael Dale");
		   
	       // Invoking methods for each object created
		   e1.setAge(34);
		   e1.setOccupation("Software Developer");
		   e1.setSalary(12302.23);
		   e1.printEmployeeDetails();
		   
		   e2.setAge(23);
		   e2.setOccupation("IT Specialist");
		   e2.setSalary(9839.231);
		   e2.printEmployeeDetails();
	   }
	}