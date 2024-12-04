package YeniPkg;

import java.util.Scanner;

public class AnaSinif {

    String ad;
    int vizeNotu;
    float finalNotu;

    public AnaSinif(String ad, int vizeNotu, float finalNotu) {
        this.ad = ad;
        this.vizeNotu = vizeNotu;
        this.finalNotu = finalNotu;
    }

    public AnaSinif(String ad, int vizeNotu) {
        this.ad = ad;
        this.vizeNotu = vizeNotu;
    }

    public static void yazdir() {
        System.out.println("Yazdırma işlemi");
        System.out.println("-----------------------------");
    }

    public static void ikinciSinifDegerYazdir(IkinciSinif iks) {
    	System.out.println();
        System.out.println("Öğrenci Adı: " + iks.getOgrenciAd());
        System.out.println("Vize Notu: " + iks.getVize());
        System.out.println("Final Notu: " + iks.getFinall());
    }

    public static IkinciSinif ikinciSinifDegerAta(String ad, int vize, float finall){
        IkinciSinif nesne = new IkinciSinif();
        nesne.setOgrenciAd(ad);
        nesne.setVize(vize);
        nesne.setFinall(finall);
        return nesne;
    }

    public static void main(String[] args) {
        AnaSinif as = new AnaSinif("Ahmet", 50, 60);
        AnaSinif as2 = new AnaSinif("Mehmet", 70);

        AnaSinif.yazdir();

        IkinciSinif iks = new IkinciSinif("Ali", 50, 60);
        AnaSinif.ikinciSinifDegerYazdir(iks);

        IkinciSinif iks2 = AnaSinif.ikinciSinifDegerAta("Veli", 70, 80);

        IkinciSinif[] dizi = new IkinciSinif[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+". Öğrenci Adı: ");
            String ad = sc.nextLine();
            System.out.println("Vize Notu: ");
            int vize = sc.nextInt();
            System.out.println("Final Notu: ");
            System.out.println("------------------------------4");
            float finall = sc.nextFloat();
            sc.nextLine();

            IkinciSinif obje = new IkinciSinif(ad, vize, finall);
            dizi[i] = obje;
        }

        for (int i = 0; i < dizi.length; i++) {
        	System.out.println();
            System.out.println((i+1)+". Ogrenci yazdırma işlemi");
            AnaSinif.ikinciSinifDegerYazdir(dizi[i]);
        }
    }
}
