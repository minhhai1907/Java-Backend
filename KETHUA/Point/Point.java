package KETHUA.Point;

class Point {
     float x = 0.0f;
     float y = 0.0f;

     public Point() {
     }

     public Point(float x, float y) {
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

     public float[] getXY() {
         float[] arr = {x, y};
         return arr;
     }

     public void setXY(float x, float y) {
         this.x = x;
         this.y = y;
     }

     public String ToString(){
         return "x is: " + x
                 + " , y is: " + y;
     }
 }


    class MovablePoint extends Point{
        float xSpeed=0.0f;
        float ySpeed=0.0f;

    public MovablePoint(){
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.x=xSpeed;
        this.y=ySpeed;
    }


    public  MovablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
            return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
    }

    public float getySpeed() {
            return ySpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public  void  setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
        }

        public float[] getSpeed() {
            float[] arr1 = {xSpeed, ySpeed};
            return arr1;
        }

        @Override
        public String toString(){
        return "x is: " + x
                + " , y is: " + y
                + " .Speed is: " + xSpeed + " and " + ySpeed;
    }

        public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
    }

