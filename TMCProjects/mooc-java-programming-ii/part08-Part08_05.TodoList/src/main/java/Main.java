
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        list.add("himuffucka");
        list.add("did this mfoffuer");
        list.add("what di hee");
        list.print();
        list.remove(2);
        list.print();
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.print();

        //UserInterface ui = new UserInterface(list, scanner);
        //ui.start();

    }
}
