package week3.assignment2;

public class main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); // 인자가 없는 객체 생성
        Rectangle s = new Rectangle(1, 1, 2, 3); // 인자가 있는 객체 생성
        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if (r.equals(s)) {

            System.out.println("두 사각형은 같습니다.");
        }
    }
}