package KETHUA.LopCircle;

 class Circle {
    double radius=1;
    String colour= "red";
    public Circle(){};
    public Circle(double radius,String colour){
        this.radius=radius;
        this.colour=colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public  double getArea(){
        return radius*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "ban kinh :"+ radius
                +"mau sac:"+ colour
                +"dien tich:"+ getArea();
    }
}


 class Cylinder extends Circle{
    double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String colour, double height) {
        super(radius, colour);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume(){
        return getArea()*height;
    }
    @Override
    public String toString(){
        return " the tich:"+ Volume()
             +   "chieu cao"+ height;
    }

}
public class CircleTest{
    public static void main(String[] args) {
        Circle circle=new Circle(5,"yellow");
        System.out.println(circle.toString());

        Cylinder cylinder= new Cylinder(8,"yellow",5);
        System.out.println( cylinder.toString());
    }
}


