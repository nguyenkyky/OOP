import java.util.Scanner;


public class VanBan {
    private String vanban;

    public VanBan() {

    }

    public VanBan(String vanban){
        this.vanban = vanban;
    }

    public String getVanban() {
        return vanban;
    }

    public void setVanban(String vanban) {
        this.vanban = vanban;
    }

    public int demSoKyTu () {
        int n ;
        n = vanban.length();
        return n ;
    }

    public int demSoTu () {
        int n = 0 ;
        for (int i = 0 ; i < vanban.length() ; i++) {
            if(((' ') == (vanban.charAt(i)))) {
                n++;
            }
        }
        return n ;
    }

    public int demSoKyTuX (char x) {
        int n = 0 ;
        String vanban1 = vanban.toLowerCase() ;
        for(int i = 0 ; i < vanban1.length() ; i++ ) {
            if(x == (vanban1.charAt(i))) {
                n++ ;
            }
        }
        return n ;
    }

    public String chuanHoa() {
        String newStr = vanban.trim();
        while (newStr.indexOf("  ") != -1) {
                newStr = newStr.replaceAll("  ", " ");
        }
        vanban = newStr;
        return vanban;
    }
}
