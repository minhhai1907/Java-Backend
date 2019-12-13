package KETHUA.Point2d;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    public Point2D() {
    }

    ;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
    class Point3D extends Point2D {
        float z;
        public Point3D(){};

        public Point3D(float z) {
            this.z = z;
        }

        Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }
        public void setXYZ(float x,float y,float z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
        public float[] getXYZ(){
            float[] arr={x,y,z};
            return arr;
        }

        @Override
        public String toString() {
            return "{x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }


    public static void main(String[] args) {
        Point3D point3D=new Point3D(4,5,6);
        System.out.println(point3D.toString());
    }

}
