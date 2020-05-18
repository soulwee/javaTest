package test.thread;

public class SynchronizedDemo {
    //javap -v xxx.class > xxx.txt 生成汇编指令文件
    public synchronized void test2(){System.out.println("hello");}

    public void test(){
        synchronized (SynchronizedDemo.class){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {

    }
}
