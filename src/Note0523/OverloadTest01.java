package Note0523;
/*
    不用使overload分析缺点：
        1、三个方法虽然功能不同，但是功能相似，都是求和。
        在以下程序中起了三个不同的名字，对于程序员来说调用的时候不方便。
        2、代码不美观。
    有没有这样的一种机制：
        功能虽然不同，但是功能相似的时候，有没有这样的一种机制，可以让程序员使用
        这些方法的时候就像在使用同一个方法一样。
        ------>方法重载机制/Overload

 */
public class OverloadTest01 {
    public static void main(String[] args) {
        int result1=sumInt(1,2);
        System.out.println(result1);
        double result2=sumDouble(1.0,2.0);
        System.out.println(result2);
        long result3=sunLong(1L,2L);
        System.out.println(result3);
    }
    public static int sumInt(int a,int b){
        return a+b;
    }
    public static double sumDouble(double a,double b){
        return a+b;
    }
    public static long sunLong(long a,long b){
        return a+b;
    }
    //最终希望达到的效果是：程序员在使用上面的三个相似的方法的时候，就像在用一个方法一样。
    //Java支持这种机制
}
