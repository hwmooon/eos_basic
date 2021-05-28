package week3.assignment1;

public class Developer {
    String name;
    int salary;
    Developer(String name, int career){
        this.name=name;
        if (career<3){
            salary=2800+(100*career);
                    }
        else if (career<7){
            salary=3500+(100*career);
        }
        else {
            salary=4500+(100*career);
        }
    }

}
