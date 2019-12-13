package AdvancedObjectOrientedDesign.Resizeable;



interface Resizeable{
    String resize();
}

abstract class Shape1 implements Resizeable{
    public abstract double getArea();
}

class Circle extends Shape1 implements Resizeable{
    double radius = 1;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String resize(){
        int i =(int) (Math.random()*100);
        return "Circle after resize: "+((getArea() * i / 100) + getArea())+" with "+i+"%";
    }
}


class Rectangle extends  Shape1 {
    double width=1;
    double height=1;
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }

    @Override
    public String resize(){
        int i =(int) (Math.random()*100);
        return "Rectangle after resize: "+ ((getArea() * i / 100) + getArea())+" with "+i+"%";
    }
}

class Square extends Shape1 implements Colorable1 {
    double side=1;
   public Square(double side){
       this.side=side;
   }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea(){
       return side*side;
    }

    @Override
    public String resize(){
        int i =(int) (Math.random()*100);
        return "Square after resize: "+((getArea() * i / 100) + getArea())+"with "+i+"%";
    }
    @Override
    public String howToColor(){
       return " color full four side";
    }
}

public class ResizeableTest{
    public static void main(String[] args) {
       Shape1[] s = new Shape1[3];
       s[0] = new Circle(5);
       s[1] = new Rectangle(3,4);
       s[2] = new Square(4);

        for(int i=0;i<s.length;i++){
            System.out.println(s[i].getArea());
        }
        System.out.println("after Resize");
        for (Shape1 shape1 : s){
            System.out.println(shape1.resize());
    }
}}