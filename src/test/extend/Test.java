package test.extend;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Father.Inner2 f = new Father().new Inner2();
        Father.Inner inner = new Father.Inner();
        Father.Inner inner2 = new Father.Inner();
        Stack stack = new Stack();
        stack.pop();
    }
}
