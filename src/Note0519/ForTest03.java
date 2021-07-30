package Note0519;

public class ForTest03 {
    public static void main(String[] args) {
        //输出1~10中所有的奇数
        for(int i=1;i<=10;i+=2){
            System.out.println(i);//1 3 5 7 9
        }
        //输出1~10中所有的偶数
        for(int i=2;i<=10;i+=2){
            System.out.println(i);
        }

        for(int i=10;i>0;i--){
            System.out.println(i);//10 9 8 7 6 5 4 3 2 1
        }
        for(int i=100;i>=50;i-=10){
            System.out.println(i);//100 90 80 70 60 50
        }
        for(int i=0;i<10;){
            System.out.println(i);
            i++;
        }
        for(int i=0;i<10;){
            i++;
            System.out.println(i);//1~10
        }
    }
}
