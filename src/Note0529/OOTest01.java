package Note0529;
/*
    对象的创建和使用
 */
public class OOTest01 {
    public static void main(String[] args) {

        //int是基本数据类型
        //i是一个变量名
        //10是一个int类型的字面值
        int i=10;

        //通过一个类可以实例化N个对象
        //实例化对象的语法：new 类名();
        //new是java语言当中的一个运算符。
        //new运算符的作用是创建对象，在JVM堆内存当中开辟新的内存空间
        //方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间当中。
        //栈内存：方法代码片段执行的时候，会给该方法分配内存空间,在栈内存中压栈。
        //堆内存：new的对象在堆内存中存储

        //Student是一个引用数据类型
        //s是一个变量名
        //new Student（）是一个学生对象
        //s是一个局部变量【在栈内存中存储】
        //什么是对象？new运算符在堆内存中开辟的内存空间称为对象。
        //什么是引用？引用是一个变量，只不过这个变量中保存了另一个java对象的内存地址
        //java语言当中，程序员不能直接操作堆内存，java中没有指针。不像C语言。
        //java语言当中，程序员只能通过“引用”去访问堆内存当中对象内部的实例变量。
        Student s=new Student();

        //访问实例变量的语法格式：
        //  读取数据：引用.变量名
        //  修改数据：引用.变量名=值
        /*int stuNo=s.no;
        String stuName=s.name;
        int stuAge=s.age;
        boolean stuSex=s.sex;
        String stuAddr=s.addr;

        System.out.println("学号="+stuNo);//0
        System.out.println("姓名="+stuName);//null
        System.out.println("年龄="+stuAge);//0
        System.out.println("性别="+stuSex);//false
        System.out.println("住址="+stuAddr);//null

         */
        System.out.println("学号="+s.no);//0
        System.out.println("姓名="+s.name);//null
        System.out.println("年龄="+s.age);//0
        System.out.println("性别="+s.sex);//false
        System.out.println("住址="+s.addr);//null

        s.no=10;
        s.name="jack";
        s.age=20;
        s.sex=true;
        s.addr="北京";
        System.out.println("学号="+s.no);//10
        System.out.println("姓名="+s.name);//jack
        System.out.println("年龄="+s.age);//20
        System.out.println("性别="+s.sex);//true
        System.out.println("住址="+s.addr);//北京

        //再通过类实例化一个全新的对象
        //stu是一个引用
        //stu同时也是一个局部变量
        //Student是变量的数据类型
        Student stu=new Student();
        //编译报错，no这个实例变量不能直接采用“类名”的方式访问
        //因为no是实例变量，对象级别的变量，变量存储在java对象的内部，必须现有对象
        //通过对象才能访问no这个实例变量，不能直接通过“类名”访问
        //System.out.println(Student.no);

    }

    //定义一个类，类名Student
    //Student是一个类，代表了所有的学生对象、是一个学生模板
    public static class Student {//定义一个公开的类，起名Student
        //类体=属性+方法
        //属性【描述的是对象的状态信息】
        //属性通常采用变量的方式来定义
        //在类体当中，方法体之外定义的变量被称为“成员变量”
        //成员变量没有赋值，系统赋默认值：一切向0看齐。
        //学号信息不能直接通过“类”去访问，所以这种成员变量又被叫做：实例变量
        //对象又被称为实例，实例变量又被称为的对象变量。【对象级别的变量】
        //不创建对象，这个no变量的内存空间是不存在的，只有创建了对象，这个no变量内存空间才会创建。
        int no;
        String name;
        int age;
        boolean sex;
        String addr;

        //方法描述的是对象的动作信息
    }
}
