package oops;

//TemelIslem.java
public abstract class TemelIslem {
 public abstract double hesapla(double sayi1, double sayi2);
}

//Toplama.java
public class Toplama extends TemelIslem {
 @Override
 public double hesapla(double sayi1, double sayi2) {
     return sayi1 + sayi2;
 }
}

//Cikarma.java
public class Cikarma extends TemelIslem {
 @Override
 public double hesapla(double sayi1, double sayi2) {
     return sayi1 - sayi2;
 }
}

//Carpma.java
public class Carpma extends TemelIslem {
 @Override
 public double hesapla(double sayi1, double sayi2) {
     return sayi1 * sayi2;
 }
}

//Bolme.java
public class Bolme extends TemelIslem {
 @Override
 public double hesapla(double sayi1, double sayi2) {
     if (sayi2 == 0) {
         System.out.println("Bölen sıfır olamaz!");
         return Double.NaN;
     } else {
         return sayi1 / sayi2;
     }
 }
}

//HesapMakinesi.java
public class HesapMakinesi {
 private TemelIslem islem;

 public void setIslem(TemelIslem islem) {
     this.islem = islem;
 }

 public double hesapla(double sayi1, double sayi2) {
     if (islem == null) {
         System.out.println("İşlem seçilmedi!");
         return Double.NaN;
     }
     return islem.hesapla(sayi1, sayi2);
 }

 public static void main(String[] args) {
     HesapMakinesi hesapMakinesi = new HesapMakinesi();

     double sayi1 = 10;
     double sayi2 = 5;

     hesapMakinesi.setIslem(new Toplama());
     System.out.println("Toplam: " + hesapMakinesi.hesapla(sayi1, sayi2));

     hesapMakinesi.setIslem(new Cikarma());
     System.out.println("Fark: " + hesapMakinesi.hesapla(sayi1, sayi2));

     hesapMakinesi.setIslem(new Carpma());
     System.out.println("Çarpım: " + hesapMakinesi.hesapla(sayi1, sayi2));

     hesapMakinesi.setIslem(new Bolme());
     System.out.println("Bölüm: " + hesapMakinesi.hesapla(sayi1, sayi2));
 }
}
