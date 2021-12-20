package encapTest02;

public class UserTest02 {

	public static void main(String[] args) {
		
		//创建User对象
		User user01=new User();
		//以下代码编译报错，age属性私有化，在外部程序中不能直接访问
		//从此之后age属性非常安全，但有点太安全了。
		//对于目前的程序来说，age属性彻底在外部访问不到了
		//所以需要去User类中定义方法来访问User的属性
		//System.out.println(user.age);
		
		//修改
		user01.setAge(-34); 
		
		//读取
		System.out.println(user01.getAge());
		
	}

}
