package java8;

import java.util.*;

public class ComparatorTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ace1", 26, 3000, 9922001);
        Employee e2 = new Employee("Ace2", 25, 2000, 5924001);
        Employee e3 = new Employee("Keith", 15, 4000, 3924401);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        /**
         *     @SuppressWarnings({"unchecked", "rawtypes"})
         *     default void sort(Comparator<? super E> c) {
         *         Object[] a = this.toArray();
         *         Arrays.sort(a, (Comparator) c);
         *         ListIterator<E> i = this.listIterator();
         *         for (Object e : a) {
         *             i.next();
         *             i.set((E) e);
         *         }
         *     }
         *
         *     sort 对象接收一个 Comparator 函数式接口，可以传入一个lambda表达式
         */
      //  employees.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

      //  Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));




        /**
         * Comparator.comparing 方法的使用
         *
         * comparing 方法接收一个 Function 函数式接口 ，通过一个 lambda 表达式传入
         *
         */
    //    employees.sort(Comparator.comparing(e -> e.getName()));

        /**
         * 该方法引用 Employee::getName 可以代替 lambda表达式
         */
       // employees.sort(Comparator.comparing(Employee::getName));


        //和comparing 方法一不同的是 该方法多了一个参数 keyComparator ，keyComparator 是创建一个自定义的比较器。
     /*   Collections.sort(employees, Comparator.comparing( Employee::getName, (s1, s2) -> {
                    return s2.compareTo(s1);
                }));
*/

        /**
         *  相反的排序规则
         */
      //  Collections.sort(employees, Comparator.comparing(Employee::getName).reversed());

     /*   使用 Comparator.nullsFirst进行排序
        当集合中存在null元素时，可以使用针对null友好的比较器，null元素排在集合的最前面*/

   /*     employees.add(null);  //插入一个null元素
        Collections.sort(employees, Comparator.nullsFirst(Comparator.comparing(Employee::getName)));
        employees.forEach(System.out::println);

        Collections.sort(employees, Comparator.nullsLast(Comparator.comparing(Employee::getName)));
*/
   //首先使用 name 排序，紧接着在使用age 排序，来看下使用效果
        //说明如果已经排好了 不会再进行age排 ，除非有相同的结果
    //    Collections.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));

        //    employees.sort(Comparator.comparing(e -> e.getName()));
     //   Collections.sort(employees, Comparator.comparingInt(e -> e.getAge()));
     //   employees.sort(Comparator.comparingInt(e -> e.getAge()));
        employees.sort(Comparator.comparingDouble((Employee e) -> e.getSalary()).reversed().thenComparingInt(e -> e.getAge()));

        employees.forEach(System.out::println);

    }

}
