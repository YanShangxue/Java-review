package encapTest02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer a =new Customer();
		//私有的属性不能在外部直接访问，这就是封装
		//a.id=410;  会报错
		
		//操作入口变成了只能通过set和get方法进行访问
		//在set方法和get方法执行过程中可以进行安全过滤
		a.setId(530104);
		a.setName("王子怡");
		a.setAddr("昆明呈贡区");
		a.setAge(21);
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getAddr());
		System.out.println(a.getAge());
		
		

	}

}
