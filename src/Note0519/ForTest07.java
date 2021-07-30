package Note0519;
/*
    for循环嵌套
 */
public class ForTest07 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){//循环10次
            //这里的代码执行10遍
            for(int j=0;j<1;j++){
                System.out.println(j);
            }
        }
        for(int i=1;i<=5;i++){
            System.out.println("开始");
            for(int j=1;j<=5;j++){
                //System.out.println(j);
                System.out.println(i*j);
            }
            System.out.println("结束");
        }
    }
}
