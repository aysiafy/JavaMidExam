package application;
import data.*;
import java.util.Scanner;
/**
 *
 * @author Aysia
 */
public class Application {
    public static void main(String[] args) {
        String lNama, lProsesor, lOs, lStorage;
        int lStok,lCore, lRam;
        
//        Scanner
        Scanner masukan = new Scanner(System.in);
        
        Axioo mybook14 = new Axioo();
        Dell inspiron = new Dell();
        
        
        
        
//        mybook14.getAllLaptopData();
        mybook14.axiooSlogan();
//        Untuk test Axioo mybook14
        System.out.print("Nama : "); lNama = masukan.nextLine();
        System.out.print("Prosesor : "); lProsesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); lCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); lOs = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); lRam = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); lStorage = masukan.nextLine();
        System.out.print("Stok : "); lStok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        mybook14.setNamaLaptop(lNama);
        mybook14.setProsesorLaptop(lProsesor);
        mybook14.setCoreLaptop(lCore);
        mybook14.setOsLaptop(lOs);
        mybook14.setRamLaptop(lRam);
        mybook14.setStorageLaptop(lStorage);
        mybook14.setStokLaptop(lStok);
        mybook14.getAllLaptopData();
        System.out.println("Store Position " + mybook14.getNamaLaptop() + 
                " adalah " + mybook14.getStorePositionLaptop());
        System.out.println("==========================================");
                

//        inspiron.getAllLaptopData();
        inspiron.dellSlogan();
        
//        Untuk test Dell inspiron
        System.out.print("Nama : "); lNama = masukan.nextLine();
        System.out.print("Prosesor : "); lProsesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); lCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); lOs = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); lRam = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); lStorage = masukan.nextLine();
        System.out.print("Stok : "); lStok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        inspiron.setNamaLaptop(lNama);
        inspiron.setProsesorLaptop(lProsesor);
        inspiron.setCoreLaptop(lCore);
        inspiron.setOsLaptop(lOs);
        inspiron.setRamLaptop(lRam);
        inspiron.setStorageLaptop(lStorage);
        inspiron.setStokLaptop(lStok);
        inspiron.getAllLaptopData();
        System.out.println("Store Position " + inspiron.getNamaLaptop() + 
                " adalah " + inspiron.getStorePositionLaptop());
        System.out.println("==========================================");       
        
    }
}
