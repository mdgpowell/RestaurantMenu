package Restaurant;
import java.util.ArrayList;
import java.util.Date;

/*
Design Outline:

Class Menu
	Field [private]: menuItems (ArrayList<MenuItem>)
	Field [private]: lastUpdated (Date)
	Methods: Getters and Setters
	Instance Methods:
	    public void addItem(menuItem)
	    public void removeItem(menuItem)
	    public static Date getLastUpdated()
	    public String toString()
Class MenuItem
	Field [private]: price (double)
	Field [private]: description (String)
	Field [private]: category (String)
	Field [private]: new (boolean)
	Methods: Getters and Setters
	Instance Method:
	    public boolean isNew()
	    public String toString()
	    public boolean equals()
 */
public class Menu {
    private ArrayList<MenuItem> menuItems;
    private static Date lastUpdated;

    public Menu() {
        menuItems = new ArrayList<MenuItem>();
        lastUpdated = new Date();
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public static Date getLastUpdated() {
        return lastUpdated;
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
        lastUpdated = new Date();

    }
    public void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }
    public String toString() {
        String returnString = "\nMenu Items: ";
        for (MenuItem item : menuItems) {
            returnString += "\n"+ item.toString();
        }
        return returnString + "\n\nLast Updated: " + lastUpdated.toString();

    }

}
