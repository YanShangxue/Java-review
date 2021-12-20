package encapTest02;
/*
 * 封装的步骤：
 * 	1、所有属性私有化，使用private关键字进行修饰，private表示私有的,修饰的所有数据只能在本类中访问。
 *  
 *  2、对外提供简单的操作入口，也就是说以后外部程序想要访问age属性，必须通过这些简单的入口进行访问。
 *  	- 对外提供两个公开的方法，分别是set方法和get方法
 *  
 *    一个属性，通常访问时有两种方式，一种是读取属性的值【get】，另一种是修改属性的值【set】
 *  
 *  3、set方法的命名规范：
 *  	public void setAge(int a){
 *  		age=a;
 *  	}
 *  
 *  4、get方法命名规范：
 *  	public void getAge(){
 *  		return age;
 *  	}
 * 
 * 需要先记住以下内容：
 * 	setter and getter方法没有static关键字
 * 	有static关键字修饰的方法怎么调用：类名.方法名（实参）；
 * 	没有static关键字修饰的方法怎么调用：引用.方法名（实参）；
 *
 */
public class User {
	//属性私有化
	private int age;
	
	public void setAge(int a){
		//age=a;
		if(a<0||a>130)
		{
			System.out.println("输入的年龄不合法");
			return;
		}
		//若能执行到这一步，则年龄合法，可以进行赋值运算
		age=a;
	}
	public int getAge() {
		return age;
	}
}
