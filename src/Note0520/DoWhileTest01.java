package Note0520;
/*
    do..while循环
        1、do..while循环的语法结构：
            do{
                循环体
            }while（布尔表达式）；

        2、do..while循环的执行原理：
        3、do..while循环的执行次数：
            do..while循环的循环体代码片段执行次数是：1~N次【至少一次】
        4、使用do..while循环的注意事项：
            do..while循环语句最终有一个“分号”别丢了。
 */
public class DoWhileTest01 {
    public static void main(String[] args) {
        int i=10;
        do {
            System.out.println(i);//10
        }while(i>100);

        //不执行
        while(i>100){
            System.out.println("i");
        }
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while(a<=10);//1 2 3 4 5 6 7 8 9 10


    }
}
