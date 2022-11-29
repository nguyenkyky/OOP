import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;


    public CanBo () {

    }

    public CanBo (String hoTen , String ngaySinh , String gioiTinh , String diaChi ) {
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }


    public void nhapThongTin (Scanner sc) {
        System.out.println("\t Nhap ho ten : ");
        this.hoTen = sc.nextLine();
        System.out.println("\t Nhap ngay sinh : ");
        this.ngaySinh = sc.nextLine();
        System.out.println("\t Nhap gioi tinh : ");
        this.gioiTinh = sc.nextLine();
        System.out.println("\t Nhap dia chi : ");
        this.diaChi = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\t Ho ten: " + hoTen);
        System.out.println("\t Ngay sinh: " + ngaySinh);
        System.out.println("\t Gioi tinh: " + gioiTinh);
        System.out.println("\t Dia chi: " + diaChi);
    }


    public String getname () {
        return this.hoTen;
    }
}