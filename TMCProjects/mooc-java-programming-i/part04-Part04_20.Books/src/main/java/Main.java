import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Book> bookList = new ArrayList<>();
        while (true) {
            System.out.print("Title: ");
            String userTitle = scanner.nextLine();
            if (userTitle.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            Integer userPages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            Integer userYear = Integer.valueOf(scanner.nextLine());
            Book userBook = new Book(userTitle, userPages, userYear);
            bookList.add(userBook);
        }

        System.out.print("What information will be printed? ");
        String userValue = scanner.nextLine();
        System.out.println();
        if (userValue.equals("everything")) {
            for (Book book : bookList) {
                System.out.println(book);
            }
        } else if (userValue.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.returnName());
            }
        }

    }
}
