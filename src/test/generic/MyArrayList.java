package test.generic;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList<E extends Comparable<E>> {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        MyArrayList<Person> list2 = new MyArrayList<>();

    }
}
