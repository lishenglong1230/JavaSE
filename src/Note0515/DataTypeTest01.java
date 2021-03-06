package Note0515;
/*
    关于java中的数据类型
        1、数据类型定的作用是什么？
            程序当中有很多数据，每一个数据都是有相关类型的，不同数据类型的数据占用空间大小不同。
            数据类型的作用是知道JVM在运行程序的时候给该数据分配多大的内存空间。
        2、java中的数据类型包括两种：
            * 基本数据类型
            * 引用数据类型
                - 类
                - 接口
                - 数组
        3、关于基本数据类型：
            * 基本数据类型包括四大类八大种：
                第一类：整数型
                    byte,short,int,long
                第二类：浮点型
                    float，double
                第三类：布尔型
                    boolean
                第四类：字符型
                    char
integer整数型
        4、字符串“abc”不属于基本数据类型，属于“引用数据类型”，字符属于基本数据类型
            * 字符串使用双引号“abc”
            * 字符使用单引号 ‘a’
        5、八种基本数据类型各自占用空间大小是多少？
            基本数据类型          占用空间大小【单位:字节】
            ------------------------------------------
            byte                1
            short               2
            int                 4
            long                8
            float               4
            double              8
            boolean             1
            char                2
        6、计算机在任何情况下都只能识别二进制。
        【现代的计算机底层采用交流电的方式，接通和断开就两种状态，计算机只是别1或0，其他不认识】
        7、什么是二进制？
            * 数据的一种表示形式。十进制表示满十进一原则。二进制表示满二进一原则。
        8、字节（byte）
            1 byte = 8 bit 【1个字节=8个比特位】1个比特位表示一个二进制位：1/0
            1 KB = 1024 Byte
            1 MB = 1024 KB
            1 GB = 1024 MB
            1 TB = 1024 GB

            1 TB = 1024*1024*1024*1024*8
        9、byte类型的取值范围是什么？
            * 关于java的数字类型，数字都是有正负之分的，所以在数字的二进制当中有一个二进制位
            被称为“符号位”。并且这个“符号位”在所有二进制位的最左边，0表示正数，1表示负数。
            * byte类型最大值：01111111（10000000-1=01111111）
            * byte类型取值范围：【-128 ~ 127】
            * byte类型可以表示256个不同的数字【256个不同的二进制】中间还有0

        10、二进制和十进制之间的转换规则：
        11、计算机只认识二进制，那么计算机是怎么表示现实世界当中的文字的呢？
            * 八种基本数据类型当中，byte,short,int,long,float,double,boolean这7种
            数据类型计算机在表示的时候比较容易，因为底层都是数字，十进制的数字和二进制之间存在
            一种固定的转换规则。
            * 但是八种基本数据类型当中char类型表示的是现实世界中的文字，文字和计算机二进制
            之间默认情况下是不存在任何转换关系的。
            * 为了让计算机可以表示现实世界当中的文字，我们需要进行人为的干涉，需要人
            负责提前制定好"文字"和"二进制"之间的对照关系。这种对照转换关系被称为：字符编码。
            * 计算机最初只支持英文，最先出现的字符编码是：ASCII码【采用一个字节编码】
                'a'--（按照ASCII解码）-->01100001
                01100001---按照ASCII编码-->'a'

                编码和解码的时候采用同一套字典/对照表，不会出现乱码。
                当解码和编码的时候采用的不是同一套对照表，会出现乱码问题。

            * 随着计算机的发展，后来出现了一种编码方式，是国际化标准组织ISO制定的。
            这种编码方式支持西欧语言，向上兼容ASCII码，仍然不支持中文。这种编码方式是
            ISO-8859-1，又被称为latin-1
            * 随着计算机向亚洲发展，计算机开始支持中文、日文、韩文、等国家文字，其中支持
            简体中文的编码方式：
                GB2312<GBK<GB18030(容量大小)
            * 支持繁体中文：大五码<big5>
            * 后来出现了一种编码方式统一了全球所有的文字，容量较大，这种编码方式叫做：unicode编码
            unicode编码方式有多种具体的实现：
                - UTF-8
                - UTF-16
                - UTF-32
            * java语言采用的是哪一种编码方式呢？
                - java语言源代码采用的是unicode编码方式，所以"标识符"可以用中文。
            现在在实际开发中，一般使用UTF-8编码方式较多。【统一编码方式】
        12、八种基本数据类型的取值范围：
            byte            [-128~127]
            short           [-32768-32767]
            boolean         [true,false]   默认：false [true是1,false是0]
            char            [0~65535]      默认：\u0000
            注意“short和char所表示的种类总数是一样的，
            八种基本数据类型的默认值是一切向0看齐。


*/
//-------------------------------------------------------------
//关于八种基本数据类型的默认值
public class DataTypeTest01 {
    //这里的static必须加
    static int k =1000;
    //变量还是遵守语法
    //成员变量没有手动赋值系统会默认赋值【局部变量不会】
    static int f;//成员变量

    public static void main(String[] args) {
        /*
        int i;//局部变量
        System.out.println(i);//没初始化变量
         */
        System.out.println(k);//1000
        System.out.println(f);//0
    }
}
