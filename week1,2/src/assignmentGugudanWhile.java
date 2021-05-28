public class assignmentGugudanWhile {
    public static void main(String[] args) {
        int a=1,b=1;
        while(a<10){
            while(b<10){
                System.out.println(a+" * "+b+" = "+a*b);
                b++;}
            if(b==10){b=1; a++;}
        }
    }
}
