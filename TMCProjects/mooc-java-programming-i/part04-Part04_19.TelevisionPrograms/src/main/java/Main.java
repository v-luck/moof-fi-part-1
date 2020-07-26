import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Name: ");
            String userChannel = scanner.nextLine();
            if (userChannel.isEmpty()) {
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram movie = new TelevisionProgram(userChannel, duration);
            programs.add(movie);
        }
        System.out.println("Program's maximum duration?");
        int maximumDuration = scanner.nextInt();
        for (TelevisionProgram movie : programs) {
            if (movie.getDuration() <= maximumDuration) {
                System.out.println(movie);
            }
        }


    }
}
