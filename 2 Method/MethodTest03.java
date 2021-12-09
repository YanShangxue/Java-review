/*
    当方法的返回值类型不是void的时候。
        1、返回值不是void时，必须执行“return 值；”语句来完成值的返回，否则编译器报错。
        2、有返回值的方法在被调用时，会返回一个值，对于调用者来说，这个返回值可以选择
           接受，也可以选择不接收。当然，大多数情况下都会选择接受。
*/

public class MethodTest03 {
    public static void main(String[] args) {
        int a;
        divide(10, 3);  //没有接受返回值
        a = divide(20, 3); //用一个变量a来接受divide方法的返回值
        System.out.println(a);
    }

    public static int divide(int a,int b)
    {
        int c = a / b;  //或者写return a/b;
        return c;
    }
}
