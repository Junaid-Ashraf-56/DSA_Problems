package Multi_Threading.Lock;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(50);
            }
        };

        Thread t1 = new Thread(runnable," Thread 1 ");
        Thread t2 = new Thread(runnable," Thread 2 ");

        t1.start();
        t2.start();
    }
}
