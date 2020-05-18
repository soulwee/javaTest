package test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callabletest implements Callable<Integer> {
    @Override
    public /*Object*/Integer call() throws Exception {
        System.out.println("call");
        return 1;
    }

    public static void main(String[] args) {
        FutureTask<Integer> futureTask = new FutureTask<>(new Callabletest());
        Thread t = new Thread(futureTask);
        t.start();

        try {
            Integer integer = futureTask.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
