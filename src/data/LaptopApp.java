package data;
import java.util.Scanner;
/**
 *
 * @author Aysia
 */
public class LaptopApp {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);  
        String lNama, lBrand, lProsesor, lOs, lStorage;
        int lStok,lCore, lRam;
        
        System.out.print("Nama : "); lNama = masukan.nextLine();
        System.out.print("Brand : "); lBrand = masukan.nextLine();
        System.out.print("Prosesor : "); lProsesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); lCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); lOs = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); lRam = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); lStorage = masukan.nextLine();
        System.out.print("Stok : "); lStok = masukan.nextInt();
        masukan.close();
        
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        
        Laptop laptop1 = new Laptop(lNama,lBrand,lProsesor,lCore,lOs,lRam,lStorage,lStok);
        laptop1.getAllLaptopData();
    }
}
