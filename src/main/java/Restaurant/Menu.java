package Restaurant;
import java.util.ArrayList;
import java.util.Date;

/*
Design Outline:

Class Menu
	Field [private]: menuItems (ArrayList<MenuItem>)
	Field [private]: lastUpdated (Date)
	Methods: Getters and Setters
Class MenuItem
	Field [private]: price (double)
	Field [private]: description (String)
	Field [private]: category (String)
	Field [private]: new (boolean)
	Methods: Getters and Setters
 */
public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;
}
