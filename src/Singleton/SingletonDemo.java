package Singleton;

public class SingletonDemo {
	
	private  static SingletonDemo singeletondemo= new SingletonDemo();
	private SingletonDemo()
	{
		
	}
	public static  SingletonDemo  getInstance()
	{
		return singeletondemo;
	}
	
	public static void simplemethod()
	{
		System.out.println("ttttttttttttttt----->"+singeletondemo);
	}
	
	
	
	
}