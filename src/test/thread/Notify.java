package test.thread;

/**
 * sleep和wait
 * 相同点：都会阻塞线程
 * 不同点：sleep是Thread的静态方法 ，wait是Object的普通方法
 * sleep可以直接调用，wait只能在同步方法或代码块调用
 * sleep执行完会从阻塞进入就绪，获得cpu执行权后继续运行，wait需要通过notify或notifyAll被唤醒，
 *      即等待池（wait pool）中的线程进入等锁池（lock pool)
 * sleep不会放弃（释放）对象锁，wait会让当前线程放弃（释放）对象锁
 *
 * notify和notifyAll
 * notify是唤醒一个等待线程，是由jvm决定唤醒哪个，和线程优先级无关
 * notifyAll是唤醒所有等待线程，哪个线程竞争到对象锁就进入就绪状态
 *
 * yield是从运行状态进入就绪状态，不一定能礼让到，还是会抢占cpu资源
 */
public class Notify {

    public int i = 100;

    public void waiting(){
        synchronized (this){
            try {

                System.out.println(Thread.currentThread().getName()+"i'm waiting...");
                wait();

                System.out.println(Thread.currentThread().getName()+"i'm done.");


            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void minus(){
        synchronized (this){
            for (int j = 0; j < 20; j++) {
                System.out.println(Thread.currentThread().getName()+"--------:"+j);
            }
            notify();
        }

    }

    public static void main(String[] args) {
        Notify t = new Notify();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.waiting();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.minus();
            }
        }).start();
    }
}
