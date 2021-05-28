package week3.assignment2;

public class Rectangle {
    int x1=0, y1=0, x2=0, y2=0;
    int square(){
        return (x2-x1)*(y2-y1);
    }
    Rectangle(){}
    Rectangle(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;}
    void show(){
        System.out.println("x1 : "+x1+", y1 : "+y1+", x2 : "+x2+", y2 : "+y2+"\n"+"넓이 : "+square());
    }
    void set(int x1, int y1, int x2, int y2){
        this.x1= x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    boolean equals(Rectangle r){
        if((r.x2-r.x1)==(x2-x1)&& (r.y2-r.y1)==(y2-y1)){
            return true;
        }
        else{
            return false;
        }
    }

}
