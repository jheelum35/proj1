package Builderpattern;

public class Earthquake implements Builder {
private Home earthquakehome = new Home();
	@Override
	public void BuildFloor() {
		// TODO Auto-generated method stub
		System.out.println("EarthQuake Resistant Floor");
	}

	@Override
	public void BuildWall() {
		// TODO Auto-generated method stub
		
		System.out.println("EarthQuake Resistant wall");
		
	}

	@Override
	public void BuildTerrace() {
		// TODO Auto-generated method stub
		System.out.println("EarthQuake Resistant tarrace");
		
	}

	@Override
	public Home getComplexHomeObject() {
		// TODO Auto-generated method stub
		return this.earthquakehome;
	}

}
