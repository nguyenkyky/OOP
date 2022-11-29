import java.util.Scanner;

public class CongNhan extends CanBo {
    private int Bac;

    public CongNhan() {

    }

    public CongNhan(String HoTen,String NgaySinh, String DiaChi,String GioiTinh,int Bac) {
        super(HoTen,NgaySinh,GioiTinh,DiaChi);
        this.Bac=Bac;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

            System.out.println("\t Nhap bac : ");
            Bac = sc.nextInt();

       while (Bac <= 0 || Bac >7) {
           System.out.println("Bac khong dung , moi nhap lai : ");
           Bac = sc.nextInt();
       }

    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\t Bac: "+Bac+"/7");
    }
}
