package patterns.iterator;

import java.util.ArrayList;

public class EconomyCars implements Cars {
	ArrayList<String> cars;
	
	public EconomyCars() {
		cars = new ArrayList<String>();
		
		addItem("Honda Civic");
		addItem("Toyota Corolla");
	}
	
	public void addItem(String carName) {
		cars.add(carName);
	}
	
	public ArrayList<String> getMyCars() {
		return cars;
	}
	
	public Iterator createIterator() {
		return new EconomyCarIterator(cars);
	}
	
	public String toString() {
		return "My economical cars!";
	}

}
