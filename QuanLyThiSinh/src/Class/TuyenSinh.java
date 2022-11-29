package Class;
import java.util.Scanner;
import java.util.ArrayList;

public class TuyenSinh {

        private ArrayList<Thisinh> dsts ;
    public TuyenSinh() {
         dsts = new ArrayList<Thisinh> ();
    }

    public void addThiSinh (Thisinh ts) {
        dsts.add(ts);
    }

    public void nhapDanhSach (Scanner sc) {
            Thisinh ts;
            int soluong ;
            int k = 0;
            int cont;
            int check;
            do {
                System.out.println("Nhap so luong thi sinh : ");
            soluong = sc.nextInt();
            sc.nextLine();

                for (int i = 0 ; i < soluong ; i++ ) {
                    System.out.println("Lan nhap thu " + (k+1) +" :");
                    System.out.println("Chon khoi thi:\n1.Khoi A\n2.Khoi B\n");
                    check = sc.nextInt();
                    sc.nextLine();
                    switch (check) {
                        case 1:
                            ts = new khoiA("Toan", "Ly", "Hoa");
                            break;

                        case 2 :
                            ts = new khoiB("Toan", "Hoa", "Sinh");
                            break;
                        default:
                            ts = new khoiA("Toan", "Ly", "Hoa");
                    }
                    ts.nhapThongtin(sc);
                    addThiSinh(ts);
                    k++;
                }
                System.out.println("Ban co muon nhap them khong :\n1.Co\n2.Khong");
                check = sc.nextInt();
                sc.nextLine();
            }   while (check == 1);
    }

        public void hienThi () {

            int n =1;
            for (Thisinh ts: dsts) {
                System.out.println("Thi sinh "+n+" : ");
                ts.hienThiThongTin();
                n++;
                System.out.println("\n");
            }
        }

    public void timKiemThiSinh(int soBaoDanh) {
        for (Thisinh ts : dsts) {
            if (ts.getSBD() == soBaoDanh) {
                ts.hienThiThongTin();
            }
        }
    }


}
