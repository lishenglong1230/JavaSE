package Note0603;

public class Test {
    public static void method1(){
        Test.doSome();
        doSome();

        Test t=new Test();
        t.method2();

        System.out.println(t.i);
    }
    public void method2(){
        Test.doSome();
        doSome();

        this.doOther();
        doOther();

        System.out.println(i);
        System.out.println(this.i);

    }
    public static void main(String[] args) {
        Test.method1();
        method1();

        Test t=new Test();
        t.method2();
    }
    int i=10;
    public static void doSome(){
        System.out.println("do some!");
    }
    public void doOther(){
        System.out.println("do other!");
    }
}
