package test.proxy;

public class RealStar implements Star {

    @Override
    public void book() {
        System.out.println("real book");
    }

    @Override
    public String sing() {
        System.out.println("real sing");
        return "real sing";
    }
}
