package Note0601;

public class Customer {
    //无参数构造器
    public Customer() {
    }
    //有参数的构造器
    public Customer(int a, String b, String c) {
        no = a;
        name = b;
        birth = c;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    private int no;
    private String name;
    private String birth;
}
