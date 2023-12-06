public class User {
    private String username;
    
    private double balance;

    public User(String username) {
        this.username = username;
        this.balance = 0.0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return  username +  '}';
    }
}
