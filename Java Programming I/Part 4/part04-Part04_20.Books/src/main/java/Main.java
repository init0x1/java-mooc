import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String bookTitle = scan.nextLine();

            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int bookPages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());

            books.add(new Book(bookTitle,bookPages,year));

        }

        System.out.println("What information will be printed?");
        String scope = scan.nextLine();

        if(scope.equals("everything")){
            for(Book book:books){
                System.out.println(book.toString());
            }
        }else{
            for(Book book:books){
                System.out.println(book.getTitle());
            }
        }


    }
}
