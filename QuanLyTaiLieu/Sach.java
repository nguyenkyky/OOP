package Class;
import java.util.Scanner;


public class Sach extends Tailieu {

    private String tenTacGia;
    private int soTrang;


    public Sach () {

    }

    public Sach(String maTailieu, String tenNXB , int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTailieu, tenNXB, soBanPhatHanh);
        this.tenTacGia=tenTacGia;
        this.soTrang=soTrang;
    }


    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.println("\t Nhap ten tac gia : ");
        tenTacGia = sc.nextLine();
        System.out.println("\t Nhap so trang : ");
        soTrang = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\t Ten tac gia : " + tenTacGia);
        System.out.println("\t So trang : " + soTrang);
    }
}
