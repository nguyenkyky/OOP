package Class;
import java.util.Scanner;


public class TapChi extends Tailieu {
    // thuoc tinh
    private int soPhatHanh;
    private int thangPhatHanh;

    // phuong thuc
    // ham khoi tao khong doi so
    public TapChi() {

    }

    // ham khoi tao co doi so
    public TapChi(String maTaiLieu, String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.soPhatHanh = soBanPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\t Nhap so phat hanh: ");
        soPhatHanh = sc.nextInt();
        System.out.print("\t Nhap thang phat hanh: ");
        thangPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\t So phat hanh: " + soPhatHanh);
        System.out.println("\t Thang phat hanh: " + thangPhatHanh);
    }
}