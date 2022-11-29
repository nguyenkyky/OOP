import java.util.Scanner;
import java.util.ArrayList;

public class KhachHang {
    private String hoTen;
    private int soNha;
    private int maSoCongTo;


    public KhachHang() {
    }

    public KhachHang(String hoTen, int soNha, int maSoCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(int maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.println("Ho Ten : ") ;
        hoTen = sc.nextLine();
        System.out.println("So Nha : ") ;
        soNha = sc.nextInt();
        sc.nextLine();
        System.out.println("maSoCongTo: ");
        maSoCongTo = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin () {
        System.out.println("Ho Ten : " + hoTen);
        System.out.println("So Nha : " + soNha);
        System.out.println("Ma So Cong To : " + maSoCongTo);
    }

}
