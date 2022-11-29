package Main;
import Class.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh dsTuyenSinh = new TuyenSinh();
        System.out.println("Nhap vao danh sach thi sinh: ");
        dsTuyenSinh.nhapDanhSach(sc);
        System.out.println("Danh sach thi sinh du thi la:");
        dsTuyenSinh.hienThi();
        System.out.print("Nhap so bao danh can tim: ");
        int soBaoDanh = sc.nextInt();
        sc.nextLine();

        dsTuyenSinh.timKiemThiSinh(soBaoDanh);
    }
}
