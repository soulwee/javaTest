package test.thread;

import java.util.concurrent.locks.ReentrantLock;

public class Locktest extends Thread{
    public static int count = 10;
    static Object obj = new Object();
    static ReentrantLock lock = new ReentrantLock();

    public static synchronized void show(){


    }
    @Override
    public void run() {
        try {
           lock.lock();
            while (true) {
                if (count <= 0) {
                    break;
                }
                sleep(100);
                System.out.println(Thread.currentThread().getName() + "================" + count--);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
          lock.unlock();
        }
    }
}
