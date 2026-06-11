interface Payment{
    void pay(double amount);
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount){

        System.out.println("Processing UPI Payment of Rs "+amount);
        System.out.println("Verifying UPI ID");
        System.out.println("UPI Payment Successful");
    }
}

class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Processing Credit Card Payment of Rs "+amount);
        System.out.println("Checking Card Details...");
        System.out.println("Credit Card Payment Successful");

    }
}

class PayPalPayment implements Payment{

    @Override
    public void pay(double amount){
        System.out.println("Connecting to PayPal");
        System.out.println("PayPal Payment Successful");
    }
}

public class using_interface_class_example{
    public static void main(String args[]){

        System.out.println();

        Payment payment;
        payment =new UpiPayment();
        payment.pay(5000);

        System.out.println();

        payment=new CreditCardPayment();
        payment.pay(10000);

        System.out.println();

        payment =new PayPalPayment();
        payment.pay(15000);
        System.out.println();

    }
}