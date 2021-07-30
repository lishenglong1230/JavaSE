package Note0515;
/*
    关于变量的分类：
        根据变量声明的位置来分类：
            * 局部变量
                - 在方法体当中声明的变量叫做局部变量
            * 成员变量
                - 在方法体外声明的变量叫做成员变量
 */
public class VarTest04 {
    //成员变量
    int k = 200;
    //主方法：入口
    public static void main(String[] args) {
        //i变量就是局部变量
        int i=10;
        //java遵循"就近原则"
        System.out.println(i);//10
    }
    //成员变量；
    int i = 100;//声明变量
    //类体中不能直接编写java语句，【除声明变量之外】
    //System.out.println(i);

    //doSome方法
    public static void doSome(){
        //局部变量
        int i=90;
    }
}
