package Class;

import java.util.Scanner;


public class Tailieu {
    private String maTailieu;
    private String tenNXB;
    private int soBanPhatHanh;

    public Tailieu() {

    }

    public Tailieu(String maTailieu, String tenNXB , int soBanPhatHanh) {
        this.maTailieu = maTailieu ;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("\t Nhap ma tai lieu : ") ;
        maTailieu = sc.nextLine();
        System.out.println("\t Nhap ten nha xuat ban : ") ;
        tenNXB = sc.nextLine();
        System.out.println("\t Nhap so ban phat hanh : ") ;
        soBanPhatHanh = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin () {
        System.out.println("\t Ma tai lieu : " + maTailieu) ;
        System.out.println("\t Ten nha xuat ban : " + tenNXB) ;
        System.out.println("\t So ban phat hanh : " + soBanPhatHanh) ;
    }

    public String getname () {
        return maTailieu;
    }


}
