import java.util.Scanner;

interface Marks {
    void getMarks();
}

interface Total {
    void calcTotal();
}

interface Aggregate {
    void calcAggregate();
}

class Student implements Marks, Total, Aggregate {
    int[] marks = new int[6];
    int total;
    double aggregate;

    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks in python, c programming, Mathematics, Physics, Chemistry, Professional Ethics: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        sc.close();
    }

    public void calcTotal() {
        for (int mark : marks) {
            total += mark;
        }
    }

    public void calcAggregate() {
        calcTotal();
        aggregate = total / 6.0;
        String grade = (aggregate > 75) ? "DISTINCTION" :
                       (aggregate >= 60) ? "FIRST DIVISION" :
                       (aggregate >= 50) ? "SECOND DIVISION" :
                       (aggregate >= 40) ? "THIRD DIVISION" : "FAIL";
        System.out.printf("Aggregate = %.2f\nClass: %s", aggregate, grade);
    }
}
class StudentGrade {
    public static void main(String[] args) {
        Student s = new Student();
        s.getMarks();
        s.calcAggregate();
    }
}