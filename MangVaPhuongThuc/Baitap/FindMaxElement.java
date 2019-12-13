package MangVaPhuongThuc.Baitap;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int dong, cot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row");
        dong = sc.nextInt();
        System.out.println("Enter Column ");
        cot = sc.nextInt();
        int arr[][] = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

            System.out.println("Mảng vừa nhập: ");
            for (int i = 0; i < dong; i++) {
                for (int j = 0; j < cot; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            int n = 0;
            int k = 0;
        int max = arr[0][0];
        for (int i = 0; i < dong; i++) {
            for(int j = 0; j < cot; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                   n= i;
                   k= j;
                }
            }
        } System.out.println("Phần tử lớn nhất là: " + max + ". Ở vị trí: ["  + n + "," + k +  "]");
    }

}

