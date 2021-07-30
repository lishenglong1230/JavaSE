package Note0527;
/*
    使用递归计算1~N的求和
        -->4+3+2+1
 */
public class RecursionTest03 {
    public static void main(String[] args) {
        int n=4;
        int retValue=sum(n);
        System.out.println(retValue);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
