import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter the Size::");
        size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}
