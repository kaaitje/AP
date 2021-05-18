public class shipping_info {
    int shippingID;
    int shippingCost;
    String shippingType;

    // Getter and setter for shippingID
    public int getShippingID(){ return shippingID; }
    public void setShippingID(int shippingID){
        this.shippingID = shippingID;
    }

    // Getter for shippingCost
    public int getShippingCost(){
        return shippingCost;
    }
    // If the customer chose fast shipping, the cost becomes 10 else its 5.
    public void setShippingCost(int shippingCost){
        if (shippingType.equals("fast")) {
            this.shippingCost = 10;
        } else if (shippingType.equals("normal")){
            this.shippingCost = 5;
         // Mijn idee was om de prijs af te laten hangen van welke bezorgsnelheid er gekozen is maar dan loop je tegen
         // het probleem dat die ook nog niet gekozen kan zijn
        } else {
            this.shippingCost = 0;
        }
    }
    // Getter for shippingType
    public String getshippingType(){
        return shippingType;
    }

    // Makes sure its an valid input, if its an invalid input it becomes normal shipping.
    public void setShippingType(String shippingType) {
        if (shippingType.equals("fast") || shippingType.equals("normal")) {
            this.shippingType = shippingType;
        } else {
            this.shippingType = "normal";
        }
    }
}
