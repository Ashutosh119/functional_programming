package section3.lambda;

interface Shape {
	void draw();
}


class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle drawing.....");
		
	}
	
}

class Sqaure implements Shape{

	@Override
	public void draw() {
		System.out.println("Sqaure Drawing.....");
		
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle is drawing.....");
		
	}
	
}

public class LambdaDemo {
	public static void main(String[] args) {
		//old way implementation
		/*
		Shape rectange = new Rectangle();
		rectange.draw();
		
		Shape square = new Sqaure();
		square.draw();
		
		Shape circle = new Circle();
		circle.draw();    */
		
		
		//Lambda expression implementation
		
		Shape rectangle = () -> System.out.println("Recatnagle callinf through lambda exp");
		rectangle.draw();
		
		Shape square = () -> System.out.println("Sqaure class calling through lambda....");
		square.draw();
		
		Shape circle = () -> System.out.println("Circle class is callinf with lambda....");
		circle.draw();
		
	}

}
