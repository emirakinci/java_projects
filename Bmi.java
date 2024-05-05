
import java.util.Scanner;

public class Bmi {
    public static void main(String args[])
    {
        Scanner scanner  = new Scanner(System.in);
        double height, weight;
        System.out.print("Height (like 1.75):\t");
        height = scanner.nextDouble();
        System.out.print("Weight (like 80.0):\t");
        weight = scanner.nextDouble();

        System.out.println("\nyour BMI is: " + (weight / (height * height)));
    }
}