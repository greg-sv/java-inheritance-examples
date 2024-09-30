// our base class all subclasses will inherit its public and protected methods and fields. 
public class Animal
{
	// declare fields protected if you want subclasses to have access to fields and private methods in the base class. 
	// protected methods are avaliable to the child classes put are not available publically to other objects. 
	protected String type;
	protected int numOfLegs;
	protected double weight;
	proteced int age;
	
	public Animal(String animalType, int totalLegs, double pounds, int yearsOld)
	{
		type = animalType;
		numOfLegs = totalLegs;
		weight = pounds;
		age = yearsOld;
	}
	
	public int getNumOfLegs() { return numOfLegs; }
	public String getType() { return type; }
	public double getWeight() { return weight; }
	public int getAge() { return age; }
	
	protected boolean updateLegCount(int newLegs) { numOfLegs = newLegs; }
}


/* Dogs are a type of animal so they will extend the Animal class */
public class Dog extends Animal
{
	public Dog(double weight)
	{
		// we call our base class first to init the fields.
		super("Dog", 4, weight);
	}
	
	
	@Override
	public String toString()
	{
		return "Animal Type is: + getType() + "\nAnimal Weight: " + getWeight() + "\nAnimal Leg Count: " + getNumOfLegs() + "\n";
	}
	
	
	
	
}

/* main class */ 
public class Main
{
	private Animal dog = new Dog("Dog", 4, 13.5, 2);
	private Dog otherDog = new Dog("Dog", 4, 55, 5);
	
	public static void main(String args[])
	{
		System.out.println(dog);
		System.out.println(otherDog);
		System.out.println( (dog.updateLegCount(5)) ? "Updated Leg Count, New Total: " + getNumOfLegs() : "Update failed"); 
		otherDog.updateLegCount(6);
	}
	
}
