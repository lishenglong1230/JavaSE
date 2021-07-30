package Note0517;
/*
    关于浮点型数据类型：
        float 单精度【4个字节】
        double 双精度【8个字节】
    double的精度太低【相对来说的】，不适合做财务软件。
    财务涉及到钱的问题，要求精度较高，所以SUN在基础SE类库当中为程序员准备了精度更高的类型
    只不过这种类型是一种引用数据类型，不属于基本数据类型，它是：java.math.BigDecimal

    其实java程序中SUN提供了一套庞大的类库，java程序员是基于这套基础的类库来进行开发的。
    所以要知道java的SE类库的字节码在哪儿，要知道java的SE类库的源码在哪？
        * SE类库字节码：F:\JDK\jre\lib\rt.jar
        * SE类库源码：F:\JDK\src.zip

    例如：String.java和String.class
    我们的（String[] args）中的String使用的就是String.class字节码文件

    在java语言当中，所有的浮点型字面值【3.0】，默认被当作double类型来处理，
    要想该字面值当做float类型类处理，需要在字面值后面添加F/f

    注意：
        double和float在计算机内部二进制存储的时候存储的都是近似值。
        在现实世界当中有一些数字是无线循环的，例如：3.33333333333.。
        计算机的资源是有限的，用有限的资源存储无限的数据只能存储近似值。

 */
public class DataTypeTest06 {
    public static void main(String[] args) {
        double d=3.0;
        System.out.println(d);//3.0

        //5.1是double类型的字面值
        //大容量转换成小容量，需要加强值类型转换符。
        //float f=5.1;
        float f=(float)5.1;//强制类型转换
        f=5.1f;//没有类型转换
    }
}
