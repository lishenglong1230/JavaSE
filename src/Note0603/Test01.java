package Note0603;
/*
    java语言当中方法调用的时候涉及到参数传递的问题，
    参数传递实际上传递的是变量中保存的具体值。
    int i=10;
    add(i) 相当于add（10）
 */
public class Test01 {
    public static void main(String[] args) {
        int i=10;
        add(i);
        System.out.println("main -->"+i);//10
    }
    public static void add(int i){
        i++;
        System.out.println("add -->"+i);//11
    }
}
