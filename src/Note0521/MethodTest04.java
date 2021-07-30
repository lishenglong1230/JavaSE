package Note0521;
/*
    方法的调用不一定在main方法当中，可以在其他方法当中。
    只要是可以执行到的位置，都可以去调用其它方法。
 */
public class MethodTest04 {
    public static void sum(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
        //调用doSome方法
        doSome();
    }
    //主方法
    public static void main(String[] args) {
        //调用sum方法
        sum(1,2);
        System.out.println("Hello World!");
    }
    public static void doSome(){
        System.out.println("do some!");
    }
}
