package Note0607;
//100以内素数之和
public class Test02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            for (int k = 2; k <= i; k++) {
                if (i % k == 0 && i != k) {
                    break;
                }
                if (i % k == 0 && i == k) {
                    sum += i;
                }
            }
        }
        System.out.println("sum=" + sum);
    }
}

