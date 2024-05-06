public class Account {
    private String userName, password;
    private int balance;

    //constructor:

    public Account(String userN, String passW, int bal)
    {
        userName = userN;
        password = passW;
        balance = bal;
    }

    //methods:

    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("Your new balance is: " + balance);
    }

    public void withdraw(int amount)
    {
        if(amount > balance)
        {
            System.out.println("It is not possible to witdhraw an amount more than you have in your account!!");
        }
        else
        {
            balance -= amount;
            System.out.println("Your new balance is: " + balance);
        }
    }



    //getters and setters:

    public String getUserName(){
        return userName;
    }
    public void setUserName(String new_user_name)
    {
        userName = new_user_name;
    }

    public String getPassword(){
        return password;
    }
    public void setPaswword(String new_password)
    {
        password = new_password;
    }

    public int getBalance(){
        return balance;
    }
    public void setBalance(int new_balance)
    {
        balance = new_balance;
    }
}
