package Note0606;
import java.util.*;
public class Test05 {
    public static void main(String[] args) {
        //为什么要这样写？
        //Test03类和Scanner类不在同一个包下。
        //java.util就是Scanner类的包名。
        //java.util.Scanner s=new java.util.Scanner(System.in);

        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println("您输入的字符是--->"+str);

        java.lang.String name="zhansgan";
        System.out.println("名字是："+name);//名字是：zhansgan

        String username="lisi";
        System.out.println("用户名是："+username);//用户名是：lisi

    }
}
