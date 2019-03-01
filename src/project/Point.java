package project;

public class Point {

	public static void main(String[] args) {
		Point obj = new Point();
		Point obj1 = new Point(5,6);
		obj1.distance(obj);
		
	}
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	Point(){
	}
	
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double distance() {
		double distanceFromOrigin = Math.sqrt((x*x)+(y*y));
		return distanceFromOrigin;
	}
	
	public double distance(Point p)
	{
		double distanceFromPoint = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
		//System.out.println(distanceFromPoint);
		return distanceFromPoint;
	}
}
