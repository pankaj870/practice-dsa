package CollectionFrameWork;
import java.util.*;

public class ATM_project {
    protected static int balance = 1000;
    static  Scanner  scan = new Scanner(System.in);
    public static void menu(){
        System.out.println("********* menu ********");
        System.out.println("1 : balance");
        System.out.println("2 : withdrawal ");
        System.out.println("3 : deposit");
        System.out.println("4 : exit");
    }

    public static boolean showBalance(boolean flag){
        System.out.println("your balance is : "+balance);
        System.out.println(" continue press 1 : ");
        System.out.println("exit press 2 :");
        int cheak = scan.nextInt();
        if(cheak == 1){
            return  true;
        }else{
            System.out.println("please check pin : ");
        return false;
        }
    }

    protected static boolean pinCheck(String pin){
        return pin.equals("1234");
    }
    public static void withdrawal(){
        System.out.println("********** Withdrawal **********");
        System.out.print("enter the  amount : ");
        int amount = scan.nextInt();
        int count =0 ;
        while(count<3){
        System.out.print("4 digit PIN : ");
        String pin = scan.next();
        boolean check = pinCheck(pin);
        if(check){
        if(balance >= amount){
            balance -= amount;
            System.out.println("transition complete collect cash");
        }else{
            System.out.println("insuficient balance");
        }
        count=3;
        break;
    }else{
            count++;
        }
        }
    }

    public static  void  deposit( ){
        Scanner scan = new Scanner(System.in);

        System.out.println("*********** Deposit **********");
        System.out.print("enter the amount : ");
        int amount = scan.nextInt();
        balance += amount;
    }


    public static void main(String[] args) {

        boolean flag = true;
        while(flag) {
            menu();
            System.out.print("enter your choice : ");
            int choice = scan.nextInt();

            switch (choice){
                case 1 :
                    flag = showBalance(flag);
                    break ;
                case 2:
                    withdrawal();
                    flag =  showBalance(flag);
                    break;
                case 3:
                    deposit();
                    flag = showBalance(flag);
                    break;
                case 4:
                    flag=false;
                    break ;
            }
        }
    }
}
