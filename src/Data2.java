public class Data2 {


    private static String kartNo="1234567890123456";
    private static String sifre="Sifre01";

    Data2(){

    }
    Data2 (String kartNo,String sifre) {
        this.kartNo=kartNo;
        this.sifre = sifre;
    }

    public static String getKartNo() {
        return kartNo;
    }

    public static void setKartNo(String kartNo) {
        Data2.kartNo = kartNo;
    }

    public static String getSifre() {
        return sifre;
    }

    public static void setSifre(String sifre) {
        Data2.sifre = sifre;
    }
}
