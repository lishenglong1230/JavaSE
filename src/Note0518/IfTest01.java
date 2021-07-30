package Note0518;
/*
    关于java语言当中的if语句，属于选择结构，if语句又被成为分支语句/条件控制语句
        1、if语句的语法结构：四种编写方式
            第一种：
                if（布尔表达式）{
                    java语句；
                    java语句；
                    ....
                }
            第二种：
                if（布尔表达式）{
                    java语句；
                }else{
                    java语句；
                }
            第三种：
                if(布尔表达式){
                    java语句；
                }else if（布尔表达式）{
                    java语句
                }else if（布尔表达式）{
                    java语句
                }.....
            第四种：
                if(布尔表达式){
                    java语句；
                }else if（布尔表达式）{
                    java语句;
                }else{
                    java语句;
                }
        2、重点：对于java中的if语句来说，只要有一个分支执行，整个if语句全部结束。
        3、注意：以上的第二种编写方式和第四种编写方式都带有else分支，这两种方式可以100%保证会有分支执行
        4、"所有的控制语句"都是可以嵌套使用的。只要合理嵌套就行。
        注意：嵌套使用的时候，代码格式要保证完美。【该缩进的时候必须缩进】
        5、if语句的分支中只有一条java语句的话，大括号可以省略不写。
            if(true/false) 一条java语句；
            这种方式不推荐使用，能看懂。
 */
public class IfTest01 {
    public static void main(String[] args) {
        //需求：所在位置的五公里范围之内有肯德基的话，去KFC吃午饭
        //公里数
        double distance=6.0;
        if (distance<5.0){
            System.out.println("去KFC吃开封菜");
        }
        /*
            需求
                假设系统给定一个考生的成绩，成绩可能带有小数点
                根据学生的成绩判断该学生的成绩等级
         */
        //方法一：效率较低，每一个if都会判断一次
        //没有必要判断是否小于等于xxx，能执行到这里一定小于等于xxx
        double score=59.5;
        if(score<0||score>100){
            System.out.println("对不起，您提供的考生成绩不合法");
        }else if (score>=90){
            System.out.println("该考生的考试成绩等级是：A等级");
        }else if(score>=80){//能够判断到这里说明成绩一定是小于90分的
            System.out.println("该考生的考试成绩等级是：B等级");
        }else if(score>=70){
            System.out.println("该考生的考试成绩等级是：C等级");
        }else if(score>=60){
            System.out.println("该考生的考试成绩等级是：D等级");
        }else{
            System.out.println("该考生的考试成绩等级是：E等级");
        }

        String grade="该考生的考试成绩等级是：E等级";
        if(score<0||score>100){
            grade="对不起，您提供的考生成绩不合法";
        }else if (score>=90){
            grade="该考生的考试成绩等级是：A等级";
        }else if(score>=80){
            grade="该考生的考试成绩等级是：B等级";
        }else if(score>=70){
            grade="该考生的考试成绩等级是：C等级";
        }else if(score>=60){
            grade="该考生的考试成绩等级是：D等级";
        }
        System.out.println(grade);
    }
}
