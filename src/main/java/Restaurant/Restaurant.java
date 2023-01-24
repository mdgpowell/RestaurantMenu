package Restaurant;

public class Restaurant {
    public static void main(String[] args) {
        Menu theMenu = new Menu();
        MenuItem fries = new MenuItem(3.99, "French fries", "side");
        MenuItem coke = new MenuItem(1.29, "Coca-Cola", "drink");
        MenuItem burger = new MenuItem(4.99, "Hamburger", "entree");

        theMenu.addItem(fries);
        theMenu.addItem(coke);
        theMenu.addItem(burger);

        System.out.println(theMenu);
        System.out.println(fries);
    }
}
