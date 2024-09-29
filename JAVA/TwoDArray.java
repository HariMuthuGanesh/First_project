import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // ENHACNED FOR LOOP
        for (int ar[] : arr) {
            for (int val : ar) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // GET INPUT FROM USER
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Enter rows::");
        row = scan.nextInt();
        System.out.println("Enter cols::");
        col = scan.nextInt();
        int arr1[][] = new int[row][col];

        System.out.println("Enter elements::");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
