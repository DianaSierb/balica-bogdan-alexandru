public class Point2D {
	protected double x;
	protected double y;
	
	public Point2D(double x, double y) {
		this.x=x;
		this.y=y;
		}
	
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

	public double distance(Point2D p) {
		return Math.sqrt(Math.pow((this.getX()-p.getX()), 2.0) + Math.pow((this.getY()-p.getY()), 2.0));
		}
	
	public static void main(String args[]) {
		Point2D q;
		Point2D w;
		q = new Point2D (2.2, 3.5);
		w = new Point2D (3.5, 1.7);
		double d;
		d=q.distance(w);
		System.out.println("Distanta este: " + d);
		}
	}