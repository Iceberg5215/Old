package app.formats;

public class Drink {
    private String drink;
    private double price;

    public Drink(String drink, double price) {
        this.drink = drink;
        this.price = price;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
