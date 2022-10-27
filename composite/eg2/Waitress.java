package patterns.composite.eg2;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
  ArrayList<MenuComponent> allMenus = new ArrayList<>();

  public Waitress(ArrayList<MenuComponent> allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    for (MenuComponent menu : allMenus) {
      menu.print();
    }

  }

  public void printVegetarianMenu() {
    Iterator<MenuComponent> iterator = allMenus.iterator();

    // Print all vegan menu items
    while (iterator.hasNext()) {
      // get the menu
      MenuComponent menuComponent = iterator.next();

      try {
        // iterate through the menu
        for (int i = 0; i < menuComponent.getSize(); i++) {
          if (menuComponent.getChild(i).isVegetarian()) {
            menuComponent.getChild(i).print();
          }
        }
      } catch (UnsupportedOperationException e) {
        e.printStackTrace();
      }
    }
  }
}


