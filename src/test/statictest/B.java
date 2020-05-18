package test.statictest;

public class B extends A {
    public B(){
        System.out.println("b");
    }
    static {
        System.out.println("static b");
    }
}
