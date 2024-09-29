import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String playlist[] = new String[3];

        playlist[0] = "Vijay song 1";
        playlist[1] = "Vijay song 2";
        playlist[2] = "Vijay song 3";

        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }

        String playlists[] = { "s1", "s2", "s3" };

        for (int i = 0; i < playlists.length; i++) {
            System.out.println(playlists[i]);
        }

        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}
