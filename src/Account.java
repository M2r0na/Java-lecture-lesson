public class Account {
    private String owner;
    private int balance;

    Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("잘못된 금액입니다.");
            return;
        }
        balance += amount;
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }
}