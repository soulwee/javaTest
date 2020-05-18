package test.thread;


public class ThreadTest extends Thread{
    public static Integer count = 100;
    static Object obj = new Object();

    public static /*synchronized*/ void show(){

            if(count > 0){
                try {
                    sleep(100);
                    System.out.println(Thread.currentThread().getName()+"================"+count--);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
    }
    @Override
    public void run() {

            while (true) {
                synchronized (count){
                show();
            }
        }

    }
}
