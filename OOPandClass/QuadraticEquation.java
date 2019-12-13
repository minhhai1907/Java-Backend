package OOPandClass;

import java.util.Scanner;

class Quadratic{
    private double a;
    private double b;
    private double c;

    public Quadratic(){}

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public Quadratic(double a,double b){
        this.a=a;
        this.b=b;
    }
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
             double v = b * b - 4 * a * c;
             return v;
        }
    public double getRoot1() {
             double r1=(-b+Math.sqrt(getDiscriminant()))/(2*a);
             return r1;
        }
    public double getRoot2(){
           double r2=(-b-Math.sqrt(getDiscriminant()))/(2*a);
      return r2;
    }
}

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a");
        double a=input.nextDouble();
        System.out.println("Enter b");
        double b=input.nextDouble();
        System.out.println("Enter c");
        double c=input.nextDouble();
        Quadratic quadratic= new Quadratic(a,b,c);
//        quadratic.setA(a);
//        quadratic.setB(b);
//        quadratic.setC(c);
        if(quadratic.getDiscriminant()>0){
            System.out.println(quadratic.getRoot1());
            System.out.println(quadratic.getRoot2());
        }
        else if(quadratic.getDiscriminant()==0){
            System.out.println("x1=x1= "+(-quadratic.getB()/(2*quadratic.getA())));
        }
        else System.out.println("The equation has no roots");
    }
}
