package Note0523;
/*
    方法重载：
        1、方法重载又称为：overload
        2、什么时候考虑使用方法重载？
            * 功能相似的时候，尽可能让方法名相同
            但是：功能不同的时候，尽可能不同。

        3、什么条件满足之后构成了方法重载？
            * 在同一个类当中
            * 方法名相同
            * 参数列表不同：
                - 数量不同 int/int int
                - 顺序不同 int double/double int
                - 类型不同 int/double
        4、方法重载和什么有关系，和什么没有关系？
            * 方法重载和方法名+参数列表有关系
            * 方法重载和返回值类型无关
            * 方法重载和修饰符列表无关
 */

public class OverloadTest03 {
    public static void main(String[] args){

    }
    //编译错误：以下不是方法重载，是发生了方法重复了
    /*
    public static void m(int a,int b){}
    public static void m(int b,int a){}

     */
    /*public static void x(){}
    public static int x(){
        return 1;
    }
     */

    //void y(){}
    //public static void y(){}
}

