public class OOTest03 {
    public static void main(String[] args) {
        User u = new User();
        //上一个版本中写的
        //u.addr=new Address();
        //通过以下语句后a变量中的值是对象Address的内存地址
        Address a = new Address();
        //以下语句使u.addr的值也是对象Address的内存地址
        u.addr = a;
        System.out.println(u.addr.city);
        //以下语句改变了对象Address中的city的值
        a.city = "深圳";
        //因为u.addr.city也是指对象Address中city的值，所以以下输出跟着改变
        System.out.println(u.addr.city);


    }
}
