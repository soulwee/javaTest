package test.statictest;

public class Test {
    public static void main(String[] args) {
        A a = new B();
        a = new B();
        B b = (B)a;
        System.out.println(show());
    }

    public static int show(){
        try{
            System.out.println("111111111");
       //     return 2;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("2222222222");
            return 1;
        }
    }

    public static String reverse(String originStr){
        if(originStr==null||originStr.length()<=1)
            return originStr;
        return reverse(originStr.substring(1))+originStr.charAt(0);
    }
    //bcdefg  +a
    //cdefg  +b  +a
    //
}
