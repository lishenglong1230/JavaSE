package Note0518;
/*
    关于java中的“+”运算符：
        1、+运算符在java语言当中有两个作用：
            * 加法运算，求和
            * 字符串的连接运算
        2、当+运算符两边的数据都是数字的话，一定是进行加法运算。
        3、当“+”运算符两边的数据只要有一个数据是字符串，一定会进行字符串连接运算。
        并且，连接运算之后的结果还是一个字符串类型。
            数字+数字--->数字【求和】
            数字+“字符串”--->字符串【字符串连接】
        4、在一个表达式当中可以出现多个“加号”，在没有添加小括号的前提之下，遵循自左向右的顺序依次运算
 */
public class OperatorTest05 {
    public static void main(String[] args) {
        System.out.println(10+20+"30");//自左向右的顺序依次运算，第一次加号是求和，第二个加号是字符串连接。
        int a=10;
        int b=20;
        System.out.println("10+20=30");
        System.out.println(a+"+"+b+"="+(a+b));
        a=100;
        b=200;
        System.out.println(a+"+"+b+"="+(a+b));

        //引用类型String
        //String是SUN在JavaSE当中提供的字符串类型
        //String.class字节码文件
        int i=10;
        //编译错误，类型不兼容
        //String ss=10;
        String s="abc";
        String username="zhangsan";
        System.out.println("登陆成功，欢迎"+username+"回来");
        username="jack";
        System.out.println("登陆成功，欢迎"+username+"回来");

    }
}
