package week5.assignment2;

public class Student {
    void ShowInfo(){
        System.out.println("Student : study");
    }

}

class CSStudent extends Student{
    void ShowInfo(){
        System.out.println("CSStudent : study Coding");
    }
}

class KorStudent extends Student{
    void ShowInfo(){
        System.out.println("KorStudent : study Korena");
    }
}

class EngStudent extends Student{
    void ShowInfo(){
        System.out.println("EngStudent : sutdy English");
    }
}

class GraduateStudent extends Student{
    void ShowInfo(){
        System.out.println("GraduateStudent : get a job");
    }
}