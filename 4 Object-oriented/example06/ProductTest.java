//每一个类中都可以编写主方法，但是一般情况下，一个系统只有一个
//入口，所以主方法一般写一个

//商品测试类
public class ProductTest 
{
    //程序入口
    public static void main(String[] args) {
        //创建对象，商品对象
        //iphone13是局部变量
        //iphone13是引用
        //iphone13变量中保存的内存地址指向堆内存中的商品对象
        Product iphone13 = new Product();
        
        //访问实例变量的语法：引用.变量名
        System.out.println("商品的编号：" + iphone13.productNo);
        System.out.println("商品的单价：" + iphone13.price);
        
        //修改实例变量的语法：引用.变量名=值；
        iphone13.productNo = 202108;
        iphone13.price = 6799.00;

        System.out.println("商品的编号：" + iphone13.productNo);
        System.out.println("商品的单价：" + iphone13.price);
    }    
}
