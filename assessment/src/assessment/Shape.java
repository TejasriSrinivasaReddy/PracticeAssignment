package assessment;

public interface Shape {
	double getArea();
}

class Rectangle implements Shape{
	private double length=4;
	private double width=5;
	
	public double getArea(){
		double a=length*width;
		return a;
	}
	public String toString(){
		
		return "shape[color=red]";
	}
}

class Triangle implements Shape{
	double base=4;
	double height=5;
	
	public double getArea() {
		return (base*height)/2;
	}
	public String toString(){
		
		return "shape[color=blue]";
	}
	
}