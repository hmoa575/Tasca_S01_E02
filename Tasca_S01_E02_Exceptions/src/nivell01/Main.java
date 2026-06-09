package nivell01;

public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale();

        //Check the exception. (no products yet added/)
        try {
            sale.calculateTotal();
        } catch (EmptySaleException exception) {
            System.out.println("Exception (No products yet added, list empty.) " + exception.getMessage());
        }

        // add products to the list.
        sale.addProduct(new Product("MacBook Air", 900));
        sale.addProduct(new Product("iPhone 17", 1200));
        sale.addProduct(new Product("MacBook Pro", 2400));

        try {
            sale.calculateTotal();
            System.out.println("Grand Total: " + sale.getTotalPrice() + " Euros");
        } catch(EmptySaleException exception){
            System.out.println("The product should not be here.");
        }
        //Test  the exception INdexOutOfBounds.
        System.out.println("\n Test: INdexOutOfBounds");
        try{
            String element = sale.getProductsList().get(5).getName();
        } catch (IndexOutOfBoundsException exception){
            System.out.println("The index is out of limit from the list: " + exception.getMessage());
        }

        // Exceptions checked vs Exceptions unchecked.

        //To change the exception: Now EmptySaleException extends RunTimeException.

        /*
        public class EmptySaleException extends RuntimeException{
        public EmptySaleException(String message){
        super (message);}}
        */

        //The method calculateTotal does not need the "throws EmptySaleException", try and catch are optional.
        /*
        sale.calculateTotal();
        if(products.isEmpty()){
            throw new EmptySaleException("No products yet added, list empty.");
        }
         */
    }
}
