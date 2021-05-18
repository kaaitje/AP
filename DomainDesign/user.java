public class user {
    private int userID;
    private String password;

    // Getter and setter userID
    public int getUserID(){ return userID; }
    public void setUserID(int userID) { this.userID = userID; }

    // Getter and setter password
    public String getPassword(){ return password; }
    public void setPassword(String password) { this.password = password; }

    // Verifies login
    public void verifyLogin(){
        System.out.println("successfully logged in!");
    }
}