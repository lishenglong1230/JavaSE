package Note0519;

import java.util.Scanner;

public class SwitchTest02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String dayOfWeek=s.next();
        switch (dayOfWeek){
            case"星期一":
                System.out.println(1);
                break;
            case"星期二":
                System.out.println(2);
                break;
            case"星期三":
                System.out.println(3);
                break;
            case"星期四":
                System.out.println(4);
                break;
            case"星期五":
                System.out.println(5);
                break;
            case"星期六":
                System.out.println(6);
                break;
            case"星期日":
                System.out.println(7);
                break;
            default:
                System.out.println("错误");
        }
    }
}
