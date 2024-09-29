import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the rows::");
        row = scan.nextInt();
        System.out.println("Enter the Columns::");
        col = scan.nextInt();

        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
