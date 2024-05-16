import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int index = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your numbers:");

        for(int i=0; i<5; i++)
        {
            a[i] = scanner.nextInt();
        }

        System.out.println("****************");
        
        for(int element : a)
        {
            System.out.println("a[" + index + "] = " + element);
            index++;
        }
    }
}