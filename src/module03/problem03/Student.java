package module03.problem03;

public class Student {
    String studentName;
    String nim;

    public Student(String studentName, String nim) {
        this.studentName = studentName;
        this.nim = nim;
    }

    public String getStudentName() {
        return studentName;
    }
    public String getNim() {
        return nim;
    }
}