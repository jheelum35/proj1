package Builderpattern;

public class FloodRegistantBuilder implements Builder {
	private Home floodHome = new Home();
	@Override
	public void BuildFloor() {
		// TODO Auto-generated method stub
		System.out.println("Water Resistant Floor");
	}

	@Override
	public void BuildWall() {
		// TODO Auto-generated method stub
		
		System.out.println("Water Resistant wall");
		
	}

	@Override
	public void BuildTerrace() {
		// TODO Auto-generated method stub
		System.out.println("Water Resistant tarrace");
		
	}

	@Override
	public Home getComplexHomeObject() {
		// TODO Auto-generated method stub
		return this.floodHome;
	}

}
