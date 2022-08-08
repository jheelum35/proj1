package Builderpattern;

public class BuilderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FloodRegistantBuilder eq = new FloodRegistantBuilder();
		Director director = new Director(eq);
		director.RequiredHomeConstruction();
		Home homeatEnd = director.getComplexHome();
		System.out.println(homeatEnd);
		System.out.println(homeatEnd.floor);

	}

}
