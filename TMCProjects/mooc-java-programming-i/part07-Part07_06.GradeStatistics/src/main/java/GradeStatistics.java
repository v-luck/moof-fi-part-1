import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> gradeList;

    public GradeStatistics() {
        this.gradeList = new ArrayList<>();
    }

    public void addGrade(int userGradeNumber) {
        if (userGradeNumber >= 0 && userGradeNumber <= 100) {
            gradeList.add(userGradeNumber);
        }
    }
    public int gradeSum() {
        int gradeSum = 0;
        for (int grade : gradeList) {
            gradeSum += grade;
        }
        return gradeSum;
    }
    public double gradeAverage() {
        return (double) gradeSum() / gradeList.size();
    }
    public ArrayList<Integer> passingGradeList() {
        ArrayList<Integer> passingGradeList = new ArrayList<>();
        for (int grade : gradeList) {
            if (grade >= 50) {
                passingGradeList.add(grade);
            }
        }
        return passingGradeList;
    }
    public int passingGradeSum() {
        int passingGradeSum = 0;
        for (int grade : passingGradeList()) {
            passingGradeSum += grade;
        }
        return passingGradeSum;
    }
    public double passingGradeAverage() {
        return (double) passingGradeSum() / passingGradeList().size();
    }

    public double passingGradePercentage() {
        if (passingGradeList().isEmpty() || gradeList.isEmpty()) {
            return 0.0;
        }
        return 100.0 *passingGradeList().size() / gradeList.size();
    }

    public void printGrades() {
        System.out.println("Point average (all): " + this.gradeAverage());
        if (passingGradeList().size() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.passingGradeAverage());
        }
        System.out.println("Pass percentage: " + passingGradePercentage());
    }
}
