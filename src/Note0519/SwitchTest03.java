package Note0519;
//后面可以写char类型
public class SwitchTest03 {
    public static void main(String[] args) {
        char c='B';
        switch (c){
            case 'A':
                System.out.println("高级");
                break;
            case 66:
                System.out.println("中级");
                break;
            case 'C':
                System.out.println("初级");
                break;
            default:
                System.out.println("出错了！");
        }
        double d=90.0;
        //switch (d){}不支持浮点型
    }
}
