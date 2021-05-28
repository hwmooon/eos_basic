import java.util.Scanner;

public class assignment1 {
    public static void call(int a) throws ArrayIndexOutOfBoundsException {
        int[] array = {0, 1, 2, 3};
        if (a > 3 || a < 0)
            throw new ArrayIndexOutOfBoundsException();
        return array[a]

    }

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("call value : " + call(a));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("해당 문장은 무조건 수행");
        }
    }
}
    class ArrayIndexOutOfBoundsException extends Exception {
        public ArrayIndexOutOfBoundsException(){
            super("에러발생");
        }
    }
