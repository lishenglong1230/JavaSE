package Note0518;

/*
    关于java中的赋值类运算符：
        赋值类运算符包括两种：
            * 基本的赋值运算符：=
            * 扩展的赋值运算符：+= -= *= /= %=
        1、赋值类的运算符优先级：先执行等号右边的表达式，将执行结果赋值给左边的变量。
        2、注意以下代码：
            int k=10;
            k+=5;等同于：k=（int）（k+5）；

            long x=10L；
            int y=20;
            y += x;等同于：y＝（int）(y+x);
        3、扩展类的赋值运算符不改变运算结果类型，假设最初这个变量的类型是byte类型，
        无论怎么进行追加或追减，最终该变量的数据类型还是byte类型。
 */
public class OperatorTest04 {
    public static void main(String[] args) {
        //基本的赋值运算符
        int i=10;
        System.out.println(i);//10
        i=i+5;
        System.out.println(i);//15

        //扩展的赋值运算符
        i+=5;//等同于：i=i+5
        System.out.println(i);//20

        i-=5;
        System.out.println(i);//15

        i*=2;
        System.out.println(i);//30

        i/=4;
        System.out.println(i);//7

        i%=2;
        System.out.println(i);// 1
        //------------------------------------------
        byte b=10;
        //b=15;可以
        //b=b+5;编译错误，编译器只检查语法。大-->小
        b=(byte)(b+5);
        System.out.println(b);//15

        byte x=10;
        x+=5;//等同于：x=（byte）(x+5)
        System.out.println(x);//15

        byte z=0;
        z+=128;//等同于：z=（byte）（z+128）；
        System.out.println();//-128【损失精度】
    }
}
