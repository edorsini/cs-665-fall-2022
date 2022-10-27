package patterns.composite.eg2;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    MenuComponent lobsterRoll =
        new MenuItem("Lobster Roll", 24.99, false, "This is a popular choice..");

    MenuComponent vegetarianSalad = new MenuItem("Vegetarian Salad", 14.99, true, "Great choice..");
    Menu dinnerMenu = new Menu("Dinner Menu", "This menu includes the items after 6PM.");
    dinnerMenu.add(lobsterRoll);
    dinnerMenu.add(vegetarianSalad);


    MenuComponent americano =
        new MenuItem("Americano", 2.99, false, "This is a popular coffee choice..");
    MenuComponent chaiTea = new MenuItem("Chai Tea", 3.99, false, "This is a popular tea choice..");
    MenuComponent coffeeMenu =
        new Menu("Coffee Menu", "This menu includes the items all day for coffee and tea.");
    coffeeMenu.add(americano);
    coffeeMenu.add(chaiTea);

    ArrayList allMenus = new ArrayList();
    allMenus.add(dinnerMenu);
    allMenus.add(coffeeMenu);

    Waitress myWaitress = new Waitress(allMenus);

//    myWaitress.printVegetarianMenu();
    myWaitress.printMenu();

  }
}
