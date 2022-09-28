
import java.util.Scanner;

public class Bai6_TinhTongCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so cot: ");
        int colum = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.printf("arr[%d][%d]=", i, j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mang moi la: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(" Nhap vi tri cot muon tinh tong: ");
        int cotTong=Integer.parseInt(sc.nextLine());
        int tong=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (j==cotTong){
                    tong+=arr[i][cotTong];
                }
            }
        }System.out.println(" Tong gia tri cot "+cotTong+ " = "+tong);
    }
}
