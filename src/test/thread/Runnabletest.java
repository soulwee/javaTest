package test.thread;

import java.util.concurrent.locks.ReentrantLock;
//如果一个线程进入了对象的同步方法（获得了对象锁），
// 另一个线程不能进对象其他的同步方法，只能在等锁池等待，除非是静态的
public class Runnabletest implements Runnable {
    public Integer count = 100;
    public boolean flag = true;
    ReentrantLock lock = new ReentrantLock();

    public synchronized void aa(){
        System.out.println("aa");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public /*static*/ synchronized void bb(){
        System.out.println("bb");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runnabletest t = new Runnabletest();
        Thread t1 = new Thread(t,"aa");
        Thread t2 = new Thread(t,"bb");
        t1.start();
        t2.start();
    }

    public synchronized void show() {

          // synchronized (this){
       // lock.lock();
        try {
            /*while (true) {
                if (count <= 0) {
                    break;
                }*/
            if (count <= 0) {
                flag = false;
                return;
            }
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "-------------- :  " + count--);
           // }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          //  lock.unlock();
        }
   //       }
    }

    @Override
    public void run() {

          /*  while (flag) {

                show();
            }*/
          if(Thread.currentThread().getName().equals("aa")){
              aa();
          }else {
              bb();
          }
        System.out.println("run");

    }
}
