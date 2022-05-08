package Unit_02;

/*
  	Abstract Class:
  		-An abstract class must be declared with an abstract keywords
  		
  	-Abstraction is the process of hiding the implementation details
  	 and showing the only functionality (function declaration) to the user.
  	-Can not make object of abstract class directly, but through derived class
  		
  		 -example of abstract method ?
  		  Abstract class may consists of abstract and non-abstract method.
  		 -(0-100%) abstract methods can be there !
  		 
  	In case of Interface 100% abstract method should be there!
  	
  	Final class
  	-The main purpose of using a class being declared as final is to prevent the class from being 
  		-If a class is marked as final then no class can inherit any feature from the final class.
  		-You can't extend a final class. If you try it gives you a compile time error.
  		
  		
 */

abstract class Bike {
	
	int a;
	Bike() {
		System.out.println("Inside Bike Constructor: "+ a + "\n");
	}
	
	abstract void run(); // abstract method ! (0-100%)
	
	void display() {
		System.out.println("This is display method!");
	}
}

class Honda extends Bike {

	@Override
	void run() {
		
		
	}
	
	
}

public class P10_Task02_AbstractAndFinalClassInJava {

	public static void main(String[] args) {
		Bike obj = new Honda();
		//obj.run();
		obj.display();
		
		//can not be instantiated
		//Bike obj2 = new Bike();
		
	}

}
//Final class 
final class Super {
	
	public int data = 38;
	
	void display() {
		System.out.println(data);
	}
}

/*
 public class Sub extends Super{
 
  void display() {
  display();
  	}
  } 
*/