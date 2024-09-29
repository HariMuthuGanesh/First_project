import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int row1, col1, row2, col2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter row1 for A matrix::");
        row1 = scan.nextInt();
        System.out.println("Enter col1 for A matrix::");
        col1 = scan.nextInt();
        System.out.println("Enter row1 for B matrix::");
        row2 = scan.nextInt();
        System.out.println("Enter col1 for B matrix::");
        col2 = scan.nextInt();

        if (row1 == row2 && col1 == col2) {
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            int res[][] = new int[row1][col1];

            System.out.println("Enter Matrix A Elements::");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter Matrix B Elements::");
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    b[i][j] = scan.nextInt();
                }
            }

            System.out.println("Addition of two Matrices::");
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    res[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("Resultant Matrix::");
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Can't perform Addition...Matrix Order must be same");
        }
    }
}
