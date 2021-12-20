package constructorTest;

/**
 * 关于java类中的构造方法：
 * 		1、构造方法又被称为构造函数/构造器/Constructor\
 * 		2、构造方法语法结构：
 * 			[修饰符列表]	构造方法名（形式参数列表）{
 * 				构造方法体；
 * 			}
 * 
 * 		3、回顾普通方法的语法结构：
 * 			[修饰符列表] 返回值类型 方法名 (形式参数列表) {
 * 				方法体；
 * 			}
 * 		4、对于构造方法来说，返回值类型不需要指定，并且也不能写void,只要
 * 			写上void，这个方法就变成普通方法了。
 * 		
 * 		5、对于构造方法来说，构造方法的方法名必须和类名保持一致。
 * 
 * 		6、构造方法的作用？
 * 			构造方法存在的意义是，通过构造方法的调用，可以创建对象。
 * 
 *		7、构造方法应该怎么调用？
 *			普通方法是这样调用的（方法修饰符中有static的时候）：类名.方法名（实参列表）；
 *							  （犯法修饰符没有static的时候）：引用.方法名（实参列表）；
 *			构造方法的调用：new 构造方法名（实参列表）；
 *		
 *		8、构造方法有返回值吗？
 			每个构造方法执行结束后都有返回值，但不用写return语句，并且返回值的类型，就是
 			构造方法所在类的类型。由于构造方法的返回值类型就是类本身，所以返回值类型不需要编写。
 			
 		9、注释和取消注释当前行：ctrl+/；多行注释：ctrl+shift+/
 		
 		10、当一个类中没有定义任何一个构造方法时，系统会默认给该类提供一个无参数的构造方法，
 			这个方法被称为缺少构造器。
 		
 		11、当一个类显示的将构造方法定义出来了，那么系统则不再默认为这个类提供缺省构造器，
 			建议开发中手动为当前类提供无参数构造方法，因为无参数构造方法太常用了。
 *
 * 		12、构造方法的支持重载机制。在一个类中定义多个形参（类型或个数或位置）不同的构造
 * 			方法，则可以构成方法重载机制。 
 * 
 */
public class ConstructorTest01 {

	public static void main(String[] args) {
		//以下程序创建了4个对象，只要构造函数调用，就会创建对象，并且一定是在“堆内存”中开辟内存空间
		User u1=new User();
		User u2=new User(5);
		User u3=new User("隆费风无");
		User u4=new User(5.321);
		
		//调用带有static的方法：类名.方法名();
		ConstructorTest01.doSome();
		//如果调用的方法在这个类里，可以省略类名
		doSome();
		
		//调用没有static的方法：引用.方法名();
		//doOther方法在ConstructorTest01类中，所以需要创建ConstructorTest01对象
		//创建ConstructorTest01对象，调用无参数构造方法
		ConstructorTest01 abc= new ConstructorTest01();//ConstructorTest01类中没有任何构造方法，系统会默认提供一个无参数构造器
		abc.doOther();
	}
	
	public static void doSome() {
		System.out.println("do some");
	}
	
	public void doOther() {
		System.out.println("do other");
	}
	
}
