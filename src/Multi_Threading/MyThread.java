package Multi_Threading;

//I just want to see that how yield function is working in thread for priority.
public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running ");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(" Thread 1 ");
        t1.start();

        MyThread t2 = new MyThread(" Thread 2 ");
        t2.start();

    }
}
