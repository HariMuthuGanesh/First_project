public class EnhancedForLoop {
    public static void main(String[] args) {
        // 1-D Array
        int a[] = { 1, 2, 3, 4, 5 };
        // Using For Loop
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        // Using Enhanced For Loop
        for (int value : a) {
            System.out.print(value + " ");
        }

        System.out.println();

        // 2-D Array
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // Using For Loop
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        System.out.println();

        // Using Enhanced For Loop
        for (int temp[] : b) {
            for (int value : temp) {
                System.out.print(value + " ");
            }
        }
    }
}
