import java.io.*;

public class fileEx {

    public static void main(String[] a) throws IOException {

        FileInputStream fin = new FileInputStream("example.txt");

        System.out.println("Remaining bytes that can be read: " + fin.available());

        int content;
        while ((content = fin.read()) != -1) {
            System.out.print((char) content + " ");
            System.out.print(content + " ");
        }

        System.out.println("\nRemaining bytes that can be read: " + fin.available());

        fin.close(); 
    }
}
