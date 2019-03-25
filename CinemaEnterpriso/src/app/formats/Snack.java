package app.formats;

public class Snack {
    private String snack;
    private double price;

    public Snack(String snack, double price) {
        this.snack = snack;
        this.price = price;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
