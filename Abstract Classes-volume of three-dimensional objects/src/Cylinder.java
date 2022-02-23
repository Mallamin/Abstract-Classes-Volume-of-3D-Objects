
public class Cylinder extends Volume {

	double pi=3.14;
	int radius=2;
	int height=10;



	@Override
	public void computation() {

		double volume = pi * radius * radius * height;

	}

	@Override
	public void print() {
		double volume = pi * radius * radius * height;

		System.out.println("Here's the volume of the cylinder: " + volume + " cm cubed");

	}

}
