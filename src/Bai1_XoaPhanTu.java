
import java.util.Scanner;

public class Bai1_XoaPhanTu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang: ");
        int lenght = Integer.parseInt(sc.nextLine());
        int[] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Nhap phan tu arr" + "[" + i + "]: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mang moi la ");
        for (int i = 0; i < lenght; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("Nhap phan tu muon xoa: ");
        int deleTe = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleTe) {
                count++;
            }
        }
        int[] newArr=new int[lenght-count];
        int size=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=deleTe){
                newArr[size]=arr[i];
                size++;
            }else {
                continue;
            }
        }
        System.out.println("Mang sau xoa la: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}