package constructorTest;

public class User {
	public User()
	{
		System.out.println("这是个无参数构造方法");
	}
	public User(int x)
	{
		System.out.println("输入的实参是整数型变量："+x);
	}
	public User(String x)
	{
		System.out.println("输入的实参是字符型变量："+x);
	}
	public User(double x)
	{
		System.out.println("输入的实参是浮点型变量："+x);
	}
}
