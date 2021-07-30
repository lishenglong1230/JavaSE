package Note0606;

public class Test02 {
    public static void main(String[] args) {
        //完整类名是：
        Note0606.Test01 t=new Note0606.Test01();
        System.out.println(t);//Note0606.Test01@1b6d3586
        //可以省略包名，因为Test01和Test02在同一个软件包当中。
        Test01 tt=new Test01();
        System.out.println(tt);//Note0606.Test01@4554617c
    }
}
