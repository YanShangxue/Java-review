/*
    1、方法重载又被称为:overload

    2、什么时候考虑使用方法重载？
     * 功能相似的时候，尽可能让方法名相同
    
    3、什么条件满足之后构成了方法重载？
     * 在同一个类当中
     * 方法名相同
     * 参数列表不同（参数的类型或数量不同或参数顺序不同）
     * 

    4、方法重载和有什么关系，和什么没有关系？
     * 方法重载和方法名+参数列表有关
     * 方法重载和返回值类型无关
     * 方法重载和修饰符列表无关
*/
public class OverloadTest03 {
    public static void main(String[] args) {

    }
    //以下两个方法构成方法重载
    public static void m1(int x,int y){}
    public static void m1(int x) {}
    //以下两个方法构成方法重载
    public static void m2(int a,double b){}
    public static void m2(double a,int b){}
    //以下两个方法构成方法重载
    public static void m3(int x){}
    public static void m3(double x){}
}
