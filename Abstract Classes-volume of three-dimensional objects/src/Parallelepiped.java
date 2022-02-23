
public class Parallelepiped extends Volume {
	
	private int area=10;
	private int height=12;
	

	@Override
	public void computation() {
		double volume=area*height;
		
	}

	@Override
	public void print() {
		double volume=area*height;
		System.out.println("The volume of the parallelepiped is: "+volume+" cm cubed");
		
	}

}
