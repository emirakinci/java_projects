import java.util.Scanner;

public class Arrays3 {

    public static void printElements(int[] array)
    {
        int index = 0;
        for(int i=0; i<array.length; i++, index++)
        {
            System.out.println("array["+ index +"] = " + array[i]);
        }
    }
    public static void swapElements(int[] array, int index1, int index2)
    {
        int tmp;
        System.out.println("BEFORE:");
        printElements(array);
        System.out.println("*************");
        System.out.println("AFTER:");

        tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;

        printElements(array);
    }
    public static void main(String[] args) {
        int[] a = new int[5];
        int index_1, index_2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your numbers:");

        for(int i=0; i<5; i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.println("Which indexes do you want to swap?");
        index_1 = scanner.nextInt();
        index_2 = scanner.nextInt();

        swapElements(a, index_1, index_2);
        scanner.close();
    }
}