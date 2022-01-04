import java.util.ArrayList;
import java.util.Date;
public class Account_11_8 {

	public static void main(String[] args) {
		Account account = new Account("George",1122,1000);
		Account.setAnnualInterestRate(1.5);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withDraw(5);
		account.withDraw(4);
		account.withDraw(2);
		System.out.println("姓名： " + account.getName());
		System.out.println("年利率： " + Account.getAnnualInterestRate());
		System.out.println("余额： " + account.getBalance());
		
		ArrayList<Transactions> list = account.getTran();
		System.out.printf("%-30s%-14s%-14s%-15s\n", "交易时间","交易类型","交易金额","账户余额");
		for(int i = 0;i<list.size();i++) {
			Transactions tran = (Transactions)(list.get(i));
			System.out.printf("%-32s%-15%-14s%-15s\n", tran.getDate(),tran.getType(),tran.getAmount(),tran.getBalance());
		}
		
	}

}

class Account{
	private String name;
	private int id = 0;
	private double balance = 0;
	static private double annualInterestRate = 0;
	private Date tranDate;
	private ArrayList<Transactions> tran = new ArrayList<>();
	
	public Account() {
		tranDate = new Date();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Transactions> getTran(){
		return tran;
	}
	
	public Account(String name,int id,double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
		tranDate = new Date();
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	
	public Date getTranDate() {
		return tranDate;
	}
	
	public void withDraw(double x) {
		this.balance -= x;
		Transactions temp = new Transactions("W",x,this.balance,"");
		tran.add(temp);
	}
	
	public void deposit(double x) {
		this.balance += x;
		Transactions temp = new Transactions("D",x,this.balance,"");
		tran.add(temp);
	}
}

class Transactions{
	private Date date;
	private String type;
	private double amount;
	private double balance;
	private String descrip;
	
	public Transactions(String type,double amount,double balance,String descrip) {
		date = new Date();			// 交易日期
		this.type = type;	        // 交易类型
		this.amount = amount;		// 交易量
		this.balance = balance;		// 交易后的新余额
		this.descrip = descrip;		// 交易的描述
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getType() {
		return type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getDescrip() {
		return descrip;
	}
	
}
