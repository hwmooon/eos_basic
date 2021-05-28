package assignment2;

interface Healer {
    public void healingAura ();//초당 체력회복 +10
    public void holyArmor ();//데미지 감소 -10
}

interface Sorcerer{
    public void fireArmor(); //주변 적 초당 데미지 +10
    public void thunderBlade(); //공격시 추가 데미지 +10
}

interface Tanker{
    public void increaseArmor(); // 아머 +5
    public void increaseHp(); // 체력 +100
}
public class Knight implements Tanker{
    String name;
    int Hp,Armor;
    void Knight(String name, int Hp, int Armor){

        this.name=name;
        this.Hp=Hp;
        this.Armor=Armor;

    }
    @Override
    public void increaseArmor() {
        System.out.println("["+this.name+"] increaseArmor() 시전!\n체력이 +100 증가합니다.");

    }

    @Override
    public void increaseHp() {
        System.out.println("["+this.name+"] increaseHp() 시전!\n체력이 +100 증가합니다.");

    }
}

class HolyKnight extends Knight implements Healer{

    public HolyKnight(String 우서, int i, int i1) {
        super();
    }


    public void increaseArmor(){

    }

    public void increaseHp(){

    }
    @Override
    public void healingAura() {

    }

    @Override
    public void holyArmor() {

    }
}

class MagicKnight extends Knight implements Sorcerer{

    public MagicKnight(String 아서스, int i, int i1) {
        super();
    }
    public void increaseArmor(){

    }

    public void increaseHp(){

    }

    @Override
    public void fireArmor() {

    }

    @Override
    public void thunderBlade() {

    }
}
