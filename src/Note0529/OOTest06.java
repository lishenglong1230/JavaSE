package Note0529;
/*
    需求：
        定义一个计算机类【电脑/笔记本】，计算机类有哪些属性：
            * 品牌
            * 型号
            * 颜色
        定义一个学生类：
            * 学号
            * 姓名
            * 学生有一台笔记本电脑
    所有的代码全部写到当前的java源文件当中
 */
public class OOTest06 {
    public static void main(String[] args) {
        Student1 s=new Student1();
        Computer c=new Computer();
        s.c=c;
        c.brand="神舟";
        s.name="小明";
        System.out.println(s.name+"用的是"+s.c.brand);
        //张三又买了一台新的电脑，原先的电脑扔了。
        s.c=new Computer();
        System.out.println(s.c.brand);//null
    }
}
class Computer{
    String brand;
    String style;
    String colour;
}
class Student1{
    int no;
    String name;
    Computer c;
}

