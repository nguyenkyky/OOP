package Class;
import  java.util.Scanner;
public class Bao extends Tailieu {
    // thuoc tinh
    private String ngayPhatHanh;

    // phuong thuc
    // ham khoi tao khong doi so
    public Bao() {

    }

    // ham khoi tao co doi so
    public Bao(String maTaiLieu, String tenNXB, int soBanPhatHanh, String ngayPhatHanh) {
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    // ham nhap
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\t Nhap ngay phat hanh: ");
        ngayPhatHanh = sc.nextLine();
    }

    // ham hien thi
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\t Ngay phat hanh: " + ngayPhatHanh);
    }
}

