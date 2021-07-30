package Note0519;
/*
    for循环嵌套for循环
 */
public class ForTest06 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){//共循环10次
            //循环体中可以编写其他的控制语句
            //控制语句可以嵌套使用
            //内层循环，内层循环中的变量名和外层循环中的变量名不能重名。
            //for(int i=100;;)

            //这里是循环体，无论这个循环体中编写了什么样的代码，这堆代码也需要执行10遍。
            for(int j=0;j<3;j++){//循环了3遍
                System.out.println(j);
            }
        }
        //-------------------------------------
        System.out.println("----------------------------------------------------------");
        for(int i=0;i<10;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.println(k);
                }
            }
        }
    }
}
