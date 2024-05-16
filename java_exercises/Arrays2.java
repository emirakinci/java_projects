import java.util.Scanner;

public class Arrays2 {

    public static void printElements(int[] array)
    {
        int index = 0;
        for(int element:array)
        {
            System.out.println("array[" + index +"] = " + element);
            index++;
        }
         /*
         * or similarly
         * 
         * for(int i=0; i<array.length; i++)
         * {
         *      System.out.println("array[" + index +"] = " + array[i]);
         
         * }
         * 
         */
    }
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your numbers:");

        for(int i=0; i<5; i++)
        {
            a[i] = scanner.nextInt();
        }

        System.out.println("****************");
        printElements(a);

        scanner.close();
    }
}
