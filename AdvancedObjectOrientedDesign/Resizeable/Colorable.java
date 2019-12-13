package AdvancedObjectOrientedDesign.Resizeable;

public class Colorable {
    public static void main(String[] args) {
        Shape1[] shape= new Shape1[3];
        shape[0]=new Circle(5);
        shape[1]=new Rectangle(3,5);
        shape[2]=new Square(4);
        for (int i=0;i<shape.length;i++){
            System.out.println(shape[i].getArea());
            if(shape[i]  instanceof Square){
                System.out.println(((Square) shape[i]).howToColor());
        }
    }
}}
interface Colorable1 {
    String howToColor();
    }

