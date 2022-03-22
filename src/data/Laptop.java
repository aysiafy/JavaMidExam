package data;

/**
 *
 * @author Aysia
 */
public class Laptop {
    private String lNama, lBrand, lProsesor, lOs, lStorage;
    private int lStok, lCore, lRam;
    
    public Laptop(String lNama, String lBrand, String lProsesor, int lCore, 
            String lOs, int lRam, String lStorage, int lStok){
        
        this.lNama = lNama; // Nama Laptop
        this.lBrand = lBrand; // Merk Laptop
        this.lProsesor = lProsesor; // Prosessor pada Laptop
        this.lCore = lCore; // Jumlah Core pada Laptop
        this.lOs = lOs; // OS laptop
        this.lRam = lRam; // Jumlah Ram(GB) Laptop
        this.lStorage = lStorage; // Jenis Storage Laptop
        this.lStok = lStok; // Stok Laptop
        
    }
    
    
//    Overloading Constructor
    public Laptop(){
        this.lNama = "unidentified"; // Nama Laptop
        this.lBrand = "unidentified"; // Merk Laptop
        this.lProsesor = "unidentified"; // Prosessor pada Laptop
        this.lCore = 0; // Jumlah Core pada Laptop
        this.lOs = "unidentified"; // OS laptop
        this.lRam = 0; // Jumlah Ram(GB) Laptop
        this.lStorage = "unidentified"; // Jenis Storage Laptop
        this.lStok = 0; // Stok Laptop Tersedia
    }
    
//    Nama Laptop
    public String getNamaLaptop(){
        return lNama;
    }
    
    public void setNamaLaptop(String text){
        lNama = text;
    }
    
//    Brand Laptop
    public String getBrandLaptop(){
        return lBrand;
    }
    
    public void setBrandLaptop(String text){
        lBrand = text;
    }
    
//    Nama Prosesor
    public String getProsesorLaptop(){
        return lProsesor;
    }
    
    public void setProsesorLaptop(String text){
        lProsesor = text;
    }
    
//      Jumlah Core  
    public int getCoreLaptop(){
        return lCore;
    }
    
    public void setCoreLaptop(int angka){
        lCore = angka;
    }
    
//    OS
    public String getOsLaptop(){
        return lOs;
    }
    
    public void setOsLaptop(String text){
        lOs = text;
    }
    
//    Jumlah Ram
    public int getRamLaptop(){
        return lRam;
    }
    
    public void setRamLaptop(int angka){
        lRam = angka;
    }
    
//    Storage
    public String getStorageLaptop(){
        return lStorage;
    }
    
    public void setStorageLaptop(String text){
        lStorage = text;
    }
    
//    Stok
    public int getStokLaptop(){
        return lStok;
    }
    
    public void setStokLaptop(int angka){
        lStok = angka;
    }
    
    public void getAllLaptopData(){
        System.out.println("Nama : "+ lNama);
        System.out.println("Brand : "+ lBrand);
        System.out.println("Prosesor : "+ lProsesor);
        System.out.println("Jumlah Core : "+ lCore);
        System.out.println("Operating System : "+ lOs);
        System.out.println("Ukuran RAM(GB) : "+ lRam);
        System.out.println("Jenis Storage : "+ lStorage);
        System.out.println("Stok Tersedia : "+ lStok);
    }
}
