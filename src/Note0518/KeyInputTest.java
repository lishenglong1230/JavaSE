package Note0518;

import java.util.Scanner;

/*
    System.out.println();负责向控制台输入【从内存到控制台】
    接受用户键盘输入，从“键盘”到“内存”。【输入的过程，到内存中去】
    其固定编写就可以接受用户键盘的输入。
 */
public class KeyInputTest {
    public static void main(String[] args) {
        //第一步：创建键盘扫描器对象
        Scanner s = new Scanner(System.in);
        //第二部：调用Scanner对象的next()方法开始接受用户键盘输入
        //程序执行到这里会停下来，等待用户的输入
        //当用户输入的时候，并且最终敲回车键的时候，键入的信息会自动赋值给userInputContent
        //程序执行到这里，用户输入的信息已经到内存中了。
        String userInputContent = s.next();//标识符的命名规范：见名知意
        //接受数字【以整数型int的形式来接收】
        int num = s.nextInt();
        //将内存中的数据输出到控制台
        System.out.println("您输入了：" + userInputContent);
        System.out.println("您输入的数字是：" + num);
        System.out.println("计算结果" + (num + 100));

    }
}
