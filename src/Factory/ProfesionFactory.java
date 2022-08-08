package Factory;

public class ProfesionFactory {
	
	
	
	public static Profession  getProfessionTrype(String professinType)
	{
		
		if(professinType.equalsIgnoreCase("Doctor"))
		{
			return new Doctor();
		}
		else if(professinType.equalsIgnoreCase("Engineer"))
		{
			return new Engineer();
		}
		else if(professinType.equalsIgnoreCase("Teacher"))
		{
			return new Teacher();
		}
		
		return null;
		
	}
	

}
