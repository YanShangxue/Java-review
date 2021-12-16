public class Test {
    public static void main(String[] args) {
        //思路
        //先创建一个人
        Ren zhangsan = new Ren();
        
        //手动赋值
        zhangsan.id = "530101";
        zhangsan.name = "张三";
        zhangsan.sex = true;
        zhangsan.birthday = "2000.12.13";


        //再创造一个别墅对象
        BieShu ziJinCheng = new BieShu();
        //赋值面积
        ziJinCheng.mianJi = 9999.99;
        //让别墅有主人
        ziJinCheng.zhuRen = zhangsan;
        
        //输出别墅主人的名字
        System.out.println("别墅紫禁城的主人是" + ziJinCheng.zhuRen.name);
        
        //别墅换主人
        //先创建一个新的主人对象,并赋值
        Ren puyi = new Ren();
        puyi.id = "530102";
        puyi.name = "溥仪";
        puyi.sex = true;
        puyi.birthday = "1906.02.07";
        //再更换别墅的主人，并输出别墅新主人的名字
        ziJinCheng.zhuRen = puyi;
        System.out.println("别墅紫禁城的新主人是"+ziJinCheng.zhuRen.name);
    }
}
