import java.util.Scanner;

public class assignment1 {
    public static void call(int a) throws ArrayIndexOutOfBoundsException{
        int[] array = {0, 1, 2, 3};
        if(a>3|| a<0)
            throw new ArrayIndexOutOfBoundsException();

        System.out.println("call value : " + array[a]);

    }
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            call(a);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("에러발생");
        }
    }
    public static void arrayError() throws ArrayIndexOutOfBoundsException{

            throw new ArrayIndexOutOfBoundsException();

    }
}