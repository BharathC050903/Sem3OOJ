/* toString() method */

import java.util.Scanner;

class book {
    String name;
    String author;
    int price;
    int numPages;

    book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String toString() {
        return "Book Name: " + this.name + "\n" +
                "Author Name: " + this.author + "\n" +
                "Book Price: " + this.price + "\n" +
                "Number of pages: " + this.numPages + "\n";
    }
}

class bookMain {
    public static void main(String[] args) {
        System.out.println("Bharath C\t1BMM22CS068");
        Scanner s = new Scanner(System.in);
        int n;
        String name;
        String author;
        int price;
        int numPages;

        System.out.println("Enter the number of book:");
        n = s.nextInt();

        book[] b;
        b = new book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Enter the book name");
            s.nextLine(); 
            name = s.nextLine();
            System.out.println("Enter the author");
            author = s.nextLine();
            System.out.println("Enter the price");
            price = s.nextInt();
            System.out.println("Enter the number of pages");
            numPages = s.nextInt();

            b[i] = new book(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + "\n" + b[i]);
        }
    }
  }