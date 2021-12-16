/*
    需求：
        定义一个计算机类【电脑/笔记本】
        计算机类的属性包括：品牌，型号，颜色
        
        定义一个学生类，学生类的属性包括：学号，姓名，学生的笔记本电脑

        请编写程序表示以上的类，然后分别将类创为对象
        对象数量不限，然后让其中的每一个学生去使用一台笔记本电脑
        然后编译并运行，并将整个执行过程采用图像方式描述出来

    所有代码全部写入当前java文件中
*/
class Cumputer {
    String brand;
    String style;
    String color;
}

class Student {
    int id;
    String name;
    Cumputer notepad;
}

public class OOTest05 {
    public static void main(String[] args) {
        //创建几个电脑对象
        Cumputer pad01 = new Cumputer();
        pad01.brand = "联想";
        pad01.color = "灰色";
        pad01.style = "小新14pro";
        Cumputer pad02 = new Cumputer();
        pad02.brand = "惠普";
        pad02.color = "黑色";
        pad02.style = "b01";
        Cumputer pad03 = new Cumputer();
        pad03.brand = "机械革命";
        pad03.color = "灰色";
        pad03.style = "code01";
    
        Cumputer pad04 = new Cumputer();
        pad04.brand = "华硕";
        pad04.color = "白色";
        pad04.style = "c01";
        //创建学生对象并赋值
        Student xiaoming = new Student();
        xiaoming.id = 5301001;
        xiaoming.name="小明";
        xiaoming.notepad = pad01;
        Student xiaohong = new Student();
        xiaohong.id = 5301002;
        xiaohong.name="小红";
        xiaohong.notepad = pad02;
        Student xiaoqiang = new Student();
        xiaoqiang.id = 5301003;
        xiaoqiang.name="小强";
        xiaoqiang.notepad = pad03;
        
        //输出每个学生的电脑的一些信息
        System.out.println("小强的电脑品牌是:" + xiaoqiang.notepad.brand);
        System.out.println("小红的电脑颜色是:" + xiaohong.notepad.color);
        System.out.println("小明的电脑型号是:" + xiaoming.notepad.style);

        //修改小明的电脑品牌为苹果,并输出
        xiaoming.notepad.brand = "苹果";
        System.out.println("小明的电脑品牌是:" + xiaoming.notepad.brand);
        
        //小红又买了一个新电脑，原来的电脑扔了【垃圾回收了】
        xiaohong.notepad = pad04;
        System.out.println("小红的电脑颜色是:" + xiaohong.notepad.color);
    }
}
