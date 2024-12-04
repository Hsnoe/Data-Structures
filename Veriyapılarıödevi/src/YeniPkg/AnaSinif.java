package YeniPkg;
import java.util.Scanner;
public class AnaSinif {
    int ozellik1;
    boolean ozellik2;
    String ozellik3;

    // Parametresiz yapılandırıcı (Java tarafından otomatik olarak oluşturulur)
    public AnaSinif() {
        // Parametresiz yapılandırıcıda özelliklere ilk değerler atanabilir.
        ozellik1 = 0;
        ozellik2 = false;
        ozellik3 = "";
    }

    // Bir parametreli yapılandırıcı
    public AnaSinif(int deger1) {
        ozellik1 = deger1;
        ozellik2 = false; // İlk değerleri farklı olarak atayabilirsiniz.
        ozellik3 = "";
    }

    // İki parametreli yapılandırıcı
    public AnaSinif(int deger1, boolean deger2) {
        ozellik1 = deger1;
        ozellik2 = deger2;
        ozellik3 = ""; // İlk değerleri farklı olarak atayabilirsiniz.
    }
    
    public static void ekranaYazdir(int deger) {
        System.out.println("Değer: " + deger);
    }

    public void ikinciSinifDegerYazdir(IkinciSinif iks) {
        System.out.println("IkinciSinif Özellikleri:");
        System.out.println("Ozellik1: " + iks.getOzellik1());
        System.out.println("Ozellik2: " + iks.isOzellik2());
        System.out.println("Ozellik3: " + iks.getOzellik3());
    }
    
    public IkinciSinif ikinciSinifaDegerAta(int deger1, boolean deger2, String deger3) {
        IkinciSinif ikinciSinif = new IkinciSinif();
        ikinciSinif.setOzellik1(deger1);
        ikinciSinif.setOzellik2(deger2);
        ikinciSinif.setOzellik3(deger3);
        return ikinciSinif;
    }
    
    public static void ikinciSinifDegerYazdirDizi(IkinciSinif iks) {
        System.out.println("IkinciSinif Özellikleri:");
        System.out.println("Ozellik1: " + iks.getOzellik1());
        System.out.println("Ozellik2: " + iks.isOzellik2());
        System.out.println("Ozellik3: " + iks.getOzellik3());
        System.out.println();
    }

    public static void main(String[] args) {
        AnaSinif nesne1 = new AnaSinif(); // Parametresiz yapılandırıcı
        AnaSinif nesne2 = new AnaSinif(42); // Bir parametreli yapılandırıcı
        AnaSinif nesne3 = new AnaSinif(10, true); // İki parametreli yapılandırıcı
        AnaSinif nesne = new AnaSinif();
        ekranaYazdir(45);
        
        IkinciSinif ikinciSinif = new IkinciSinif();
        ikinciSinif.setOzellik1(42);
        ikinciSinif.setOzellik2(true);
        ikinciSinif.setOzellik3("Merhaba, Java!");

        nesne.ikinciSinifDegerYazdir(ikinciSinif);
        
        IkinciSinif yeniIkinciSinif = nesne.ikinciSinifaDegerAta(42, true, "Merhaba, Java!");
        IkinciSinif[] ikinciSinifDizisi = new IkinciSinif[10];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
            ikinciSinifDizisi[i] = new IkinciSinif(); // Yapılandırıcıyı çağırarak yeni bir IkinciSinif nesnesi oluşturur
        }
        
        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
            System.out.println("Nesne " + (i + 1) + " Özellikleri:");

            System.out.print("Ozellik1 (int): ");
            int ozellik1 = scanner.nextInt();

            System.out.print("Ozellik2 (boolean): ");
            boolean ozellik2 = scanner.nextBoolean();
            
            scanner.nextLine(); // Boş satır okuma
            System.out.print("Ozellik3 (String): ");
            String ozellik3 = scanner.nextLine();

            /*ikinciSinifDizisi[i] = new IkinciSinif();
            ikinciSinifDizisi[i].setOzellik1(ozellik1);
            ikinciSinifDizisi[i].setOzellik2(ozellik2);
            ikinciSinifDizisi[i].setOzellik3(ozellik3);*/
        }
        
        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
            ikinciSinifDegerYazdirDizi(ikinciSinifDizisi[i]);
        }
    }
}
