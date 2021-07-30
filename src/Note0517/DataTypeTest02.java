package Note0517;
/*
以下java程序主要讲解的是数据类型之：char类型
 */
public class DataTypeTest02 {
    public static void main(String[] args) {
        //定义一个char类型的变量，起名c，同时赋值字符’a‘
        char c='a';
        System.out.println(c);
        //一个中文占用2个字节，char类型正好是2个字节
        char x='国';
        System.out.println(x);

        //编译错误
        //ab是字符串不能使用单引号括起来
        //char y='ab'

        //"a"是字符串类型
        //k变量是char类型
        //类型不兼容，编译错误
        //char k="a";
    }
}
