public class OOTest02 {
    public static void main(String[] args) {
        User u = new User();
        System.out.println(u.no);//0
        System.out.println(u.name);//null
        System.out.println(u.addr);//null
        u.no = 225;
        //String是一个类，所以name是一个引用，但String比较特殊，不需要new
        //“张三”其实也是一个String类的对象
        u.name = "张三";
        u.addr = new Address();
        
        u.addr.city = "北京";
        u.addr.street = "朝阳";
        System.out.println(u.name+"居住在哪个城市  "+u.addr.city);
        System.out.println(u.name + "居住在哪个街道  " + u.addr.street);
    }        
}
