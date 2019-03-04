package project;

public class Bank {
    private void getBankName() {
        System.out.println("Bank");
    }
    public static void main(String[] args) {
        Bank bank = new MyBank();
        bank.getBankName();
    }
}

class MyBank extends Bank {
    public void getBankName() {
        System.out.println("MyBank");
    }
}