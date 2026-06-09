package nivell01;

public class Product {
    //Attributes
    private String name;
    private float price;
    //Constructor
    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }
    //Getters
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = ' " + name + '\'' +
                ", price = " + price +
                '}';
    }
}
