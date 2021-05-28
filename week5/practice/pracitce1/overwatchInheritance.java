package week5.practice.pracitce1;

import java.util.logging.Handler;
public class overwatchInheritance {

        public static void main(String[] args) {

            Hero hanzo= new hanzo("hanzo", 100, 50, 70);
            Hero lucio= new lucio("lucio", 80, 100, 40);

            hanzo.move();
            hanzo.eSkill();
            System.out.println(hanzo.getDetailInfo());

            lucio.move();
            lucio.eSkill();
            System.out.println(lucio.getDetailInfo());

            hanzo.attack(lucio);
            lucio.attack(hanzo);

            System.out.println(hanzo.getDetailInfo());
            System.out.println(lucio.getDetailInfo());
        }
    }

