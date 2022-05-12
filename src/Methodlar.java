import java.util.Scanner;

public class Methodlar {
    static Scanner scan = new Scanner(System.in);


    public static void giris() {
        System.out.println("Kart numaranizi girin : ");
        String girilenKartNo = scan.nextLine();
        girilenKartNo=girilenKartNo.replace(" ","");

        System.out.println("Sifrenizi girin : ");
        String girilenSifre = scan.next();

        String kartNo= Data2.getKartNo();
        String sifre= Data2.getSifre();
//        if (girilenKartNo != kartNo &&  sifre!=girilenSifre){
        if (!girilenKartNo.equals( kartNo) &&  !sifre.equals(girilenSifre)){
            System.out.println("yanlis kart no veya sifre girdiniz.");
            giris();

        }else {
            System.out.println("Sifre basariyla girilmistir. Hosgeldiniz.");

        }
    }
}
