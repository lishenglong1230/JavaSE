package Note0520;
/*
    使用while循环输出1-10
 */
public class WhileTest02 {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("end:"+  i);//11

        int j=10;
        while(j>0){
            System.out.println(j--);
        }
        System.out.println("end"+j);//end 0

        int k=10;
        while (k>=0){
            System.out.println(--k);
        }
    }
}
