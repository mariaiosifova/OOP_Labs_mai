package PZ2;

class Vector {
    private  double x;
    private  double y;
    private  double z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);    
    }

    public Vector subtract(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);    
    }

    public double multiplyVectors(Vector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public Vector multiplyScalar(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);    
    }
}