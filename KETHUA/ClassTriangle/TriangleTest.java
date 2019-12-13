package KETHUA.ClassTriangle;
class shape{
    String colour;

}
 class Triangle extends shape {
    double side1=1.0;
    double side2=1.0;
    double side3=1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public  double getPerimeter(){
        return (side1+side2+side3);
    }

    public double getArea(){
        double p=getPerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public String toString(){
        return "canh 1: "+ side1
        +" canh 2: "+ side2
        +" canh 3: "+ side3
                + " chu vi: "+ getPerimeter()
                +" dien tich "+ getArea() ;
    }
}

public class TriangleTest{
    public static void main(String[] args) {
        Triangle triangle=new Triangle(3,4,5);
        System.out.println(triangle.toString());
    }
}

