package stackodev;

import java.util.Scanner;
import java.util.LinkedList;

class StackLinkedList {
    LinkedList<Eleman> yigin = new LinkedList<>();

    public void yiginaEkle(Eleman eleman) {
        yigin.addFirst(eleman);
    }

    public void yigindanSil() {
        if (yigin.isEmpty()) {
            System.out.println("Yığın boş");
        } else {
            Eleman silinenEleman = yigin.removeFirst();
            System.out.println("Yığından silinen kişi: " + silinenEleman);
        }
    }

    public void yiginElemanSayisi() {
        System.out.println("Yığında " + yigin.size() + " adet eleman vardır.");
    }

    public void yigindaAra(String arananIsim) {
        int index = yigin.indexOf(yigin.stream()
                .filter(eleman -> eleman.ad.equalsIgnoreCase(arananIsim))
                .findFirst()
                .orElse(null));

        if (index != -1) {
            System.out.println("Aranan isim yığının " + (index + 1) + ". sırasındadır.");
        } else {
            System.out.println("Yığında aranan " + arananIsim + " bulunamamıştır.");
        }
    }

    public void yiginListele() {
        if (yigin.isEmpty()) {
            System.out.println("Yığın boş");
        } else {
            for (Eleman eleman : yigin) {
                System.out.println(eleman);
            }
        }
    }
}