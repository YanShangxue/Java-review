/*
    对象的创建和使用
*/
public class OOTest01 {
    public static void main(String[] args) {
        //int是基本数据类型
        //i是一个变量名
        //10是一个int类型的字面值
        int i=10;

        //通过一个类，可以实例化N个对象
        //实例化对象的语法：new 类名（）；
        //new是Java语言的一个运算符
        //new运算的作用是创建对象，在JVM堆内存中开辟新的内存空间
        //方法区内存：在类加载的时候，class字节码代码片段被加载到该空间当中
        //栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
        //堆内存：new的对象在堆内存中存储
        //Student是一个引用数据类型
        //s是一个变量名
        //new Student()是一个学生对象
        //s是一个局部变量【在栈内存中存储】
        //什么是对象？new运算符在堆内存中开辟的内存空间称为对象。
        //什么是引用？引用是一个变量，只不过这个变量中保存了另一个java对象的内存地址
        //java语言中程序员不能直接操作堆内存，java中没有指针。不像c语言。
        //Java语言中程序员只能通过‘引用’去访问堆内存中的对象内部的实例变量
        Student s = new Student();
        //访问实例变量的语法格式
        //读取数据：引用.变量名
        //修改数据：引用.变量名=值
        
        /*以下代码段输出的是对象中实例变量的默认值：0，null,0,false,null
        int stuNo = s.no;
        String stuName = s.name;
        int stuAge = s.age;
        boolean stuSex = s.sex;
        String stuAddr = s.addr;
        System.out.println("学号=" + stuNo);
        System.out.println("姓名=" + stuName);
        System.out.println("年龄=" + stuAge);
        System.out.println("性别=" + stuSex);
        System.out.println("地址=" + stuAddr);
        */
        s.no = 2019141;
        s.name = "yanshangxue";
        s.age = 21;
        s.sex = true;
        s.addr = "云南";
        System.out.println("学号=" + s.no);
        System.out.println("姓名=" + s.name);
        System.out.println("年龄=" + s.age);
        System.out.println("性别=" + s.sex);
        System.out.println("地址=" + s.addr);

        //再通过类实例化一个全新的对象
        //stu是一个引用
        //stu同时也是一个局部变量
        //Student是变量的数据类型
        Student stu = new Student();

        System.out.println("学号=" + stu.no);   //0
        System.out.println("姓名=" + stu.name); //null
        System.out.println("年龄=" + stu.age);  //false
        System.out.println("性别=" + stu.sex);  //0
        System.out.println("地址=" + stu.addr); //null
        
        /*
            以下代码编译报错，no这个实例变量不能直接采用“类名”的方式访问
            因为no是实例变量，对象级别的变量，变量存储在java对象的内部，必须先有
            对象，通过对象才能访问no这个实例变量，不能直接通过“类名”访问
            System.ou.println(Student.no);
        */
    }
}
/*
    局部变量在栈内存中存储
    成员变量中的实例变量在堆内存的Java对象内部存储
    实例变量是一个对象一份，100个对象有100份

*/
