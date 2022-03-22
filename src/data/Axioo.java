
package data;

/**
 *
 * @author Aysia
 */
public class Axioo extends Laptop {
    public Axioo(String lNama, String lProsesor, int lCore, 
            String lOs, int lRam, String lStorage, int lStok){
            
            super(lNama,"Axioo",lProsesor,lCore,lOs,lRam,lStorage,lStok);
            
    }
    
    public Axioo(){
        super();
        super.setBrandLaptop("Axioo");
    }
    
    public void axiooSlogan(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Axioo");
        System.out.println("Style Meets Performance");
        System.out.println("=======================");
        
    }
    
    @Override
    public void getAllLaptopData(){
        axiooSlogan();
        super.getAllLaptopData();
        System.out.println("");
    }
    
    @Override
    public void setRamLaptop(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Ukuran RAM tidak dapat lebih kecil dari nol!");
            System.out.println("Ukuran RAM diatur ke default (4 GB)");
            System.out.println("");
            super.setRamLaptop(4);
        }
    }
    
    @Override
    public void setCoreLaptop(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Core tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Core diatur ke default (Dual-Core)");
            System.out.println("");
            super.setCoreLaptop(2);
        }
    }
    
    @Override
    public void setStokLaptop(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Stok Laptop tidak dapat lebih kecil dari nol!");
            System.out.println("Jumlah Stok diatur ke default (0 pcs)");
            System.out.println("");
            super.setStokLaptop(0);
        }
    }
    
//    Posisi Pada Etalase Toko
    public String getStorePositionLaptop(){
        String storage = super.getStorageLaptop().toLowerCase().replaceAll("\\s+","");
        switch(storage) {
            case "ssdm.2" -> {
                return "Best";
            }
            case "ssdsata" -> {
                return "Good";
            }
            case "hdd" -> {
                return "Middle";
            }
            default -> {
                    return "unidentified";
            }
        }
    }
}
