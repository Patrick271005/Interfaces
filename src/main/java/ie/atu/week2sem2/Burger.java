package ie.atu.week2sem2;

public class Burger implements Food {
    private String name;
    private double price;
    private String description;
//generate Constructor
    public Burger(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
//generate getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
