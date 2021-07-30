package Note0519;
/*
    在前一个程序的基础之上，计算1~100所有奇数的和
 */
public class ForTest05 {
    public static void main(String[] args) {
        int j=0;
        for(int i=1;i<=100;i+=2){
            j+=i;
        }
        System.out.println(j);
        //-------------------------------------------------------------
        int sum=0;
        for(int i=1;i<=100; i++){
            if (i % 2 != 0) {//是奇数
                sum+=i;//则累加求和
            }
        }
        System.out.println(sum);
    }
}
