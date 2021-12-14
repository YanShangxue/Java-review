
public class OOTest04 {
    public static void main(String[] args) {
        //创建一个丈夫对象
        Hasband zhouYu = new Hasband();
        zhouYu.name = "zhouYu";
        //创建一个妻子对象
        Wife xiaoQiao = new Wife();
        xiaoQiao.name = "xiaoQiao";
        //让他们结婚【结婚后能通过丈夫找到妻子，也能通过妻子找到丈夫】
        zhouYu.w = xiaoQiao;
        xiaoQiao.h = zhouYu;
        //输出zhouYu的妻子的名字
        System.out.println(zhouYu.w.name);
    }    
}
