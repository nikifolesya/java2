public class Point3d extends Point2d{
    private double zCoord;

    public Point3d ( double x, double y, double z) { 
        super(x, y);
        zCoord = z;
    }

    public Point3d () {
        this(0, 0, 0);
    }

    public double getZ () { 
        return zCoord;
    }

    public void setZ ( double val) {
        zCoord = val;
    }

    public double distanceTo (Point3d b) {
        return Math.sqrt((this.getX() - b.getX())*(this.getX() - b.getX()) + (this.getY() - b.getY())*(this.getY() - b.getY()) + (this.getZ() - b.getZ())*(this.getZ() - b.getZ()));
    }

}