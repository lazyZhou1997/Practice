package thread;

public class Thread1 {

    int i = 0;

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        MyThread myThread1 = new MyThread(thread1);
        MyThread myThread2 = new MyThread(thread1);
        MyThread myThread3 = new MyThread(thread1);
        myThread1.start();
        myThread2.start();
        myThread3.start();

    }

    public void fori() throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "  in:");

        synchronized (this) {
            while (i < 100) {
                System.out.println(Thread.currentThread().getName() + "  " + i);
                i++;

                if (i == 50) {

                    wait();
                }
            }

            notifyAll();
        }
    }
}

class MyThread extends Thread {

    Thread1 thread1;

    public MyThread(Thread1 thread1) {

        this.thread1 = thread1;

    }

    @Override
    public void run() {
        try {
            thread1.fori();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}



