import java.util.ArrayList;
import java.util.Scanner;

public class BienLai extends KhachHang {
    private int soCu;
    private int soMoi;
    private int soTien;

    public BienLai() {
    }

    public BienLai(String hoTen,int soNha,int maSoCongTo, int soCu, int soMoi, int soTien) {
        super(hoTen,soNha, maSoCongTo);
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.soTien = soTien;
    }

    public BienLai(int soCu, int soMoi, int soTien) {
        this.soCu = soCu;
        this.soMoi = soMoi;
        this.soTien = soTien;
    }


    public void nhapThongTin (Scanner sc) {
        super.nhapThongTin(sc);
        do {
            System.out.println("Nhap chi so cu : ");
            soCu = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap chi so moi : ");
            soMoi = sc.nextInt();
            sc.nextLine();

            if (soMoi < soCu) {
                System.out.println("So moi phai > so cu");
            }

            soTien = (soMoi - soCu) * 750;
        } while (soCu > soMoi);
    }






    public void hienThiThongTin () {
        super.hienThiThongTin();
        System.out.println("Chi so cu : " + soCu);
        System.out.println("Chi so moi : " + soMoi);
        System.out.println("So Tien : " + soTien);
    }
}
