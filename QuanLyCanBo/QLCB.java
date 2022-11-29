import java.util.Scanner;
import java.util.ArrayList;

public class QLCB {

    private ArrayList<CanBo> qlcb;

    public QLCB() {
        qlcb = new ArrayList<CanBo>(20);
    }

    public void themCanBo(CanBo cb) {
        qlcb.add(cb);
    }


    public void nhapDanhSach(Scanner sc) {
        CanBo cb;
        System.out.print("Nhap vao so luong can bo: ");
        int n = sc.nextInt();
        sc.nextLine();


        System.out.println("Nhap thong tin chi tiet:");
        for (int i = 0; i < n; i++) {
            System.out.println("Lan nhap thu " + (i + 1) + ":");
            System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
            int chon = sc.nextInt();
            sc.nextLine();

            cb = new CanBo();

            switch (chon) {
                case 1:
                    cb = new KySu();
                    break;
                case 2:
                    cb = new NhanVien();
                    break;
                case 3:
                    cb = new CongNhan();
                    break;

                default:
                    cb = new KySu();
                    break;
            }

            // sau khi chon loai can bo thi nhap thong tin cho can bo do
            cb.nhapThongTin(sc);

            // nhap xong roi thi them can bo vao danh sach
            themCanBo(cb);

        }

    }

    public void hienThi() {
        int n = 1 ;
        for (CanBo cb : qlcb) {
            System.out.println("Can bo " + n + " : ");
            cb.hienThiThongTin();
            n++;
            System.out.println("\n");
        }
    }

    public void timKiemCanBo(String hoTen) {
        for (CanBo cb : qlcb) {
            if (hoTen.equals(cb.getname())) {
                cb.hienThiThongTin();
            }
            else {
                System.out.println("Khong tim thay can bo");
                break;
            }
        }
    }
}
