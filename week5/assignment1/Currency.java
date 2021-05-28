package week5.assignment1;

public class Currency {
    double amount;
    String unit;
    Currency(double amount, String unit){
        this.amount = amount;
        this.unit= unit;
    }

    public String toString(){
        return amount+" "+unit;
    }

}


class KRW extends Currency{
    KRW(double amount, String unit){
        super(amount, unit);
    }
    public String toString(){
        return "KRW : "+super.toString();
    }

}

class USD extends Currency {
    USD(double amount, String unit) {
        super(amount, unit);
    }

    public String toString() {
        return "USD : " + super.toString();


    }
}

class EUR extends Currency{
    EUR(double amount, String unit) {
        super(amount, unit);
    }
    public String toString(){
        return "EUR : "+super.toString();
}


}

class JPY extends Currency{
    JPY(double amount, String unit) {
        super(amount, unit);
    }
    public String toString() {
        return "KRW : " + super.toString();
    }
}