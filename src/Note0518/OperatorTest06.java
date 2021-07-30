package Note0518;
/*
    三元运算符/三目运算符/条件运算符
        1、语法规则：
            布尔表达式？表达式1：表达式2
        2、三元运算符的执行原理？
            当布尔表达式的结果是true的时候，选择表达式1作为整个表达式的执行结果。
            当布尔表达式的结果是false的时候，选择表达式2作为整个表达式的执行结果。
 */
public class OperatorTest06 {
    public static void main(String[] args) {
        //编译错误，不是一个完整的java语句
        //10；
        //'男';
        //sex?'男':'女';是一个运算符
        boolean sex=false;
        char c=sex?'男':'女';
        System.out.println(c);//女
        sex=true;
        c=sex?'男':'女';
        System.out.println(c);//男

        //语法错误，编译报错，类型不兼容，与结果无关。
        //char c1=sex?"男":'女';

        System.out.println(10);
        System.out.println("10");
        System.out.println('1');
        System.out.println(sex?"男":'女');//可以

        String s=sex?"男的":"女的";
        System.out.println(s);
    }
}
