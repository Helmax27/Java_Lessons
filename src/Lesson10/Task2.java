package Lesson10;

public class Task2 {
    public static void main(String[] args) {
        Product prod = new Product("Арбуз", 0.25,5.2);
        Buy buy1 = new Buy("Pineaple", 10, 0.5);
        Check check = new Check("Pineaple", 10, 0.5);
        System.out.println(check.display());


    }

}

class Product {
    private String name;
    private double price;
    private double weight;

    public Product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}

class Buy extends Product {
    private double productPrices;

    public Buy(String name, double price, double weight) {
        super(name, price, weight);
        this.productPrices = totalPrice();
    }

    public double totalPrice() {
        productPrices = getPrice() * getWeight();
        return productPrices;
    }

    public double getProductPrices() { return productPrices; }

}

class Check extends Buy {
    public Check(String name, double price, double weight) {
        super(name, price, weight);
    }

    public String display() {
        return "Ваша покупка: " + getName() + " Общая стоимость "
                +  getProductPrices() + " По цене " + getPrice() + " Общее количество " + getWeight();
    }
}