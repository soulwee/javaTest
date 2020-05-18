package test.bean;

import test.annotation.Column;
import test.annotation.Table;

@Table("user")
public class User {
    @Column(name = "id",type = "number")
    String id;
    @Column(name = "name",type = "varchar")
    String name;
    @Column(name = "age",type = "number",length = 3)
    String age;


}
