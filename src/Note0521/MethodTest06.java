package Note0521;
/*
    方法调用：
        1、方法的修饰符列表当中有static关键字，完整的调用方式是：类名.方法名（实参列表）
        2、但是，有的时候“类名.”什么情况下可以省略?
 */
public class MethodTest06 {
    public static void main(String[] args) {
        MethodTest06.m();
        //对于方法的修饰符列表当中有static关键字的"类名."可以省略不写吗
        m();

        //调用其它类【不是本类中的】中的方法
        A.doOther();

        //省略“类名”
        //编译
        //doOther();

    }
    public static void m(){
        System.out.println("m method execute!");
        m2();
        //不想调用当前本类当中的m2方法，这个时候必须添加“类名.”
        A.m2();

    }
    public static void m2(){
        System.out.println("m2 execute!");
    }
}
class A{
    public static void doOther(){
        System.out.println("A's doOther method invoke!");
    }
    public static void m2(){
        System.out.println("A's m2 method invoke!");
    }


}

