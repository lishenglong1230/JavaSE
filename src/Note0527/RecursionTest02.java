package Note0527;
/*
    不使用递归，计算1~N的和【可以不用递归，尽量不用递归】
 */
public class RecursionTest02 {
    public static void main(String[] args) {
        //1~4的和
        /*int n=4;
        int sum=0;
        for(int i=1;i<=4;i++){
            sum+=i;
        }
        System.out.println(sum);//10

         */
        //直接调用方法即可
        int n=4;
        int retValue=sum(4);
        System.out.println(retValue);

        n=10;
        retValue=sum(n);
        System.out.println(retValue);
    }
    public static int sum(int n){
        int result=0;
        for(int i =1; i<=n; i++){
            result+=i;
        }
        return result;
    }
}
