package patterns.decorator;

public class Leather extends FeatureDecorator {
	// IS-AND and HAS A RELATIONSHIP....


	public Leather(Car car) {
		this.car = car;
	}
	
	public double getCost() {
		return 3000 + car.getCost();
	}

	public String getDescription() {
		return car.getDescription() + ", " + "includes leather seats";
	}

}
