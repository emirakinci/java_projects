import java.util.Scanner;

public class Login {
    public boolean checkLogin(Account acc){
        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Type your username:");
        userName = scanner.nextLine();
        System.out.println("Type your password:");
        password = scanner.nextLine();

        if(userName.equals(acc.getUserName()) && password.equals(acc.getPassword()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
