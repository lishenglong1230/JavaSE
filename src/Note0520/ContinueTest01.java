package Note0520;
/*
    continue语句：
        1、continue表示：继续/go on/下一个
        2、continue;单独的完整的java语句控制循环的执行
        3、break和continue的区别？
            * break表示循环不执行了，跳出循环，终止循环。
            * continue表示终止当前“本次”循环，直接进入下一次循环继续执行。
        4、continue也有这样的语法：
            continue 循环名称;

 */
public class ContinueTest01 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i==5){
                continue;//只要这个语句执行，当前本次循环停止，直接进入下一次训话“继续”执行
            }
            System.out.println(i);//没有5
        }
        System.out.println("Hello World!");
    }
}
