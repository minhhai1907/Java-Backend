package MangVaPhuongThuc.Baitap;

import java.util.Scanner;

public class ThemPhanTu {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;


        System.out.println("mang vua tao la: ");
        for (int i=0; i<10; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");


        Scanner sc = new Scanner(System.in);
        System.out.println("nhap value :");
        int value = sc.nextInt();

        System.out.println("Nhap index: ");
        int index = sc.nextInt();

        for (int i = array.length - 1; i > index; i--){
            array[i] = array[i - 1];
        }

        array[index] = value;

        System.out.println("mang moi:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
