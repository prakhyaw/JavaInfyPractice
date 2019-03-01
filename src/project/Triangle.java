package project;

public class Triangle {
	
	static Point p1 = new Point();
	static Point p2 = new Point();
	static Point p3 = new Point();
	double a;
	double b;
	double c;
	double s;
	
	Triangle(){
		p1.setX(0);
		p1.setY(0);
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		p2.setX(1);
		p2.setY(1);
		
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		
		p3.setX(2);
		p3.setY(5);
		
		System.out.println(p3.getX());
		System.out.println(p3.getY());
		
		a = p2.distance();
		b = p3.distance();
		c = p2.distance(p3);
		s = (a+b+c)/2;
	}
	
	Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
		this.p1.setX(x1);
		this.p1.setY(y1);
		
		this.p2.setX(x2);
		this.p2.setY(y2);
		
		this.p3.setX(x3);
		this.p3.setY(y3);
		
		a = p1.distance(p2);
		b = p1.distance(p3);
		c = p2.distance(p3);
		s = (a+b+c)/2;
	}
	
	Triangle(Point p1, Point p2, Point p3){
		this.p1 = p1;
		p1.setX(2);
		p1.setY(5);
		
		this.p2 = p2;
		p2.setX(0);
		p2.setY(0);
		
		this.p3 = p3;
		p3.setX(5);
		p3.setY(0);
		
		a = p1.distance(p2);
		b = p1.distance(p3);
		c = p2.distance(p3);
		s = (a+b+c)/2;
	}
	
	public void getArea() {
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
	}
	
	public void getPerimeter() {
		System.out.println(s*2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle();
		obj.getArea();
		obj.getPerimeter();
		
		Triangle obj1 = new Triangle(2, 5, 0, 0, 5, 0);
		obj1.getArea();
		obj1.getPerimeter();
		
		Triangle obj2 = new Triangle(p1, p2, p3);
		obj2.getArea();
		obj2.getPerimeter();
		
	}

}
