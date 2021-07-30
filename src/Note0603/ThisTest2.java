package Note0603;
/*
    最终结论：
        在带有static的方法当中不能“直接”访问实例变量和实例方法
        因为实例变量和实例方法都需要对象的存在。
        而static的方法当中是没有this的。也就是说当前对象是不存在的，
 */
public class ThisTest2 {
    public static void main(String[] args) {
        ThisTest2.doSome();
        doSome();
        //ThisTest2.doOther();编译错误
        //以下代码表示的含义：调用当前对象的doOther方法
        //但是由于main方法中没有this，所以以下方法不能调用。
        //doOther（）;//编译错误
        //this.doOther();//编译错误

        ThisTest2 tt=new ThisTest2();
        tt.doOther();
        tt.run();
    }
    public static void doSome(){
        System.out.println("do some!");
    }
    public void doOther(){
        //this表示当前对象
        System.out.println("do other!");
    }

    //run是实例方法，调用run方法的一定是有对象存在的。
    //一定是先创建了一个对象才能调用run方法
    public void run(){
        //在大括号中的代码执行过程当中一定是存在“当前对象”的。
        //也就是说这里一定是有“this”的
        System.out.println("run execute!");
        //doOther是一个实例方法，实例方法调用必须有对象的存在
        //以下代码表示的含义就是：调用当前对象的doOther方法
        doOther();
        //this.doOther();//比较完整的写法
    }
}
