public class Main {
    public static void main(String[] args) {
        VanBan vb = new VanBan();

        vb.setVanban("  Doan Quan     Viet Nam  ");
        System.out.println("Chuan hoa : " + vb.chuanHoa());
        System.out.println("So ky tu : " + vb.demSoKyTu());
        System.out.println("So tu : " + vb.demSoTu());
        System.out.println("So chu n : " + vb.demSoKyTuX('n'));

    }
}