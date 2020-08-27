import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private GradeStatistics gradeStatistics;

    public UserInterface(Scanner scanner, GradeStatistics gradeStatistics) {
        this.scanner = scanner;
        this.gradeStatistics = gradeStatistics;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            Integer userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) {
                gradeStatistics.printGrades();
                break;
            }
            gradeStatistics.addGrade(userInput);
        }
    }
}
