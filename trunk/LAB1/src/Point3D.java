public class Point3D {
	private Point2D p;
	private double z;

	public Point3D(double x, double y, double z) {
		p = new Point2D(x, y);
		this.z=z;
		}

	public double getX() {
        return p.getX();
        }
    
    public double getY() {
        return p.getY();
        }
    
	public double getZ() {
		return z;
		}
	public double distance() {   
        return ((this.getX()*p.getX()) + (this.getY()*p.getY()) + Math.pow((this.getZ()), 2.0));   
    }   
       
    public static void main(String[] args) {   
        Point3D point = new Point3D(1.2, 3.4, 5.8);   
        System.out.println("Distanta este: " + point.distance());   
        }
    }  