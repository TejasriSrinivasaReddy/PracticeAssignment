package assessment;

public class MainClass {

	public static void main(String[] args) {
		Shape s=new Rectangle();
		System.out.println(s.getArea());
		System.out.println(s.toString());
		Shape r=new Triangle();
		System.out.println(r.getArea());
		System.out.println(r.toString());
	}
}
