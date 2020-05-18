package test.thread;

public class Test {
    public int count = 100;
    public static void main(String[] args) {
  /*     ThreadTest t = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        t.start();
        t2.start();
*/
     /*Runnabletest runnabletest = new Runnabletest();
        Thread t1 = new Thread(runnabletest);
      Thread t2 = new Thread(runnabletest);
        t1.start();
        t2.start(); */

     /*   RunnableTest2 runnabletest = new RunnableTest2();
        Thread t1 = new Thread(runnabletest);
        Thread t2 = new Thread(runnabletest);
        t1.start();
        t2.start();
*/
     /*   Locktest t = new Locktest();
        Locktest t2 = new Locktest();
        t.start();
        t2.start();*/


    /* final Test t = new Test();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               t.show2();
            }
        },"ttt");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                t.show2();
            }
        },"ddd");

        t1.start();
        t2.start();*/




    }
    public  void show2(){
        while (true){
        synchronized (this){

            if(count <= 0){
                break;
            }
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"================"+count--);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }

    }
    public synchronized void show(){
        while (true){
       // synchronized (this){

                if(count <= 0){
                    break;
                }
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+"================"+count--);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    //    }
    }
}
