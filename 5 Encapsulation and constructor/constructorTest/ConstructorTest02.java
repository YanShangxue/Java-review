package constructorTest;

/**
 * 构造方法的作用： 
		1、创建对象
		2、创建对象的同时，初始化实例变量的内存空间。
		

	成员变量之实例变量，属于对象级别的变量，这种变量必须先有对象才能有实例变量。
	实例变量没有手动赋值的时候，系统默认赋值，那么这个系统默认赋值是在什么时候完成的呢？
		实际上，实例变量的内存空间是在构造方法执行过程中完成开辟的，完成初始化的。
		系统默认赋值的时候，也是在构造方法执行的过程中完成的赋值。
	
	实例变量默认值：
		byte,short,int,long 0
		folat,double 0.0
		bolean false
		引用数据类型 null
		
 * @author 清酒
 *
 */
public class ConstructorTest02 {

	public static void main(String[] args) {
		//在eclipse中怎么查看访问的是哪个属性，访问的是哪个方法？
		//按ctrl建，鼠标移动到要查看的元素上，出现下划线时可以单击鼠标左键查看
		//另外，当一个类中元素过多时，想要快速查看，在当前类中按ctrl+o 快捷键，
		//然后输入要查找的元素的名称即可查找
		
		//创建对象
		Account act1=new Account();
		//输出默认值
		System.out.println("账号："+act1.getActNo());
		System.out.println("余额："+act1.getBalance());
		//给act1对象的属性赋值
		act1.setActNo("20191060100");
		act1.setBalance(500);
		//输出赋值后的属性的值
		System.out.println("账号："+act1.getActNo());
		System.out.println("余额："+act1.getBalance());
		
		//调用重载的另一个构造方法来创建另一个对象
		Account act2=new Account("20191060141",1300000.5);
		//输出该构造方法创建的对象的属性的值
		System.out.println("账号："+act2.getActNo());
		System.out.println("余额："+act2.getBalance());
	}

}
