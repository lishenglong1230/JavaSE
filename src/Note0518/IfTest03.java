package Note0518;
import java.util.Scanner;
/*
    需求：
        判断当前的天气：
            当外边下雨的时候：带雨伞：
                判断性别：当性别为男：带一把大黑伞
                        当性别为女：带一把小花伞
            当外边是晴天的时候：
                判断天气的温度：当天气温度在30度以上：当性别为男：戴墨镜
                                               当性别为女：擦防晒霜

 */
public class IfTest03 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("当前天气：");
        int wea=s.nextInt();
        if(wea==1){
            System.out.print("性别：");
            int sex=s.nextInt();
            if(sex==1){
                System.out.println("带一把大黑伞");
            }else if(sex==0){
                System.out.println("带一把小花伞");
            }else{
                System.out.println("请输入正确的性别");
            }
        }else if (wea==2){
            System.out.print("输入天气温度：");
            int tem=s.nextInt();
            if(tem>30){
                System.out.print("性别：");
                int sex=s.nextInt();
                if(sex==1){
                    System.out.println("戴墨镜");
                }else if(sex==0){
                    System.out.println("擦防晒霜");
                }else{
                    System.out.println("请输入正确的性别");
                }
            }else{
                System.out.println("只能判断30度以上的天气");
            }
        }else{
            System.out.println("请输入正确的天气");
        }
    }
}
