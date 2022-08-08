package Builderpattern;

public interface Builder {
	
	
	
	public void BuildFloor();
	public void BuildWall();
	public void  BuildTerrace();

	public Home getComplexHomeObject();
	

}
