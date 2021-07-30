package Note0527;
/*
    现不使用递归，计算N的阶乘
 */

public class RecursionTest04 {
/*    public static void main(String[] args) {
        int n=5;
        int retValue=method(n);
        System.out.println(retValue);
    }
    public static int method(int n){
        int result=1;
        for(int i=n;i>0;i--){
            result*=i;
        }
        return result;
    }

 */
    //递归方式
    public static void main(String[] args) {
        int n=5;
        int retValue=method(n);
        System.out.println(retValue);
}
    public static int method(int n){
        if(n==1){
            return 1;
        }
        return n*method(n-1);
    }
}

