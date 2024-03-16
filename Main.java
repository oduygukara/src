import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<HashMap<String,String>>ogrenciListesi= new LinkedList<>();
        Scanner ert= new Scanner(System.in);

        for (int i = 0; i <3 ; i++) {
            HashMap<String,String> ogrenci= new HashMap<>();
            System.out.println("Öğrenci "+ "#"+ (i+1)+ " bilgilerini giriniz: ");
            System.out.print("İsim: ");
            String isim= ert.nextLine();
            ogrenci.put("İsim", isim);

            System.out.print("Soyisim: ");
            String soyisim= ert.nextLine();
            ogrenci.put("Soyisim", soyisim);

            System.out.print("Vize notu: ");
            String vizeNotu= ert.nextLine();
            ogrenci.put("Vize notu", vizeNotu);

            System.out.print("Final notu: ");
            String finalNotu= ert.nextLine();
            ogrenci.put("Final notu",finalNotu);

            ogrenciListesi.add(ogrenci);
        }
        System.out.println("Aranacak öğrencinin isim ve soyismini yazınız: ");
        System.out.print("İsim: ");
        String arananİsim= ert.nextLine();
        System.out.print("Soyisim: ");
        String arananSoyisim= ert.nextLine();


        boolean bulundu= false;
        for (HashMap<String,String > ogrenci:ogrenciListesi) {
            String isim= ogrenci.get("İsim");
            String soyisim= ogrenci.get("Soyisim");


            if (isim.equalsIgnoreCase(arananİsim) && soyisim.equalsIgnoreCase(arananSoyisim)){
                System.out.println("Öğrenci bilgileri: ");
                System.out.println("İsim: "+ isim);
                System.out.println("Soyisim: "+ soyisim);
                System.out.println("Vize notu: "+ ogrenci.get("Vize notu"));
                System.out.println("Final notu: "+ ogrenci.get("Final notu"));
                bulundu=true;
                break;
            }
        }
        if (!bulundu){
            System.out.println("Öğrenci bulunamadı.");
        }
    }
}
