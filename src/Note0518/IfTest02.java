package Note0518;
import java.util.Scanner;
/*
    需求：
        假设系统发给定一个人的年龄，根据年龄来判断这个人处于生命的那个阶段，年龄必须在[0-150]
 */
public class IfTest02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("请输入您的年龄：");
        int age=s.nextInt();
        //System.out.println("age="+age);
        String str="老年";
        if(age<0||age>150){
            str="您提供的年龄不合法，年龄值需要在[0-150]之间";
        }else if(age<=5){
            str="您处于生命周期的幼儿阶段";
        }else if(age<=10){
            str="您处于生命周期的少儿阶段";
        }else if(age<=18){
            str="您处于生命周期的青少年阶段";
        }else if(age<=35){
            str="您处于生命周期的青年阶段";
        }else if(age<=55){
            str="您处于生命周期的中年阶段";
        }
        System.out.println(str);
    }
}

