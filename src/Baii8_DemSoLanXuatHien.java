import java.util.Scanner;

public class Baii8_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi ban dau: ");
        String chuoi = sc.nextLine();
        System.out.println("Nhap ki tu muon kiem tra: ");
        char charInput=sc.nextLine().charAt(0);
        char[] arr = chuoi.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (charInput==arr[i]){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua "+ charInput+ " la: "+count);
    }
}
