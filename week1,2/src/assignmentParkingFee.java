public class assignmentParkingFee {
    public static void main(String[] args) {
        int[] time={5, 10, 12, 35, 60, 100, 300};
        int result=0;

        for(int n=0;n<time.length;n++){
            int number=time[n];
            int i = 0;
            if(number<10){
                i=0;}
            if(number==10){
                i=500;}
            if(number==12){
                i=500;}
            if(number==35){
                i=1000;}
            if(number==60){
                i=2500;}
            if(number==100){
                i=4500;}
            if(number==300){
                i=10000;}
            result += i;

            } System.out.println("주차 요금 합계는 총 "+result+"원입니다.");



        }
        }



