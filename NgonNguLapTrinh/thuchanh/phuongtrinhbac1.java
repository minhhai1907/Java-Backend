package NgonNguLapTrinh.thuchanh;

import java.util.Scanner;
public class phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("enter a:");
        a=sc.nextDouble();
        System.out.print("enter b:");
        b= sc.nextDouble();
        System.out.print("enter c:");
        c= sc.nextDouble();
        if (a!=0){
         double answer = (c-b)/a;
            System.out.println("nghiem cua phuong trinh la:" + answer);
        } else {
            if (b==0){
                System.out.println("phuong trinh vo so nghiem");
            }else
                System.out.println("phuonwg trinh vo nghiem");
        }
    }

}
