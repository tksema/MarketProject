package myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarketClass {
  /*
====================PROJEMIZ===================================
     * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
        1 manav,
        2 sarkuteri,
        3 market
        secime gore ,
        4-urunleri listele ve
        5-fiyatlari gelsin
     *
     * Basrili Market alış-veriş programı.
        1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

            No   Ürün    Fiyat
             ===== ======= ========
        00 Domates 2.10 TL ,
        01 Patates 3.20 TL ,
        02 Biber 1.50 TL ,
        03 Soğan 2.30 TL  ,
        04 Havuç 3.10 TL
        05 Elma 1.20 TL
        06 Muz 1.90 TL
        07 Çilek 6.10 TL
        08 Kavun 4.30 TL
        09 Üzüm 2.70 TL
        10 Limon 0.50 TL
     *
     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
          4. Adım: Alınacak bu ürünü
     * sepete ekleyiniz ve Sepeti yazdırınız.
         5. Başka bir ürün alıp almak
     * istemediğini sorunuz.
         6. Eğer devam etmek istiyorsa yeniden ürün seçme
     * kısmına yönlendiriniz.
         7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
     * ödeme sonrasında programı bitiriniz
     */







    //noUrunler urunFiyat ve fiyat variableları class levelde tuttum her yerde kullanabilmek için
    static String[] noUrunler = {"00 Domates", "01 Patates", "02 Biber", "03 Sogan", "04 Havuc",
            "05 Elma", "06 Muz", "07 Cilek", "08 Kavun", "09 Kavun", "10 Limon"};
    static String[] urunFiyat = {"2.10 Tl", "3.20 Tl", "1.50 Tl", "2.30 Tl", "3.10 TL",
            "1.20 Tl", "1.90 Tl", "6.10 Tl", "4.30 Tl", "2.70 TL", "0.50 Tl"};
    static double[] fiyat = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};

    public static void main(String[] args) {
        menu();
        Scanner scan = new Scanner(System.in);
        boolean devamEtmekIstıyormusunuz = false;
        int bitirme = 0;
        double toplam = 0;
        List<String> sepet = new ArrayList<>();
        List<String> urunler = new ArrayList<>();
        while (!devamEtmekIstıyormusunuz) {
            System.out.println("Urun no'suna gore listeden ürün seciniz:");
            int urunNo = scan.nextInt();
            if (urunNo > 10) {
                System.out.println("Lutfen geçerli bir ürünNo giriniz");
                continue;//10dan büyük girdiği durumlarda uyarı verip
                //döngüyü baştan başlatıcak.
            }
            System.out.println("Sectiginiz urun : " + urunler(urunNo));
            System.out.println("Kac kg satin almak istersiniz ?");
            int kg = scan.nextInt();
            toplam += (kg * fiyat[urunNo]);
            //burada sepetteki ürünleri tutacağız
            for (int i = 0; i < noUrunler.length; i++) {
                urunler.add(noUrunler[i]);//Arrayi listeye yazdırdı
            }
            sepet.add(urunler.get(urunNo));
            //
            System.out.println("Eger bitirmek istiyorsaniz 99 devam etmek icin 1 tusuna basiniz");
            //1 tuşuna basma sebebi konsolda ilerlemek için
            bitirme = scan.nextInt();
            if (bitirme == 99) {
                System.out.println(sepet);
                System.out.println("Odeyeceginiz tutar : " + toplam);
                devamEtmekIstıyormusunuz = true;
            }
        }
    }

    //Her methodda kullanılan her bir urunler ismi farklı bir scopetadır.
    //bu classta menuyu olusturduk.
    public static void menu() {
        System.out.println("No\t" + " Urun\t" + " Fiyat\t");
        List<String> urunler = new ArrayList<>();
        for (int i = 0; i < noUrunler.length; i++) {
            urunler.add(noUrunler[i]);//Arrayi listeye yazdırdım
        }
        List<String> urunFiyatlari = new ArrayList<>();
        for (int i = 0; i < urunFiyat.length; i++) {
            urunFiyatlari.add(urunFiyat[i]);//class leveldeki arrayden aldık.
        }
        for (int i = 0; i < noUrunler.length; i++) {
            System.out.println(urunler.get(i) + " " + urunFiyatlari.get(i));
        }
    }

    public static String urunler(int urunNo) {
        String donecekUrun = "";
        List<String> urunler = new ArrayList<>();
        for (int i = 0; i < noUrunler.length; i++) {
            urunler.add(noUrunler[i]);//Arrayi listeye yazdırdım
        }
        switch (urunNo) {
            case 0: {
                donecekUrun += urunler.get(0);
                break;
            }
            case 1: {
                donecekUrun += urunler.get(1);
                break;
            }
            case 2: {
                donecekUrun += urunler.get(2);
                break;
            }
            case 3: {
                donecekUrun += urunler.get(3);
                break;
            }
            case 4: {
                donecekUrun += urunler.get(4);
                break;
            }
            case 5: {
                donecekUrun += urunler.get(5);
                break;
            }
            case 6: {
                donecekUrun += urunler.get(6);
                break;
            }
            case 7: {
                donecekUrun += urunler.get(7);
                break;
            }
            case 8: {
                donecekUrun += urunler.get(8);
                break;
            }
            case 9: {
                donecekUrun += urunler.get(9);
                break;
            }
            case 10: {
                donecekUrun += urunler.get(10);
                break;
            }
        }
        return donecekUrun;
    }
}
