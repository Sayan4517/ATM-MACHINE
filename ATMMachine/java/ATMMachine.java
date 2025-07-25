package ATMMachine.java;
import java.util.*;
class ATM{
    float Balance;
    int PIN=5674;
    public void checkPin(){
        System.out.println("enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enterPin=sc.nextInt();
        if(enterPin==PIN){
            menu();
        }
        else{
            System.out.println("enter a valid pin:");
        }
    }
    public void menu(){
        System.out.println("enter your choice:");
        System.out.println("1. check a/c balance");
        System.out.println("2.withdraw money");
        System.out.println("3.deposit money:");
        System.out.println("4.exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();

        }
        else if(opt==4){
            return;

        }else{
            System.out.println("enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("enter amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("insufficient balance");

        }else{
            Balance=Balance-amount;
            System.out.println("money withdrawl succesfully");

        }
        menu();
    }
    public void depositMoney() {
        System.out.println("enter amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("money deposit successfully");
        menu();
    }




}

public class ATMMachine {
    public static void main(String[] args) {
           ATM obj=new ATM();
           obj.checkPin();
    }
}
