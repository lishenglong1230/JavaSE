package Note0519;
//考生成绩
public class SwitchTest05 {
    public static void main(String[] args) {
        double score=95.5;
        int grade=(int)(score/10);
        switch (grade){
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");
        }
    }
}
