package Note0518;
/*
    关于java编程中运算符之：算术运算符
        +   加
        -   减
        *   乘
        /   除
        %   取余
        ++  自加1
        --  自减1

    注意：一个表达式当中有多个运算符，运算符有优先级，不确定的加小括号，优先级得到提升。
        没有必要去专门记忆运算符的优先级。
 */
public class OperatorTest01 {
    public static void main(String[] args) {
        int i=1;
        int j=3;
        System.out.println();

        //以下以++为例
        int k=10;
        //++运算符可以出现在变量后面【单目运算符】
        k++;
        System.out.println(k);//11
        int y=10;
        ++y;
        //++运算符可以出现在变量前面
        System.out.println(y);
        //小结：无论是变量前还是变量后，只要++运算结束，该变量中的值一定会自加1

        //++出现在变量后
        //规则：先做赋值运算，再对变量中保存的值进行自加1，
        int a=100;
        int b=a++;
        System.out.println(a);//101
        System.out.println(b);//100

        //++出现在变量前
        //规则：先进行自加1运算，然后进行赋值操作。
        int m=20;
        int n=++m;
        System.out.println(m);//21
        System.out.println(n);//21

        int xx=500;
        System.out.println(xx);//500

        int e=100;
        System.out.println(e++);//100
        System.out.println(e);//101

        int s=100;
        System.out.println(++s);//101
        System.out.println(s);//101

        System.out.println(--s);//100
        System.out.println(s++);//100
        System.out.println(s--);//101
        System.out.println(s--);//100
        System.out.println(s--);//99
        System.out.println(s);//98
    }
}
