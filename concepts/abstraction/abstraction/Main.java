// Banking System using Abstract Class


abstract class BankAccount{

     String accountNumber;
     String holderName;
     double balance;


    public BankAccount(String accountNumber,String holderName,double balance){

        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void deposit(double amount){

        balance+=amount;
        System.out.println("Deposited:" +amount);
        System.out.println("Balance:"+balance);
    }

    public void withdraw(double amount){

        if(amount>balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance -=amount;
        System.out.println("Withdrawn: "+amount);
        System.out.println("Balance:"+balance);
    }

    public void displayInfo(){
        System.out.println("\nAccount Number : "+accountNumber);
        System.out.println("Holder Name : "+holderName);
        System.out.println("Balance : "+balance);
    }
    
    // Abstract method 
    public abstract double calculateInterest();
}

// Savings Account class
class SavingsAccount extends BankAccount{
    public SavingsAccount(String accNo,String name, double balance){
        super(accNo,name,balance);
    }

    @Override // subclasses must implement abstract methods 
    public double calculateInterest(){
        return balance *0.05;
    }
}

// Current Account Class
class CurrentAccount extends BankAccount{
    public CurrentAccount(String accNo,String name,double balance){
        super(accNo,name,balance);

    }
    @Override
    public double calculateInterest(){
        return balance*0.02;
    }
    
}

public class Main{
    public static void main(String[] args){

        BankAccount account1=new SavingsAccount("101", "Ashwin Jadhav", 50000);

        BankAccount account2=new CurrentAccount("102", "Tactical", 80000);

        account1.deposit(10000);
        account1.withdraw(5000);

        account1.displayInfo();

        System.out.println("Interest : "+account1.calculateInterest());

        System.out.println();

        account2.displayInfo();

        System.out.println("Interest : "+account2.calculateInterest());

    }
}