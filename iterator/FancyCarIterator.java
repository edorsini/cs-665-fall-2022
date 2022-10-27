package patterns.iterator;

public class FancyCarIterator implements Iterator {
	String[] cars;
	int index = 0;
	
	public FancyCarIterator(String[] cars) {
		this.cars = cars;
	}

	public boolean hasNext() {
		if (index >= cars.length || cars[index] == null ) {
			return false;
		} else {
			return true;
		}
	}

	public String next() {
		String car = cars[index];
		index++;
		return car;
	}

}
