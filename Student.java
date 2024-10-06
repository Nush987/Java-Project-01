public class Student extends Person {
    private int StudentID;

    public Student(String name, int age, int StudentID) {
        super(name, age);
        this.StudentID = StudentID;
    }

    public static void main(String[] args) {
        Student s = new Student("Dulara", 23, 2001);
        s.displayFullName();
        System.out.println(s.StudentID);
    }
}