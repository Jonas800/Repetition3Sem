public class Student extends Person {

    private int studentNumber;
    private double gradeAverage;

    public Student(){}
    public Student(Person person, int studentNumber, double gradeAverage){
        super(person);
        this.studentNumber = studentNumber;
        this.gradeAverage = gradeAverage;
    }

    @Override
    public String toString(){
        String s = super.toString() + ", " + studentNumber + ", " + gradeAverage;
        return s;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public boolean compareStudent (Student otherStudent){
        if(studentNumber == otherStudent.studentNumber){
            return true;
        }
        else{
            return false;
        }
    }
}