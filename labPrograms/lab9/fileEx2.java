import java.io.FileInputStream;
import java.io.IOException;

public class fileEx2 {
    public static void main(String[] a) throws IOException {
        FileInputStream fin = new FileInputStream("example.txt");

        byte[] bytes = new byte[20];
        int i;
        char c;

        i = fin.read(bytes);

        System.out.println("Number of bytes read: " + i);
        System.out.print("Bytes read: ");

        for (byte b : bytes) {
            c = (char) b;

            System.out.print(c);
        }
        fin.close(); 
    }
}
