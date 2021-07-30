package Note0521;
/*
    在返回值类型是void的方法中使用return语句。
    return语句出现在返回值为void的方法当中主要是为了用来结束当前方法。
 */
public class MethodTest10 {
    public static void main(String[] args) {
        m();
        for(int i=10;i>0;i--){
            if(i==2){
                return;//结束的是main方法
            }
            System.out.println("data:"+i);
        }
        System.out.println("Execute Here!");//不输出

    }
    //编译错误：对于结果类型为空的方法，无法返回值
    /*
    public static void m(){
        return 10;
    }
     */
    /*public static void m(){
        return;
    }
     */
    public static void m(){
        for(int i=0;i<10;i++){
            if(i == 5){
                return;//不是终止for循环，终止的是m()方法
                //break;Hello World可以输出
            }
            System.out.println(i);
        }
        System.out.println("Hello World!");//不输出
    }

}
