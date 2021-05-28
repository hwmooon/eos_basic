package week1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("학번을 입력해주세요: ");
        Scanner sc=new Scanner(System.in);
        String 학번;
        학번=sc.next();
        System.out.print("이름을 입력해주세요: ");
        Scanner sca=new Scanner(System.in);
        String 이름;
        이름=sca.next();
        System.out.print("전화번호를 입력해주세요: ");
        Scanner scan=new Scanner(System.in);
        String 전번;
        전번=scan.nextLine();
        System.out.println("학번: "+학번);
        System.out.println("이름: "+이름);
        System.out.println("전화번호: "+전번);

    }
}
