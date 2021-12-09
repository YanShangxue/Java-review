/*
    方法相当于C语言的函数，用来实现某一特定功能，并且可以重复使用。
    方法定义在类体当中，并且同一类体中方法没有先后顺序
    方法体中不可再定义方法
    
*/
public class MethodTest01 
{
    public static void main(String[] args) {
        MethodTest01.sumInt(10, 20);
        MethodTest01.sumInt(489, 510);
        MethodTest01.sumInt(223, 277);
    }

    public static void sumInt(int a,int b)
    {
        int c = a + b;
        System.out.println(a + "+" + b + "=" + c);
    }
}
