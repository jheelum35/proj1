package Prototype;

public class PrototypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ProfessionalCashe.loadProfessionCashe();
		
		Profession docprofession = ProfessionalCashe.getcloneNewProfession(1);
		
		System.out.println(docprofession);
		Profession engprofession = ProfessionalCashe.getcloneNewProfession(2);
		
		System.out.println(engprofession);
		Profession teacherprofession = ProfessionalCashe.getcloneNewProfession(3);
		
		System.out.println(teacherprofession);
		
		Profession docProfession = ProfessionalCashe.getcloneNewProfession(3);
		
		System.out.println(docProfession);
		
		
		
		
		
		
		
	}

}
