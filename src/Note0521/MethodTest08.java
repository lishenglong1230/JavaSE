package Note0521;
/*
    方法的返回值类型不是void的时候.
        1、要求方法必须保证百分百的执行return 值;这样的语句来完成值得返回。
        没有这个语句编译器会报错。
        2、一个方法有返回值的时候，当我们调用这个方法的，方法返回了一个值，
        对于调用者来说，这个返回值可以选择接收，也可以选择不接收。
 */
public class MethodTest08 {
    public static void main(String[] args) {
        //调用方法
        divide(10,3);//hello!没有接收这个方法的返回数据
        //这里接收一下方法执行结束之后的返回值
        //采用变量接收
        //变量的数据类型需要和返回值的数据类型相同，或者可以自动类型转换。
        int i=divide(10,3);
        System.out.println(i);
        System.out.println(divide(10,3));


    }
    /*
        需求：
            请定义并实现一个方法，该方法可以计算两个int类型数据的商，
            要求将最终的计算结果返回给调用者。
     */
    //编译错误：缺少返回语句
    //public static int divide(int a,int b){
    //}
    //编译错误：缺少返回值
    //public static int divide(int a,int b){
    //    return;
    //}
    public static int divide(int a,int b){
        //int c=a/b;
        //return c;
        System.out.println("hello!");
        return a/b;
    }


}
