package test.thread;

public class DeadLockDemo {
     Object o1 = new Object();
     Object o2 = new Object();

    public static void main(String[] args) {
        DeadLockDemo demo = new DeadLockDemo();
        //第一种
        /*Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if("1".equals(Thread.currentThread().getName())){
                    demo.get();
                }else{
                    demo.get2();
                }

            }
        };
        new Thread(runnable,"1").start();
        new Thread(runnable,"2").start();*/
        //第二种
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.get();
            }
        },"1").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.get2();
            }
        },"2").start();
    }

    public void get(){
        synchronized (o1){
            System.out.println("拿到了o1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                System.out.println("拿到了o2");
            }
        }
    }
    public void get2(){
        synchronized (o2){
            System.out.println("拿到了o2");
            synchronized (o1){
                System.out.println("拿到了o1");
            }
        }
    }
}
