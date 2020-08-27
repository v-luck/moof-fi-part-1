import java.util.ArrayList;

public class GradeStatistics {
    private int gradeNumber;
    private int gradeAmount;
    private int gradePassingNumber;
    private int gradePassingAmount;
    private ArrayList<Integer> gradeList;

    public GradeStatistics() {
        this.gradeNumber = 0;
        this.gradeAmount = 0;
        this.gradePassingNumber = 0;
        this.gradePassingAmount = 0;
        this.gradeList = new ArrayList<>();
    }

    public void addGrade(int userGradeNumber) {
        if (userGradeNumber >= 0 && userGradeNumber <= 100) {
            gradeNumber += userGradeNumber;
            gradeAmount++;
            this.addingPassingGrade(userGradeNumber);
            this.gradeList.add(userGradeNumber);
        }
    }

    public void addingPassingGrade(int userGradeNumber) {
        if (userGradeNumber >= 50) {
            gradePassingNumber += userGradeNumber;
            gradePassingAmount ++;
        }
    }

    public double gradeAverage() {
        return 1.0 * this.gradeNumber / gradeAmount;
    }

    public double gradePassingAverage() {
        return 1.0 * gradePassingNumber/ gradePassingAmount;
    }

    public double gradePassingPercentage() {
        if (gradePassingAmount == 0 || gradeAmount == 0) {
            return 0.0;
        }
        return 100.0 *gradePassingAmount / gradeAmount;
    }

    public void printGradeDistribution() {
        for (int grade : gradeList) {

        }
    }

    public void printGrades() {
        System.out.println("Point average (all): " + this.gradeAverage());
        if (this.gradePassingNumber == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.gradePassingAverage());
        }
        System.out.println("Pass percentage: " + gradePassingPercentage());
    }
}
