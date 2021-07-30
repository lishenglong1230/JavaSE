package Note0519;
/*
    使用for循环输出九九乘法表：
    1*1=1
    2*1=2 2*2=4
    3*1=3 3*2=6 3*3=9
    4*1=4 4*2=8 4*3=12 4*4=16
    ...............
    9*1=9 ...................9*9=81
 */
public class ForTest08 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){//外层循环9次
            //i是行号
            //循环体当中的程序主要的任务是什么？
            //处理当前行，将当前行中所有的项目全部输出
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+'\t');
            }
            //换行
            System.out.println();
            //System.out.print('\n');
        }
    }
}
