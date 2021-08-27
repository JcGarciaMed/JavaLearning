package com.greymatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account bobsAccount = new Account();
        bobsAccount.setNumber("22558");
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("Jorge Garcia");
        bobsAccount.setCustomerEmailAddress("asdsa@gmail.com");
        bobsAccount.setCustomerPhoneNumber("087 0025886");

        bobsAccount.whithDrawal(100.0);
        bobsAccount.deposit(50.0);

        bobsAccount.deposit(51.1);
        bobsAccount.whithDrawal(100.0);


        Account georgeAccount = new Account("22558", 0.00, "Juan Garcia", "aaa@email.com", "0870055258");

        georgeAccount.whithDrawal(100.0);
        georgeAccount.deposit(50.0);

        georgeAccount.deposit(51.1);
        georgeAccount.whithDrawal(100.0);

        Account fioAccount = new Account("Fio", "fio@gmail.com", "12345");
        System.out.println(fioAccount.getNumber());

    }
}
