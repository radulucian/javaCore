package object_classes.com;

//http://www.tutorialspoint.com/java/java_object_classes.htm
	
/*Constructors:
Each time a new object is created, at least one constructor will be invoked. 
The main rule of constructors is that they should have the same name as the class. A class can have more than one constructor.
Constructors have one purpose in life: to create an instance of a class. */

/*Creating an Object:
As mentioned previously, a class provides the blueprints for objects. So basically an object is created from a class. 
In Java, the new key word is used to create new objects.

There are three steps when creating an object from a class:
	Declaration: A variable declaration with a variable name with an object type.
	Instantiation: The 'new' key word is used to create the object.
	Initialization: The 'new' keyword is followed by a call to a constructor. This call initializes the new object.*/


/*Accessing Instance Variables and Methods:
Instance variables and methods are accessed via created objects. To access an instance variable the fully qualified path should be as follows:*/

/*First create an object
ObjectReference = new Constructor();*/

/*Now call a variable as follows
ObjectReference.variableName;*/

/*Now you can call a class method as follows
ObjectReference.MethodName();*/

public class Puppy{
	   
	   int puppyAge;

	   public Puppy(String name){
	      // This constructor has one parameter, name.
	      System.out.println("Name chosen is :" + name ); 
	   }
	   
	   public void setAge( int age ){
	       puppyAge = age;
	   }

	   public int getAge( ){
	       System.out.println("Puppy's age is :" + puppyAge ); 
	       return puppyAge;
	   }
	   
	   public static void main(String []args){
	      /* Object creation */
	      Puppy myPuppy = new Puppy( "tommy" );

	      /* Call class method to set puppy's age */
	      myPuppy.setAge( 2 );

	      /* Call another class method to get puppy's age */
	      myPuppy.getAge( );

	      /* You can access instance variable as follows as well */
	      System.out.println("Variable Value :" + myPuppy.puppyAge ); 
	   }
	}