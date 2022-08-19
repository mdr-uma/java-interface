
//An interface is a completely "abstract class" that is used to group related methods with empty bodies.

interface Animal {
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Pig implements Animal {
	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}


public class App {
	public static void main(String[] args) {

	}
}
