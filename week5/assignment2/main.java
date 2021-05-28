package week5.assignment2;

public class main {
    public static void main(String[] args) {

        Student s1 = new CSStudent();
        Student s2 = new KorStudent();
        Student s3 = new EngStudent();
        Student s4 = new GraduateStudent();

        System.out.println("Student : study");
        s1.ShowInfo();
        s2.ShowInfo();
        s3.ShowInfo();
        s4.ShowInfo();
    }
}
