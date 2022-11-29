package Class;
import java.util.Scanner;


public class Thisinh {
    private int SBD;
    private String name;
    private String diaChi;
    private int uuTien;

    public Thisinh() {

    }

    public Thisinh(int SBD , String name , String diaChi, int uuTien) {
        this.diaChi= diaChi;
        this.SBD = SBD;
        this.name = name ;
        this.uuTien= uuTien;
    }


    public void nhapThongtin(Scanner sc) {
        System.out.println("Nhap SBD : ") ;
        SBD = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten : " ) ;
        name = sc.nextLine();
        System.out.println("Nhap dia chi : " );
        diaChi = sc.nextLine();
        System.out.println("Nhap khu vuc uu tien : ") ;
        uuTien = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("SBD : " + SBD);
        System.out.println("Ho ten : " + name);
        System.out.println("Dia chi : " + diaChi);
        System.out.println("Khu vuc uu tien : " + uuTien);
    }

    public int getSBD () {
        return SBD ;
    }

    public String getName () {
        return name;
    }

}
