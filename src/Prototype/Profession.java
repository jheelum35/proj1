package Prototype;

public abstract class Profession implements Cloneable{
	// when we want to clone a object and does not want to create new object 
	
	public  int  id;
	public String  name;
	abstract void print();
	public Object ClonningMethod()
	{
		Object clone = null;
		try {
			clone = super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return clone;
		
	}
	

}
