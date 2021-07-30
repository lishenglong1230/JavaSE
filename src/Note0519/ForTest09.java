package Note0519;
/*
    编写for循环找出1~100中所有的素数
    素数：又被称为质数，能够被1和自身整除，不能被其它数字整除的数字成为素数。
    该题目主要掌握的知识点：
        * for循环的使用
        * for循环嵌套
        * 标记
        * break
        * 统计
 */
public class ForTest09 {
    public static void main(String[] args) {
        //先编写程序，验证7这个数字是否为素数
        /*
            实现思路：
                7/1【不需要】
                7/2【7%2！=0】
                7/3【7%3！=0】
                7/4【7%4！=0】
                7/5【7%5！=0】
                7/6【7%6！=0】
                7/7【不需要】
            结论是：7是素数
         */
        /*int i=8;
        //byte b=0;//默认将i看做一个素数[0是素数，1是非素数]
        boolean isSuShu=true;//默认将i看做一个素数【标记在开发中比较常用】
        for(int j=2;j<i;j++){
            if(i%j==0){
                //b=1;
                isSuShu=false;
                //已经知道i是非素数，跳出循环，效率较高
                break;
            }
        }
        //System.out.println(b==0?i+"是素数":i+"不是素数");
        System.out.println(isSuShu?i+"是素数":i+"不是素数");
    }
         */
        //1不是素数
        //外部的for循环只负责取出每一个数字i
        /*for(int i=2;i<=100;i++) {
            boolean isSuShu = true;
            for (int j = 2; j < i; j++) {//i可以/2
                if (i % j == 0) {
                    //b=1;
                    isSuShu = false;
                    //已经知道i是非素数，跳出循环，效率较高
                    break;
                }
            }
            if(isSuShu) {
                System.out.println(i);
            }
        }

         */
        //升级版：  加入统计机制
        //        编写for循环找出1~10000中所有的素数
        //        要求每8个换一行输出
        int count=0;
        for(int i=2;i<=100;i++) {
            boolean isSuShu = true;
            for (int j = 2; j < i; j++) {//i可以/2
                if (i % j == 0) {
                    //b=1;
                    isSuShu = false;
                    //已经知道i是非素数，跳出循环，效率较高
                    break;
                }
            }
            if(isSuShu) {
                System.out.print(i+" ");
                count++;
                //if(count==8){}
                if(count%8==0){
                    System.out.println();
                    //count=0;归0
                }
            }
        }
    }
}


/*
    升级版：
        编写for循环找出1~10000中所有的素数
        要求每8个换一行输出
 */