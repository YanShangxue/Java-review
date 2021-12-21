package thisTest01;

/**
 * 关于java语言中的this关键字：
 * 		1、this是一个关键字，翻译为：这个。
 * 		2、this是一个引用，也是一个变量，this变量中保存了内存地址指向了自身，
 * 		   this存储再JVM堆内存的java对象的内部。
 * 		3、每个java对象内部都有一个this。
 * 		4、this可以出现在“实例方法”中，this指向正在执行这个动作的对象。(this代表当前对象)
 * 		5、this在多数情况下都是可以省略不写的
 * 		6、
 * @author 清酒
 *
 */
public class Customer {
	
	//姓名
	String name;	//实例变量：必须采用“引用.”的方式访问
	//使用默认的无参数构造方法
	
	//不带static关键字的一个方法
	//顾客购物的行为
	//每一个顾客购物最终的结果是不一样的
	//所以购物这个行为是属于对象级别的行为
	//由于每一个对象在执行购物这个动作的时候最终结果不同，所以购物这个动作必须有“对象”的参与。
	//重点：没有static关键字的方法被称为“实例方法”
	//重点：没有static关键字的变量被称为“实例变量”
	//注意：当一个行为/动作执行的过程中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不要带static关键字
	public void shopping() {
		//当xxx在购物时，输出：xxx在购物
		System.out.println(name+"在购物");
		//完整写法应该是System.out.println(引用.name+"在购物");
		//但在创建对象前，无法知道引用到底是什么，这时候就需要用到this了
		System.out.println(this.name+"在购物");
	}
	//带有static
	public static void doSome() {
		//因为带有static的方法是通过类名的方式访问的，所以这个方法执行过程中没有“当前对象”
		//或者说，因为上下文中没有“当前对象”，自然也不存在this
		
		//以下程序为什么编译错误？
		//doSome方法调用不是对象去调用，是一个类名去调用，执行过程中没有当前对象
		//name是一个“实例变量”，不能通过带static的方法去调用
		//System.out.println(name);
	}
	
	//如果非要用带static的方法来访问name这个实例变量的话，怎么办？
	public static void doOther() {
		//可以采用以下方案，但是以下方案，绝对不是访问的当前对象的name
		//创建对象
		Customer c = new Customer();
		System.out.println(c.name);	//这里访问的name是c引用指向对象的name
	}
}
