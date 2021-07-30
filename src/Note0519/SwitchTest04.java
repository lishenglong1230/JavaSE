package Note0519;

import java.util.Scanner;

/*
    实现计算器当中的:+ - * / %
    实现思路：
        1、选择所有数据从键盘输入
        2、使用switch语句进行判断
        3、需要从控制台输入三次：
            * 第一个数字
            * 运算符
            * 第二个数字
    最终在控制台上：
        欢迎使用简单计算器系统
        请输入第一个数字：
        请输入运算符：
        请输入第二个数字：
        运算结果：
 */
public class SwitchTest04 {
    public static void main(String[] args) {
        System.out.println("欢迎使用简单计算器系统");
        Scanner s=new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int a=s.nextInt();
        System.out.print("请输入运算符：");
        String b=s.next();
        System.out.print("请输入第二个数字：");
        int c=s.nextInt();
        switch (b){
            case "+":
                System.out.println(a+"+"+c+"="+(a+c));
                break;
            case "-":
                System.out.println(a+"-"+c+"="+(a-c));
                break;
            case "*":
                System.out.println(a+"*"+c+"="+(a*c));
                break;
            case "/":
                System.out.println(a+"/"+c+"="+(a/c));
                break;
            case "%":
                System.out.println(a+"%"+c+"="+(a%c));
                break;
            default:
                System.out.println("请输入正确的运算符！");
        }
//第二种方法
        int res=0;
        switch (b){
            case "+":
                res=a+c;
                break;
            case "-":
                res=a-c;
                break;
            case "*":
                res=a*c;
                break;
            case "/":
                res=a/c;
                break;
            case "%":
                res=a%c;
                break;
            default:
                System.out.println("请输入正确的运算符！");
        }
        System.out.println(a+b+c+"="+res);

    }
}
