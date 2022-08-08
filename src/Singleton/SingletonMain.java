package Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SingletonDemo s1= SingletonDemo.getInstance();
		s1.simplemethod();
		SingletonDemo s2= SingletonDemo.getInstance();
		s2.simplemethod();



	}

}
