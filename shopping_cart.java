public class shopping_cart implements calculator{
    private int cartID;
    private String productName;
    private int quantity;
    private float productPrice;

    // Getter and setter for cartID
    public int getCartID(){
        return cartID;
    }
    public void setCartID(int cartID){
        this.cartID = cartID;
    }

    // Getter and setter for productName
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    // Getter and setter for quantity
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    // Getter and setter for productPrice
    public float getProductPrice(){ return productPrice; }
    public void setProductPrice(float productPrice){ this.productPrice = productPrice; }

    // Calculates total shoppingCart price by multiplying the quantity with the productPrice.
    public float calculate(){
        return quantity * productPrice;
    }

    // adds product to cart
    public void addProduct(){
        System.out.println("Product added to cart!"); }
}
