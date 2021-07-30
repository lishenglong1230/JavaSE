package Note0603pm;
/*
    方法什么时候定义为静态的？
        方法描述的是动作，当所有的对象执行这个动作的时候，最终产生影响是一样的，
        那么这个动作已经不在属于某一个对象动作了，可以将这个动作提升为类级别的动作，
        模板级别的动作
    静态方法中无法直接访问实例变量和实例方法。
    大多数方法都定义为实例方法，一般一个行为或者一个动作在发生的时候，都需要对象的参与。
    但是也有例外，例如:大多数"工具类"中的方法都是静态方法，因为工具类就是方便变成，为了方便
    方法的调用，自然不需要new对象是最好的。
 */
public class StaticTest {
    int i=100;
    public void doSome(){

    }
    public static void main(String[] args) {
        StaticTest st=new StaticTest();
        System.out.println(st.i);
        st.doSome();
        System.out.println(MathUtil.sumInt(10,20));
        System.out.println(MathUtil.divide(40,20));
    }

}
