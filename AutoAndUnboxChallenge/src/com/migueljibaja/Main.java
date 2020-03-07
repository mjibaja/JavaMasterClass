package com.migueljibaja;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Interbank");
        bank.addBranch("Jockey Plaza");
        bank.addCustomer("Jockey Plaza","Miguel", 1500.30);
        bank.addCustomer("Jockey Plaza","Laura", 900.10);
        bank.addCustomer("Jockey Plaza","Majo", 1300.00);

        bank.addBranch("La Rambla");
        bank.addCustomer("La Rambla","Nelly", 2200);

        bank.addCustomerTransaction("Jockey Plaza","Miguel",100);
        bank.addCustomerTransaction("Jockey Plaza","Miguel",15.50);
        bank.addCustomerTransaction("Jockey Plaza","Majo",300);

        bank.listCustomers("Jockey Plaza",true  );

        

    }
}
