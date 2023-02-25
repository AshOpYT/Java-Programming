class Student {
    String name;
    int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Marks {
    int s1, s2, s3, s4, s5, s6;

    public Marks(int s1, int s2, int s3, int s4, int s5, int s6) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
    }
}

class Result extends Student Marks {
    public Result(String name, int rollNo, int s1, int s2, int s3, int s4, int s5, int s6) {
        super(name, rollNo);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.s5 = s5;
        this.s6 = s6;
    }

    public int calculateTotal() {
        int total = s1 + s2 + s3 + s4 + s5 + s6;
        return total;
    }

    public float calculateAggregate() {
        int total = calculateTotal();
        float aggregate = total / 6.0f;
        return aggregate;
    }

    public String calculateGrade() {
        float aggregate = calculateAggregate();

        if (aggregate >= 75) {
            return "Distinction";
        } else if (60 <= aggregate && aggregate < 75) {
            return "First Division";
        } else if (50 <= aggregate && aggregate < 60) {
            return "Second Division";
        } else if (40 <= aggregate && aggregate < 50) {
            return "Third Division";
        } else {
            return "FAIL";
        }
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1: " + s1);
        System.out.println("Subject 2: " + s2);
        System.out.println("Subject 3: " + s3);
        System.out.println("Subject 4: " + s4);
        System.out.println("Subject 5: " + s5);
        System.out.println("Subject 6: " + s6);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Aggregate: " + calculateAggregate());
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Result result = new Result("John Doe", 123, 80, 70, 90, 85, 75, 65);
        result.displayResult();
    }
}
