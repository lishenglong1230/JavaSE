package Note0517;
/*
    关于java语言当中的char类型：
        转义字符 \
 */
public class DataTypeTest03 {
    public static void main(String[] args) {
        //普通的n字符
        char c1='n';
        System.out.println(c1);//n

        //这是一个“换行符”，属于char类型的数据
        //反斜杠在java语言当中具有转义功能
        char c2='\n';
        System.out.println(c2);
        //println输出之后换行，print表示输出，但是不换行

        //要求在控制台上输出“反斜杠字符”
        char c3='\\';
        System.out.println(c3);//\

        //在控制台上输出一个单引号字符
        //char a=''';----->编译报错：第一个单引号与第二个单引号配对。
        char a='\'';
        System.out.println(a);//'

        char f='"';
        System.out.println(f);//没问题 "

        //转义字符出现在特殊字符之前，会将特殊字符转换成普通字符。
        System.out.println("\"HelloWorld\"");//输出"HelloWorld"-->"是半角

        char m='中';
        System.out.println(m);

        //JDK中自带的native2ascii.exe命令，可以将文字转换成unicode编码形式
        //怎么使用这个命令：
        //在命令行输入native2ascii，回车，然后输入文字之后回车即可得到unicode编码
        char n='\u4e2d';//’中‘对应的unicode编码是4e2d
        System.out.println(n);

        //char类型的默认值
        char c='\u0000';
        System.out.println(c);
    }
}
