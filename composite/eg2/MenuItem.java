package patterns.composite.eg2;

public class MenuItem extends MenuComponent {
  private String name;
  private String description;
  private boolean vegetarian;
  private double price;

  public MenuItem(String name, double price, boolean vegetarian, String description) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.vegetarian = vegetarian;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public boolean isVegetarian() {
    return this.vegetarian;
  }

  public void print() {
    System.out.println(this.name);
  }

}

