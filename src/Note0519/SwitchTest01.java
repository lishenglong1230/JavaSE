package Note0519;

import java.util.Scanner;

/*
    关于switch语句：
        1、switch语句也属于选择结构，也是分支语句
        2、switch语句的语法结构：
            一个比较完整的switch语句应该这样编写：
                switch(int或String类型的字面值或变量){
                    case int或String类型的字面值或变量：
                        java语句：
                        ....
                        break;
                    case int或String类型的字面值或变量：
                        java语句：
                        ....
                        break;
                    default：
                        java语句；
                        ....

                }
        3、switch语句的执行原理：
            switch后面下括号当中的数据和case后面的数据进行一一匹配，匹配成功的分支执行。
            按照自上而下的顺序依次匹配。
        4、匹配成功的分支执行，分支当中最后又"break;"语句的话，整个switch语句终止。
        5、匹配成功的分支执行，分支当中没有break语句的话，直接进入下一个分支执行（不进行匹配），
        这种现象被称为case穿透现象。【提供break语句可以避免穿透】
        6、所有分支都没有匹配成功，当有default的语句话，会执行default分支当中的程序。
        7、switch后面和case后面只能是int或者String类型的数据，不能是探测其它类型。
            * 当然byte，short,char也可以直接写到switch和case后面，因为它们可以进行自动类型转换。
            byte,short,char可以自动转换成int类型。
        8、case可以合并：
            int i=10;
            switch(i){
                case 1: case 2: case 3: case10:
                    System.out.println("Test Cod!")
            }

 */
public class SwitchTest01 {
    public static void main(String[] args) {
        /*
        long a=10L;
        int b=a;//编译报错

        long x=100L
        switch(x){}//编译报错
         */
        //解决编译错误
        long x=100L;
        switch ((int)x){}

        byte b=10;
        switch (b){}

        short s=10;
        switch(s){}

        char c='A';
        switch (c){}

        char cc=97;
        switch (cc){}

        //编译错误
        //switch(true){}

        String username="zhangsan";
        switch (username){}

        Scanner ss=new Scanner(System.in);
        int num=ss.nextInt();
        switch (num){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("错误");
        }

    }
}
