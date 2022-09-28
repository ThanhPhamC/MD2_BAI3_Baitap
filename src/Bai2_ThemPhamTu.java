
import java.util.Scanner;

public class Bai2_ThemPhamTu {

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
        System.out.println("Nhap vi tri index : ");
        int index = Integer.parseInt(sc.nextLine());
        if (index<-1||index>lenght-1){
            System.err.println("Sai vi tri index, hay nhap lai trong khoang tu 0-"+(lenght-1));
            index = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhap gia tri muon them");
        int value = Integer.parseInt(sc.nextLine());
        int[] newArr = new int[lenght + 1];
        System.out.println("Mang moi la :");
        for (int i = 0; i < lenght + 1; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[i - 1];
            }
            System.out.printf("%d\t", newArr[i]);
        }
    }
}
