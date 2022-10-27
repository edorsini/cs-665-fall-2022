package patterns.iterator;

import java.util.ArrayList;

public class EconomyCarIterator implements Iterator {
	ArrayList<String> cars;
	int index = 0;
	
	public EconomyCarIterator(ArrayList<String> cars) {
		this.cars = cars;
	}

	public boolean hasNext() {
		if (index >= cars.size()) {
			return false;
		} else {
			return true;
		}
	}

	public String next() {
		String car = cars.get(index);
		index++;
		return car;
	}
}
