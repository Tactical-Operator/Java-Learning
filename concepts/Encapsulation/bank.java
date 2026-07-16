class BankAccount{
  private double balance;

  public void deposit(double amount){

    if(amount>0){
        balance=balance+amount;
    }
  }
  public void withdraw(double amount){
    if(amount<=balance){
        balance=balance-amount;
    }
  }

  public double get_balance(){

    return balance;
  }
}

class bank{
    public static void main(String []args){
        BankAccount b=new BankAccount();
        b.deposit(5000);
        b.withdraw(2000);
        System.out.println(b.get_balance());
    }
}