package Prototype;

import java.util.Hashtable;

public class ProfessionalCashe {
	
private static Hashtable<Integer,Profession>	professionmap=new Hashtable<Integer,Profession>();
	
public static Profession getcloneNewProfession(int id)
{
	
	Profession  cashedProfessionObject= professionmap.get(id);
	
	return (Profession) cashedProfessionObject.ClonningMethod();
}

public static  void  loadProfessionCashe()
{
Doctor doc = new Doctor();
doc.id=1;
professionmap.put(1, doc);
Engineer eng = new Engineer();
eng.id=2;
professionmap.put(2, eng);
Teacher teacher = new Teacher();
professionmap.put(3, teacher);

}
}