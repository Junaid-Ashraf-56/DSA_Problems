package Multi_Threading.Lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    int balance = 1000;

    BankAccount(){
    }

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ amount);

        try{
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (amount<=balance){
                    try {
                            System.out.println(Thread.currentThread().getName() + " proceeding with withdraw ");
                            Thread.sleep(3000);
                            balance-=amount;
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                    System.out.println(Thread.currentThread().getName() + "withdraw completed ");
                }else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance ");
                }
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
        System.out.println(this.balance);
    }
}
