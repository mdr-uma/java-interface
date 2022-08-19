
//An interface is a completely "abstract class" that is used to group related methods with empty bodies.

interface Animal {
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig implements Animal {
	@Override
	public void animalSound() {
		// The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");	
	}

	@Override
	public void sleep() {
		// The body of sleep() is provided here
	    System.out.println("Zzz");
	}
}

//Multiple interface:

interface FirstInterface {
	public void myMethod(); // interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
	   System.out.println("Some text..");
	}
	
	public void myOtherMethod() {
	   System.out.println("Some other text...");
	}
}

public class App {
	public static void main(String[] args) {
		Pig myPig = new Pig();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	    
	    DemoClass myObj = new DemoClass();
	    myObj.myMethod();
	    myObj.myOtherMethod();

	}
}



