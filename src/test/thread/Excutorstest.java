package test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Excutorstest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        });

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
        threadPoolExecutor.setCorePoolSize(2);
        threadPoolExecutor.shutdown();
        
    }
}
