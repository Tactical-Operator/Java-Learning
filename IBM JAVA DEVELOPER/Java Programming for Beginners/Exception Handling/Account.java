class LowBalanceException extends Exception {
    LowBalanceException(String msg) {
        super(msg); // to the Exception class
    }
}

class Bank {
    void withdraw(int balance, int amount) throws LowBalanceException {
        try {
            if (amount > balance) {
                throw new LowBalanceException("insufficient Balance the amount must be less than balance\n");
            }

            System.err.println("MOney Wihdrawn");
        } finally {
            System.out.println();
            System.out.println("Transaction finished\n");
        }
    }
}

public class Account {

 public static void main(String[] args){

    Bank b=new Bank();

    try{
        b.withdraw(1000,2000);
    }
    catch(LowBalanceException e){
        System.out.println(e.getMessage());
    }
 }
}