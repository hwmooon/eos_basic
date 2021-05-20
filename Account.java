import java.util.Scanner;
interface interface_account {
    void deposit(int money);

    void withdraw(int money);

    void showBalance();
}
    public class Account implements interface_account {



        private String accountNo;
        private int balance = 0;

        Account(String accountNo) {
            this.accountNo = accountNo;
        }

        @Override
        public void deposit(int money) {

            balance += money;

        }

        @Override
        public void withdraw(int money) {

            if(money>balance){
                System.out.println("잔고 부족!");
            }else {
                balance -= money;
            }
        }

        @Override
        public void showBalance() {
            System.out.println("계좌번호: " + accountNo);
            System.out.println("잔액: " + balance);

        }


        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            int num = 0;
            Account money = new Account("110-464-167257");

            while (num != 4) {
                System.out.println("----------------------------------");
                System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
                System.out.println("----------------------------------");
                System.out.print("선택>");
                num = sc.nextInt();
                sc.nextLine();
                if (num == 1) {
                    System.out.print("예금액>");
                    money.deposit(sc.nextInt());


                } else if (num == 2) {
                    System.out.print("출금액>");
                    money.withdraw(sc.nextInt());

                } else if (num == 3) {
                    money.showBalance();

                } else if (num != 4) {
                    System.out.println("입력 오류!");
                } else {
                    System.out.println("프로그램 종료");
                    break;

                }

            }
        }
    }