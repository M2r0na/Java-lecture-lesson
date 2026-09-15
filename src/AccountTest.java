public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account("김자바", 10000);

        acc.deposit(5000);
        System.out.println("잔액: " + acc.getBalance());

        acc.withdraw(20000);
        acc.withdraw(3000);
        System.out.println("잔액: " + acc.getBalance());
    }
}