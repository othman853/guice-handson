package handson.entities;

public class Product implements Injectable{

    private String name;
    private double price;

    public Product() {
        name = "Injectin";
        price = Math.random() * 10;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
