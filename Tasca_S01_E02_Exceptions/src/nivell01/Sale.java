package nivell01;

import java.util.ArrayList;
import java.util.List;


public class Sale {
    //Attributes
    private List<Product> productsList;
    private float totalPrice;

    //Constructor
    public Sale(){
        this.totalPrice = 0;
        this.productsList = new ArrayList<>();
    }
    //Getters and Setters
    public float getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(float totalPrice){
        this.totalPrice = totalPrice;
    }
    //Methods to manage the list.

    // add product
    public void addProduct(Product product){
        productsList.add(product);
    }
    // remove product
    public void removeProduct(Product product){
        productsList.remove(product);
    }
    // List products.
    public List<Product> getProductsList(){
        return productsList;
    }
    //Check if the list is empty. Using the personalized exception from the package class created.
    public void calculateTotal() throws EmptySaleException{
        if(productsList.isEmpty()){
            throw new EmptySaleException("Add products to the list.");
        }
        //Method to sum the prices of the products anf get the total price to pay.
        float suma =0;
        for(Product product : productsList){
            suma += product.getPrice();
        }
        this.totalPrice = suma;
    }
}
