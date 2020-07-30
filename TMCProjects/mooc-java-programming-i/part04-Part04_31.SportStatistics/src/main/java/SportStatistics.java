
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        ArrayList<String[]> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String fileLine = scanner.nextLine();
                String[] splitFileLine = fileLine.split(",");
                lines.add(splitFileLine);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int score = 0;
        int win = 0;
        int losses = 0;

        System.out.println("Team:");
        String userTeam = scan.nextLine();
        for (String[] line : lines) {
            for (int i = 0; i < 2; i ++) {
                if (line[i].equals(userTeam)) {
                    score ++;
                    if (i == 0) {
                        if (Integer.valueOf(line[2]) > Integer.valueOf(line[3])) {
                            win ++;
                        } else if (Integer.valueOf(line[3]) > Integer.valueOf(line[2])) {
                            losses ++;
                        }
                    } else {
                        if (Integer.valueOf(line[2]) > Integer.valueOf(line[3])) {
                            losses ++;
                        } else if (Integer.valueOf(line[3]) > Integer.valueOf(line[2])) {
                            win ++;
                        }

                    }
                }
            }
        }
        System.out.println("Games: " + score);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + losses);

    }

}
