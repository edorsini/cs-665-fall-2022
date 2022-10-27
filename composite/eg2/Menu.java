package patterns.composite.eg2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

  List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

  private String name;
  private String description;
  private Boolean vegetarian = false;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  public String getName() {
    return this.name;
  }

  public String getDescription() {
    return this.description;
  }

  public boolean isVegetarian() {
    return this.vegetarian;
  }

  public int getSize() {
    return this.menuComponents.size();
  }

  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  public MenuComponent getChild(int i) {
    return (MenuComponent) menuComponents.get(i);
  }

  public void print() {
    System.out.print("\n" + this.getName());
    System.out.println(", " + this.getDescription());
    Iterator<MenuComponent> iterator = menuComponents.iterator();

    // HERE IS THE IMPORTANT PART
    while (iterator.hasNext()) {
      MenuComponent menuComponent = (MenuComponent) iterator.next();
      menuComponent.print();
    }
  }


}
