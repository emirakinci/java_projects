package figures;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operations = "1. Rectangle...\n" 
                            + "2. Square...\n"
                            + "Type 'q' for quitting...";

        while (true) {
            System.out.println("Which operation would you like to perform?");
            System.out.println(operations);
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("The programme is being terminated...");
                break;
            } else if (operation.equals("1")) {
                System.out.println("What are the long and short sides respectively?");
                int lside = scanner.nextInt();
                int sside = scanner.nextInt();
                scanner.nextLine();

                Figure figure1 = new Rectangle("Rectangle1", lside, sside);
                System.out.println("********************************");
                figure1.computeArea();
                figure1.computePerimeter();
                System.out.println("********************************");
            } else if (operation.equals("2")) {
                System.out.println("What is a side of your square?");
                int side = scanner.nextInt();
                scanner.nextLine();

                Figure figure2 = new Square("Square1", side);
                System.out.println("********************************");
                figure2.computeArea();
                figure2.computePerimeter();
                System.out.println("********************************");
            } else {
                System.out.println("********************************");
                System.out.println("Please pick an appropriate operation!!");
                System.out.println("********************************");
            }  
        }
        scanner.close();
    }
}