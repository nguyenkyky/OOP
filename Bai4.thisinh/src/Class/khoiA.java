package Class;

import java.util.Scanner;


public class khoiA extends Thisinh {
    private String mon1;
    private String mon2;
    private String mon3;

    public khoiA () {

    }

    public khoiA (String mon1, String mon2, String mon3) {
       this.mon1 = mon1 ;
       this.mon2 = mon2;
       this.mon3 = mon3;
    }

    @Override
    public void nhapThongtin(Scanner sc) {
        super.nhapThongtin(sc);

    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cac mon thi : " + mon1 +" , " + mon2 + " , " + mon3);
    }
}
