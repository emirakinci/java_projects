public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("emirakinci", "12345", 0);
        
        atm.run(account);
        System.out.println("#### Programme is successfully terminated ####");
    }
}