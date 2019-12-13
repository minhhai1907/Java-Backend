package MangVaPhuongThuc.Baitap;

public class AddArray {
    public static void main(String[] args) {
        int[] array1=new int[3];
        array1[0]=1;
        array1[1]=3;
        array1[2]=4;
        int[] array2=new int[4];
        array2[0]=2;
        array2[1]=5;
        array2[2]=6;
        array2[3]=3;
        System.out.print("Array 1: ");
        for (int i=0;i<3;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for ( int j=0;j<4;j++){
            System.out.print(array2[j]+" ");
        }
        System.out.println();
        int [] array3= new int[7];
        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        int j=0;
        for (int i=array1.length;i<array3.length;i++){
            array3[i]=array2[j];
            j++;
        }
        System.out.println("Array 3:");
        for (int i=0;i<array3.length;i++){
            System.out.print(array3[i]+" ");
        }

    }
}
