package Note0523;
//分析以下程序的输出结果【画图分析】
//画图应该这样画？
//程序执行一步，在图上体现一步即可。

public class MethodTest02 {
    public static void main(String[] args) {
        int i=10;
        method(i);
        System.out.println("main-->"+i);//10
    }
    public static void method(int i){
        i++;//局部变量i只在method i---->1
        System.out.println("method-->"+i);//11
    }
}
