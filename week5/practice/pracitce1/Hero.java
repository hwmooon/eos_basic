package week5.practice.pracitce1;

public class Hero {
    String name;
    int hp;
    int speed;
    int damage;
    Hero(String name, int hp, int speed, int damage){
        this.name= name;
        this.hp= hp;
        this.speed= speed;
        this.damage= damage;
    }
    void move(){
        System.out.println(
                name+"(이)가 "+speed+"의 속도로 이동합니다.");
    }
    void eSkill(){
        System.out.println(name+"(이)가 스킬을 사용했습니다.");
    }
    String getDetailInfo(){

        return "1";
    }
    void attack(Hero hero){
        System.out.println(
                name+"(이)가 "+hero.name+"을 공격해서 체력을 "+hp+"에서 "+(hero.hp-damage)+"로 깎았습니다."
        );
        hero.hp-=damage;
    }
}
class lucio extends Hero{

    lucio(String name, int hp, int speed, int damage) {
        super(name, hp, speed, damage);
    }
}

class hanzo extends Hero{

    hanzo(String name, int hp, int speed, int damage) {
        super(name, hp, speed, damage);
    }
}

