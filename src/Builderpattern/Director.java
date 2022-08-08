package Builderpattern;

public class Director {
	
	
	private Builder builder;

	public Director(Builder buildertype) {
		// TODO Auto-generated constructor stub
		
		this.builder= buildertype;
	}
public void RequiredHomeConstruction()
{
	this.builder.BuildFloor();
	this.builder.BuildTerrace();
	this.builder.BuildWall();
}

public Home getComplexHome()
{
	return this.builder.getComplexHomeObject();
}

}
