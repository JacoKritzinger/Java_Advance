package section_6;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("911");
//        System.out.println("Model is " + porsche.getModel());
//    }

//        vid 78

//        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob brown", "BoB@gmail.com2", "0821234567");
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdraw(100);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdraw(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdraw(100);
//
//        BankAccount timAccount = new BankAccount("Tim", " tim@gmail.com", "12345");
//        System.out.println(timAccount.getNumber() + " name " + timAccount.getCustomerName());

//        vid 80
//
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tom", 100.00, "Tom@email.com");
        System.out.println(person3.getName());

    }
}
