package patterns.iterator;

public class FancyCars implements Cars {
	static final int MAX_NUMBER = 5;
	int numberOfCars = 0;
	String[] cars;
	
	public FancyCars() {
		cars = new String[MAX_NUMBER];
		
		addItem("Ferrari");
		addItem("Lamborghini");
		addItem("Tesla");
	}

	public void addItem(String carName) {
		if (numberOfCars >= MAX_NUMBER) {
			System.err.println("My garage is full!");
		} else {
			cars[numberOfCars] = carName;
			numberOfCars++; 
		}
	}
	
	public String[] getMyCars() {
		return cars;
	}
	
	
	public Iterator createIterator() {
		return new FancyCarIterator(cars);
	}
}
