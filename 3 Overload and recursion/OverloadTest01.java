/*
    以下代码中，多个方法功能相似，都是用来求和，但名字却不相同。这增加了
    程序员的记忆量，不太方便。代码也不够美观。
  
    方法重载机制就是让多个功能相似的方法使用同一个方法名，让程序员编写代
    码更方便，代码也更美观。

    java支持这种机制，但有些语言不支持，如Javascript。
*/
public class OverloadTest01 {
    public static void main(String[] args) {
        int result1 = sumInt(1, 2);
        System.out.println(result1);
        long result2 = sumLong(1L, 2L);
        System.out.println(result2);
        double result3 = sumDouble(1.0, 2.0);
        System.out.println(result3);
    }

    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static long sumLong(long a, long b) {
        return a + b;
    }

    public static double sumDouble(double a, double b) {
        return a + b;
    }
}