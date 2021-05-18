public class customer extends user {
    private String customerName;
    private String streetName;
    private int phoneNumber;
    private String email;

    // getter and setter for customerName
    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }


    // getter and setter for streetName
    public String getStreetName(){
        return streetName;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }


    // getter and setter for phoneNumber
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    // getter and setter for email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // creates a new account
    public void register() {
        System.out.println("account registered successfully");
    }

    //updates profile.
    public void updateProfile() {
        System.out.println("profile updated successfully");
    }

}
