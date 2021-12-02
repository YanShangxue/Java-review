//public 表示公开的
//class 表示一个类
//helloworld 表示一个类名
public class HelloWorld { //表示定义一个公开的类，起名helloworld
    /*
       以下部分称为类体
       //类体中不允许直接编写java语句，【除申明变量之外】
       public表示公开的
       static表示静态的
       void表示空
       main表示方法名是main
       （String[] args）是一个main方法的形式参数列表
       main方法，即主方法是程序的执行入口
    */
    public static void main(String[] args) { //表示定义一个公开的静态的主方法
        /*
          以下部分称为方法体
          java中所有“字符串”都要用半角的双引号括起来
          以下这样代码的作用是向控制台输出一段消息
        */
        System.out.println("hello world");
    }
        
    
} 
/*
  public class和class的区别；
    一个java源文件中可以定义多个class
    一个java源文件中public的class不是必要的
    一个class会定义生成一个xxx.class字节码文件  
    一个java源文件中若定义public的class的话，只能有一个，且必须与文件名一致
    每一个class中都可以编写main方法，都可以设定程序的入口。但想执行一个.class程序时，源程序中的这个class中必须有main方法。
*/