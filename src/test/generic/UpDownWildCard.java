package test.generic;

import java.util.ArrayList;
import java.util.List;

public class UpDownWildCard {



    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food());
        foods.add(new Food());

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit());
        fruits.add(new Fruit());

        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());

        //upMethod(foods);
        upMethod(fruits);
        upMethod(apples);

        downMethod(foods);
        downMethod(fruits);
       // downMethod(apples);
    }
    //上界通配符，用来获取
    public static void upMethod(List<? extends Fruit> list){
        //list.add(new Apple()); 因为不能确定是否其他子类型，所以适合获取数据
        Fruit fruit = list.get(0);
    }

    //下界通配符，用来添加
    public static void downMethod(List<? super Fruit> list){
        Object object = list.get(0);
       // list.add(new Food());
        list.add(new Apple()); //因为不能确定父类只有Food一个，所以只能加本身或子类
    }
}
class Food{}
class Fruit extends Food{}
class Apple extends Fruit{}
class Peach extends Fruit{}

