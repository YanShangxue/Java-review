package constructorTest;

//账户类
public class Account {

	//账号
	private String actNo;

	//余额
	private double balance;
	             
	public String getActNo() {        
		return actNo;                 
	}                                 

	public void setActNo(String actNo) {
		this.actNo = actNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
 	//若类中无构造方法，系统也自动生成以下无参数构造器
 	public Account(){
 		//初始化实例变量的内存空间
 		//actNo=null;
 		//balance =0.0;
 	}
 	
	public Account(String a,double b) {
		//初始化实例变量的内存空间
		actNo=a;
		balance=b;
	}
	
	
	
}
