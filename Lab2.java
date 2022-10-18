class Lab2 {
    public static void main(String[] args) {
        Point3d a = new Point3d(1, 2, 3);
        Point3d b = new Point3d(2, 4, 5);
        Point3d c = new Point3d(3, 5, 6);
        //System.out.println(a.distanceTo(b));   
        System.out.println(computeArea(a, b, c));    
    }
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);
        double p = 0.5 * (ab + bc + ac);
        return Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
    }
}