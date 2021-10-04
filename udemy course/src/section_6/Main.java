package section_6;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("911");
//        System.out.println("Model is " + porsche.getModel());
//    }

        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob brown", "BoB@gmail.com2", "0821234567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdraw(100);

        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);

        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);

        BankAccount timAccount = new BankAccount("Tim", " tim@gmail.com", "12345");
        System.out.println(timAccount.getNumber() + " name " + timAccount.getCustomerName());
    }
}
