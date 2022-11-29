import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec ;


    public NhanVien () {

    }

    public NhanVien(String HoTen, String DiaChi , String GioiTinh , String NgaySinh, String CongViec) {
        super(HoTen,NgaySinh,GioiTinh,DiaChi);
        this.congViec = CongViec;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("\t Nhap cong viec : ");
        this.congViec = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\t Cong Viec : " + congViec);
    }
}
