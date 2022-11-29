package Class;


import java.util.Scanner;
import java.util.ArrayList;



public class QuanLySach {
    private ArrayList<Tailieu> dstl;

    public QuanLySach() {
        dstl = new ArrayList<Tailieu>(10);
    }

    public void themTaiLieu(Tailieu tl) {
        dstl.add(tl);
    }

    public void nhapDanhSachTL(Scanner sc) {
        int i ;
        int chon;
        int sl;
        Tailieu tl;
        int k = 0;
        int answer;
        int sl2 = 0 ;
        do {
            System.out.println("Nhap so luong tai lieu : ");
            sl = sc.nextInt();

            for (i = 0; i < sl; i++) {
                System.out.println("\n");
                System.out.println("Lan nhap thu " + (k + 1) + ": ");
                System.out.println("Chon loai tai lieu : \n1.Sach\n2.Tap chi\n3.Bao");
                chon = sc.nextInt();
                sc.nextLine();
                switch (chon) {

                    case 1:

                        tl = new Sach();
                        break;

                    case 2:

                        tl = new TapChi();
                        break;

                    case 3:

                        tl = new Bao();
                        break;
                    default:
                        tl = new Sach();
                        break;
                }
                tl.nhapThongTin(sc);
                themTaiLieu(tl);
                k++;
            }

            System.out.println("Ban co muon nhap them tai lieu khong :\n1.Co\n2.Khong\n");
            answer = sc.nextInt();
            sc.nextLine();
        }   while (answer == 1);
    }

    public void hienThi () {
        int n = 1;
        for(Tailieu tl : dstl) {
            System.out.println("Tai lieu " + n + ": ");
            tl.hienThiThongTin();
            n++;
            System.out.println("\n");
        }
    }

    public void timKiemTaiLieu (String name) {
        for(Tailieu tl : dstl) {
            if(name.equals(tl.getname())) {
                tl.hienThiThongTin();
                break;
            }
            else {
                System.out.println("Khong tim thay tai lieu");
                break;
            }
        }
    }

    public void timKiemLoaiTaiLieu(String loai) {
    for (Tailieu tl : dstl) {
        if(loai.equals("Sach") && tl instanceof Sach) {
            tl.hienThiThongTin();
            break;
        }
        else if (loai.equals("Bao") && tl instanceof Bao) {
            tl.hienThiThongTin();
            break;
        }
        else if (loai.equals("Tap Chi") && tl instanceof TapChi) {
            tl.hienThiThongTin();
            break;
        }
        else {
            System.out.println("Khong tim thay tai lieu");
            break;
        }
    }
    }

}



