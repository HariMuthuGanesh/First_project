import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderr {
    public static void main(String[] args) throws IOException {

        // Using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte b = Byte.parseByte(br.readLine());
        System.out.println(b);

        short s = Short.parseShort(br.readLine());
        System.out.println(s);

        int a = Integer.parseInt(br.readLine());
        System.out.println(a);

        long l = Long.parseLong(br.readLine());
        System.out.println(l);

        float f = Float.parseFloat(br.readLine());
        System.out.println(f);

        double d = Double.parseDouble(br.readLine());
        System.out.println(d);

        String str = br.readLine();
        System.out.println(str);

        boolean bool = Boolean.parseBoolean(br.readLine());
        System.out.println(bool);

    }

}