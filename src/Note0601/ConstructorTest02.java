package Note0601;
/*
 * 构造方法的作用：
 *      1、创建对象
 *      2、创建对象的同时，初始化实例变量的内存空间。
 * 成员变量之实例变量，属于对象级别的变量，这种变量必须先有对象才能实例变量。
 * 实例变量没有手动赋值的时候，系统默认赋值，那么这个系统默认赋值是在什么时候完成的呢？
 *      是在类加载的时候吗？
 *          不是，因为类加载的时候只加载了代码片段，还没来得及创建对象。所以此时实例变量并没有初始化。‘
 *
 *      实际上，实例变量的内存空间是在构造方法执行过程当中完成开辟的。完成初始化的。
 *      系统在默认赋值的时候，也是在构造方法执行过程中完成的赋值。
 *实例变量是存储在JVM的堆内存java对象内部。
 */
public class ConstructorTest02 {
    public static void main(String[] args) {
        //创建对象
        //查看访问的是哪个属性，查看访问的是哪个方法？
        //按ctrl键，鼠标移动到查看的元素，出现下划线的时候开始单击。
        //ctrl+o 查看属性和方法
        Account act1=new Account();
        System.out.println("账号:"+act1.getActno());//null
        System.out.println("余额:"+act1.getBalance());//0.0

        Account act2=new Account("110");
        System.out.println("账号:"+act2.getActno());//110
        System.out.println("余额:"+act2.getBalance());//0.0

        Account act3=new Account(10000.0);
        System.out.println("账号:"+act3.getActno());//null
        System.out.println("余额:"+act3.getBalance());//10000.0

        Account act4=new Account("act-001",10000.0);
        System.out.println("账号:"+act4.getActno());//act-001
        System.out.println("余额:"+act4.getBalance());//10000.0
    }
}
