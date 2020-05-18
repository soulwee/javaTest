package test.generic;

import java.util.ArrayList;
import java.util.List;

public class MyList{
    /**
     * List<?> 是一个未知类型的List，而List<Object> 其实是任意类型的List。
     * 你可以把List<String>, List<Integer>赋值给List<?>，却不能把List<String>赋值给 List<Object>
     * @param args
     */
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list = list2;
        //list1 = list2; 类型不兼容，编译报错
    }
}
