package thisTest02;

public class ThisTest02 {
	//实例变量（引用.的方式访问）
	int num=10;
	
	//main方法是一个带有static的方法,所以以下函数会报错
	/*
	 	public static void main(String[] args) {
		System.out.println(num);
		}
	*/
	public static void main(String[] args) {
		ThisTest02 t =new ThisTest02();
		System.out.println(t.num);
	}
}
