import java.util.Scanner;
import java.util.ArrayList;

public class QuanLy {
    private  ArrayList<BienLai> ds ;

    public QuanLy() {
        ds = new ArrayList<BienLai>(10);
    }

    public void themBienLai (BienLai bl) {
        ds.add(bl);
    }

    public void nhapDanhSach(Scanner sc) {
        BienLai bl ;
        System.out.println("Nhap vao so luong bien lai  : ") ;
        int n ;
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao danh sach bien lai:");
        for (int i = 0; i < n; i++) {
            System.out.println("Bien lai thu " + (i + 1) + " la:");
            bl = new BienLai();
            bl.nhapThongTin(sc);
            themBienLai(bl);

        }
    }


    public void hienThiDanhSach() {
        for (int i = 0; i < ds.size(); i++) {
            System.out.println("Bien lai thu " + (i + 1) + " la:");
            ds.get(i).hienThiThongTin();
            System.out.println();
        }
    }



}
