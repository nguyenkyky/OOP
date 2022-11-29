package Test;
import java.util.Scanner;
import Class.*;


public class Test {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);

        QuanLySach qls = new QuanLySach();
        qls.nhapDanhSachTL(sc);
        qls.hienThi();

        System.out.print("\n\nNhap vao loai tai lieu can tim: ");
        String loai = sc.nextLine();
        qls.timKiemLoaiTaiLieu(loai);

        System.out.print("\n\nNhap vao ma tai lieu can tim: ");
        String maTL = sc.nextLine();
        qls.timKiemTaiLieu(maTL);

        sc.close();

    }


}
