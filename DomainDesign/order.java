public class order implements calculator {
    private int orderID;
    private String customerName;
    private int quantity;
    private float productPrice;
    private int shippingCost;

    //getter and setter orderID
    public int getOrderID(){
        return orderID;
    }
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }

    // getter and setter customerName
    public String getCustomerName(){
        return  customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    //getter setter quantity
    public int getQuantity(){return quantity; }
    public void setQuantity(int quantity){ this.quantity = quantity; }

    // getter setter productPrice
    public float getProductPrice(){ return productPrice; }
    public void setProductPrice(int productPrice){ this.productPrice = productPrice; }

    // makes sure shipping cost is always 10 or 5 depending on which shipping option they choose.
    public void setShippingCost(int shippingCost){
        if (shippingCost == 10 || shippingCost == 5) {
            this.shippingCost = shippingCost;
        } else {
                this.shippingCost = 5;
            }
    }
    // calculates the cost of the order.
    public float calculate(){
       return quantity * productPrice + shippingCost;
    }
    // confirms order.
    public void placeOrder(){
        System.out.println("Order placed successfully!");
    }

    
}
