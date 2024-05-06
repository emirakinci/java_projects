import java.util.Scanner;

public class ATM {
    public void run(Account acc)
    {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        int numAttempt = 3;

        while (true) {
            if (login.checkLogin(acc)) {
                System.out.println("You have successfully logged into your account");
                break;
            }
            else
            {
                System.out.println("Try again...");
                numAttempt--;
                System.out.println("Remaining num of attempts: " + numAttempt);
            }
            if(numAttempt == 0)
            {
                System.out.println("You are out of chances");
                return;
            }
        }

        System.out.println("####################");
        String processes = "1. Show the amount\n"+
                           "2. Withdraw money\n"+
                           "3. Deposit money\n"+
                           "Press q for terminating the process";
        System.out.println("####################");
        System.out.println(processes);
        while (true) {
            System.out.println("Choose a process:");
            String option = scanner.nextLine();

            if(option.equals("q"))
            {
                break;
            }
            else if(option.equals("1"))
            {
                System.out.println(acc.getBalance());
            }
            else if(option.equals("2"))
            {
                System.out.println("How much you want to withdraw?");
                int amount = scanner.nextInt();
                scanner.nextLine();
                acc.withdraw(amount);
            }
            else if(option.equals("3"))
            {
                System.out.println("How much money you want to deposit?");
                int amount = scanner.nextInt();
                scanner.nextLine();
                acc.deposit(amount);
            }
            else
            {
                System.out.println("Please pick an appropriate process!");
            }
        }
    }
}
