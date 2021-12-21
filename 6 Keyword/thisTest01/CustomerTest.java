package thisTest01;


public class CustomerTest {

	public static void main(String[] args) {

		//创建Customer对象
		Customer c1 =new Customer(); 
		c1.name="朱元璋";
		System.out.println(c1.name);
		//c1购物
		c1.shopping();
		//再创建一个Customer对象
		Customer c2 =new Customer();
		c2.name="李世民";
		System.out.println(c2.name);
		//c2购物
		c2.shopping();
		
		//调用doSome方法（修饰符列表中有static）
		//采用"类名."的方式访问
		Customer.doSome();
		
		//调用doOther方法(修饰符列表中有static)
		Customer.doOther();
	}	
}
