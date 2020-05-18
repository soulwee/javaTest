package java8;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Java8Test{
    static String salutation = "hello";
    public static void main(String args[]){
        Thread thread = new Thread(() -> System.out.println("d"));
        Thread t = new Thread(() -> System.out.println("d"));

        Java8Test tester = new Java8Test();

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        //相当于上面
        MathOperation addition1 = (a, b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句 加分号;;;;;;;;;;;
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
        {salutation = "d";
        System.out.println(salutation + message);};

        int num = 0;
        GreetingService greetService12 = message ->
        {salutation = "d";
            System.out.println(salutation + message + num);};
        salutation = "d";
        //num = 3;
        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");

        String o1 = "d";
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        };
        ToIntFunction<Integer> toIntFunction = (Integer value) ->  value;

        Comparator.comparingInt(toIntFunction);
       // Comparator<String> Comparator = (o1, o2) -> Integer.compare(o1.length(),o2.length());

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
