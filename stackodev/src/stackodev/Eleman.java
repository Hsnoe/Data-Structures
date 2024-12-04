package stackodev;

import java.util.LinkedList;
import java.util.Scanner;

class Eleman {
    String ad;
    String soyad;
    String dogumTarihi;
    String telefon;

    public Eleman(String ad, String soyad, String dogumTarihi, String telefon) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Ad: " + ad + ", Soyad: " + soyad + ", Doğum Tarihi: " + dogumTarihi + ", Telefon: " + telefon;
    }
}