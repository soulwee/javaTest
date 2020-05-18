package test.reflect;

import test.annotation.Column;
import test.annotation.Table;
import test.bean.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.MarshalException;

public class Test {

    public static void print(int i){
        System.out.println(Thread.currentThread().getName()+"--------------"+i);
    }
    public static void main(String[] args) {
        try {
            createDDL();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void createDDL() throws Exception {
        Class c = User.class;
        Table table = (Table) c.getAnnotation(Table.class);
       // Method value = table.getClass().getMethod("value");
       // String tablename = (String)value.invoke(table,null);

        Field[] fields = c.getDeclaredFields();
        System.out.println("table:"+table.value());
        for (Field f : fields){
            Column column = f.getAnnotation(Column.class);
            System.out.println("field:"+f.getName()+",name:"+column.name()+",type:"+column.type()+",length:"+column.length());
        }


    }

}
