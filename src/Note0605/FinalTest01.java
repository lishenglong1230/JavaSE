package Note0605;
/*
    关于java语言当中final关键字：
        1、final是一个关键字，表示最终的，补课变得。
        2、final修饰的类无法被继承
        3、final修饰的方法无法被覆盖
        4、final修饰的变量"一旦"赋值之后，不可重新赋值【不可二次赋值】
        5、final修饰的实例变量，必须手动赋值，不能采用系统默认值
        6、final修饰的引用，一旦指向某个对象之后，不能在指向其它对象，那么被指向的对象无法被垃圾回收期回收。
            final修饰的引用虽然指向某个对象之后不能指向其它对象，但是所指向的对象内部的内存是可以被修改的。
        7、final修饰的实例变量，一般和static联合使用，被称为常量。
    对于以后大家所学习的类库，一般都是包括三个部分的：
        - 源码【可以看源码来理解程序】
        - 字节码【程序开发定的过程中使用的就是这部分】
        - 帮助文档【对开发提供帮助】
        注意使用的时候版本统一。
 */
public class FinalTest01 {
    public static void main(String[] args) {
        int i=10;
        System.out.println(i);
        i=20;
        System.out.println(i);
        final int k=100;
        //编译错误：无法为最终变量k分配值
        //k=200;
        final int m;
        m=200;
        //编译错误：无法为最终变量m分配值
        //m=300;
    }
}
