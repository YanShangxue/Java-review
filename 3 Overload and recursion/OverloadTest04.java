/*
    方法重载的具体应用
*/

public class OverloadTest04 {
    public static void main(String[] args) {
        /*
            system.out.println("Hello world");
            system.out.println(10);
            system.out.println(ture);
        */
        U.p(29);
        U.p("I am xxxx");
        U.p(true);
        U.p(false);
        U.p(4.236);
    }    
}

class U
{
    public static void p(byte b) {
        System.out.println(b);
    }

    public static void p(Short b) {
        System.out.println(b);
    }

    public static void p(int b) {
        System.out.println(b);
    }

    public static void p(long b) {
        System.out.println(b);
    }

    public static void p(Double b) {
        System.out.println(b);
    }

    public static void p(Float b) {
        System.out.println(b);
    }

    public static void p(char b) {
        System.out.println(b);
    }

    public static void p(Boolean b) {
        System.out.println(b);
    }
    public static void p(String b) {
        System.out.println(b);
    }
}