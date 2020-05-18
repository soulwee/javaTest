package test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    Star star;

    public StarHandler(Star star){
        super();
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("book");
        Object invoke = method.invoke(star, args);
        System.out.println("after");
        return "handler:"+invoke;
    }
}
