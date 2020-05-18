package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Star star = new RealStar();
        InvocationHandler handler = new StarHandler(star);
        Star o = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        String sing = o.sing();
        System.out.println(sing);
    }
}
