package Note0517;
/*
    关于java语言当中的整数型：
        数据类型        占用空间大小      默认值     取值范围
------------------------------------------------------------
        byte              1             0       [-128~127]
        short             2             0       [-32768~32767]
        int               4             0       [-2147483648~2147483647]
        long              8             0L
1、java语言当中的“整数型字面值”被默认当做int类型来处理。要让这个“整数型字面值”被当做long
类型来处理的话，需要在“整数型字面值”后面添加l/L，建议使用大写的L
2、java语言当中的整数型字面值有三种表示方式：
    第一种方式：十进制【是一种缺省默认的方式】常用
    第二种方式：八进制【在编写八进制整数型字面值的时候需要以0开始】
    第三种方式：十六进制【在编写十六进制整数型字面值的时候需要以0x开始】

 */
public class DataTypeTest04 {
    public static void main(String[] args) {
        int a=10;
        int b=010;
        int c=0x10;

        System.out.println(a);//10
        System.out.println(b);//8
        System.out.println(c);//16

        System.out.println(a+b+c);//34

        //456整数型字面值被当做int类型，占用4个字节
        //x变量在声明的时候是long类型，占用8个字节
        //int类型的字面值456赋值给long类型的变量x，存在类型转换
        //int类型转换成long类型
        //int类型是小容量
        //long类型是大容量
        //小容量可以自动转换成大容量，成为自动类型转换机制。
        long x=456;
        System.out.println(x);

        //2147483647字面值是int类型，占用4个字节
        //y是long类型，占用8个字节，自动类型转换
        long y=2147483647;
        System.out.println(y);

        //2147483648L是8个字节的long类型
        //z是long类型变量，以下程序不存在类型转换
        long z=2147483648L;//超出int类型取值范围
        System.out.println(z);
    }
}
