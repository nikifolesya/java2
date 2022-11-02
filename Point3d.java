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

    public boolean equalsPoint3d(Point3d b) {
        if (b.getX() != this.getX())
            return false;
        if (b.getY() != this.getY())
            return false;
        if (b.getZ() != this.getZ())
            return false;
        return true;
    }

    public static boolean isTriangle(Point3d a, Point3d b, Point3d c) {
        return (a.equalsPoint3d(b) || a.equalsPoint3d(c)
                || b.equalsPoint3d(c)) ? false : true;
    }
}