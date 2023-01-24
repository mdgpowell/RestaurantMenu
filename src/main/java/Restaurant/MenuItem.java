package Restaurant;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    @Override
    public String toString() {
        return "\nCategory: " + category + "\nDescription: " + description + "\nPrice: $" + price;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        MenuItem item = (MenuItem) o;
        if (getDescription().equals(item.getDescription())
                && getCategory().equals(item.getCategory())
                && getPrice() == item.getPrice()) {
            return true;
        } else {
            return false;
        }
    }
}
