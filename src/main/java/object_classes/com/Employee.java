package object_classes.com;

/*For our case study, we will be creating two classes. They are Employee and EmployeeTest.

First open notepad and add the following code. Remember this is the Employee class and the class is a public class. 
Now, save this source file with the name Employee.java.

The Employee class has four instance variables name, age, designation and salary. 
The class has one explicitly defined constructor, which takes a parameter.*/

public class Employee{

		String name;
		int age;
		double salary;
		String occupation;
	
		// This is the constructor of the class Employee
		public Employee(String name){
			this.name = name;
		}

	    // Assign the age of the Employee  to the variable age.
		public int getAge() {
			return age;
		}
	
		public void setAge(int age) {
			this.age = age;
		}
	
	    /* Assign the designation to the variable designation.*/
		public String getOccupation() {
			return occupation;
		}

		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}

    
		/* Assign the salary to the variable	salary.*/
		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

	    /* Print the Employee details */
		public void printEmployeeDetails(){
			System.out.println("Name:" + this.name);
			System.out.println("Age:" + getAge());
			System.out.println("Salary:" + getSalary());
			System.out.println("Occupation:" + getOccupation());
		}
	 
	}