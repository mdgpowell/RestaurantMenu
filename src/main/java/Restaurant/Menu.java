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

    public void addItem(MenuItem item) {

    }
    public void removeItem(MenuItem item) {

    }
    public static Date getLastUpdated() {
        return lastUpdated;
    }
}
