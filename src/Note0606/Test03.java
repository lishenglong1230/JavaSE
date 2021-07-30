package Note0606;

public class Test03 {
    public static void main(String[] args) {
        //创建Test01对象
        //以下代码编译错误：当省略包名之后，会在当前包下找Test01
        //实际上编译器去找：com.bjpowernode.Test01了。这个类不存在。
        //Test01 tt=new Test01();
        //System.out.println(tt);

        //修改以上的错误
        //包名不要省略，添加包名
        //结论：什么时候前边的包名可以省略？Test03和Test01在同一个包下的时候不需要加包名。
        Note0606.Test01 tt=new Note0606.Test01();
        System.out.println(tt);

    }
}
