package Note0601;
//账户类
public class Account {
    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //账号
    private String actno;//实例变量/对象变量，也就是说，必须先有对象才能有对应的实例变量。
    //余额
    private double balance;
    public Account(){
        //初始化实例变量的内存空间
        //actno=null;
        //balance = 0.0;
    }
    public Account(String s){
        actno=s;
        //balance=0.0;
    }
    public Account(double d){
        balance =d;
//        actno=null;
    }
    public Account(String s,double d){
        actno=s;
        balance=d;
    }


}
