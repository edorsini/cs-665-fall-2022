package patterns.decorator;

public abstract class FeatureDecorator extends Car { // IS-A
	Car car; // HAS-A

	public abstract String getDescription();
	public abstract double getCost();

}
