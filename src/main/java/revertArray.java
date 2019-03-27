import java.util.Arrays;
import java.util.Scanner;

public class revertArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Nhap Size cua mang");
        int size=scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100 + 1);

        }
        System.out.println("Ta co 1 mang: " + Arrays.toString(array));
        revert(array);
        System.out.println("Mang da dao nguoc: " + Arrays.toString(array));

    }
        private static void revert ( int[] arr){
            for (int i = 0; i < arr.length/2; i++) {
                int temp=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=temp;

            }
        }
    }