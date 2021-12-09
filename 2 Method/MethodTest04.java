/*
    深入return语句
        *在同一个作用域中，return语句下不能编写任何代码，因为这些代码永远
        都执行不到，所有编译会报错。
        
*/
public class MethodTest04 {
    public static void main(String[] args) {

    }
    /*
    //以下程序编译会报错，因为无法保证“return 1;”会执行。
    public static int m() {
        int a = 10;
        if (a > 3) {
            return 1;
        }
    } 
    */
    public static int m() {
        int a = 10;
        if (a > 3) {
            return 1;
            //这里不能编写代码，因为不可能执行到。
        }
        //这里可以编写代码，因为可能执行到。
        System.out.println("MethodTest04.m()");
        return 0;
    }
    //下面是一种比较简单的写法
    public static int n() {
        return 10 > 3 ? 1 : 0;
    }
}
