package Note0519;
/*
    i变量的作用域
 */
public class ForTest02 {
    public static void main(String[] args) {
        //以下的for循环当中i变量的作用域是仅限于当前for循环内部使用。
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        //这个i变量可以在main方法的作用域当中访问吗？无法访问
        //System.out.println(i);编译错误
        int i=0;
        for(;i<10;i++){
            System.out.println(i);
        }
        //这里可以访问main方法作用域当中的i变量
        System.out.println(i);//10
        int j;
        for(j=1;j<10;j++){
            System.out.println(j);
        }
        System.out.println(j);//10
    }
}
