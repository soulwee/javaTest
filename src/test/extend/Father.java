package test.extend;

public class Father {

    private int a = 0;

    public void ff(){
        System.out.println("gg"+a);
    }
    public void gg(){
        ff();
    }
    class Inner2{
        public void inner2(){
            System.out.println("inner");
        }
    }
    static class Inner{
        public void inner(){
            System.out.println("inner");
        }
    }


}
