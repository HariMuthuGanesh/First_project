import java.util.Scanner;

public class Coding_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Number are::");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int table = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(table + "*" + i + "=" + table * i);
        }

        int size;
        System.out.println("Enter Size of an Array::");
        size = scan.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter the Array elements::");
        for (int i = 0; i < size; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Array Elements are::");
        for (int i = 0; i < size; i++) {
            System.out.println(arr1[i]);
        }

        if (size % 2 == 0) {
            System.out.println("Mid element is " + arr1[size / 2 - 1] + " and " + arr1[size / 2]);
        } else {
            System.out.println("Mid element is " + arr1[size / 2]);
        }
    }
}
