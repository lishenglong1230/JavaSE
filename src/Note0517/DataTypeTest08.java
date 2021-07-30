package Note0517;
/*
    关于基本数据类型之间的互相转换：转换规则
        1、八种基本数据类型当中除布尔类型之外剩下的7种类型之间都可以转换
        2、小容量向大容量转换，成为自动类型转换，容量从小到大排序：
            byte<short<int<long<float<double
                 char <
            注：
                任何浮点类型不管占用多少个字节，都比整数型容量大。
                char和short可表示的种类数量相同，但是char可以取更大的正整数
        3、大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，
        但是在运行阶段可能会损失精度，所以谨慎使用。
        4、当整数字面值没有超出byte，short，char的取值范围，可以直接赋值给byte,short,char
        类型的变量。
        5、byte，short,char混合运算的时候，各自先转换成int类型再做运算。
        6、多种数据类型混合运算，先转换成容量最大的那种类型再做运算。
 */
public class DataTypeTest08 {
    public static void main(String[] args) {
        int f=10/3;//3
        double dd=10/3;//先int之间10/3=3，然后double 3.0
        System.out.println(dd);//3.0
        dd=10.0/3;//3.3333333333333335
        System.out.println(dd);

        long g=10;
        //byte h=(byte)(int)g/3;//先intg，再byteg，最后因为运算按int3，所以不行（大-->小）
        //表达式不行，有可能损失精度，在编译的时候不运算，只进行语法检查。

        short i=10;
        byte j=5;
        //short k=i+j;byte，short,char混合运算的时候，各自先转换成int类型再做运算。
    }
}
