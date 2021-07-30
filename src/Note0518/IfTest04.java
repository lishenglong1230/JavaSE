package Note0518;

public class IfTest04 {
    public static void main(String[] args) {
        boolean sex=true;
        if(sex){
            System.out.println("男");
        }else {
            System.out.println("女");
        }

        if(sex) System.out.println("男"); else System.out.println("女");
        //--------------------------------------------------------------------------------
        if(sex)
            System.out.println("男");//隐藏括号
        System.out.println("呵呵");
        //else缺少if语句
            System.out.println("女");
    }
}
