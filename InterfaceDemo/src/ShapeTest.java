
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		// Programming for interfaces not implementation
		
		Shape shape = new Circle(10);
		
		Circle c = new Circle(10);
		
		shape.draw();
		System.out.println("Radius= "+c.getRadius());
		System.out.println("Area= "+shape.getArea());
		
		//Switching from implementation to another easily
		
		shape = new Rectangle(10 , 10);
		shape.draw();
		System.out.println("Area= "+shape.getArea());

	}

}
