package test.thread;

public class RunnableTest2 implements Runnable {
    private int count = 100;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(count > 0){
                    try {
                        Thread.sleep(100);
                        System.out.println(Thread.currentThread().getName()+"-------------------:"+count--);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }

        }
    }
}
