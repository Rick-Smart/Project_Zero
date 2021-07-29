package academy.learnprogramming;

public class User {

    private String userName;
    private String password;
    private boolean loggedIn;
    private int[] accounts;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.loggedIn = true;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public int[] getAccounts() {
        return accounts;
    }

    public void setAccounts(int[] accounts) {
        this.accounts = accounts;
    }
}
