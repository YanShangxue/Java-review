public class OverloadTest02 {
    public static void main(String[] args) {
        //调用三个方法就像调用一个方法一样
        //参数类型不同时，对应的调用方法不同
        //此时区分方法不再依靠方法名，依靠的是参数的数据类型
        int result1 = sum(1, 2);
        System.out.println(result1);
        long result2 = sum(1L, 2L);
        System.out.println(result2);
        double result3 = sum(1.0, 2.0);
        System.out.println(result3);
    }
    //以下三个方法构成了方法重载机制
    public static int sum(int a, int b) {
        return a + b;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
