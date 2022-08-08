package Factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Profession p= ProfesionFactory.getProfessionTrype("Doctor");
p.printProfession();


	}

}
