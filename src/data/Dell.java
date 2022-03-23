package data;

/**
 *
 * @author Aysia
 */
public class Dell extends Laptop {
    public Dell(String lNama, String lProsesor, int lCore, 
            String lOs, int lRam, String lStorage, int lStok){
        super(lNama,"Dell",lProsesor,lCore,lOs,lRam,lStorage,lStok);
    }
    
    public Dell(){
        super();
        super.setBrandLaptop("Dell");
    }
    
    public void dellSlogan(){
        System.out.println("");
        System.out.println("=======================");
        System.out.println("Dell");
        System.out.println("Dell. Purely You.");
        System.out.println("=======================");
        
    }
    @Override
    public void getAllLaptopData(){
        dellSlogan();
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
        } else {
            super.setRamLaptop(angka);
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
        } else {
            super.setCoreLaptop(angka);
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
        } else {
            super.setStokLaptop(angka);
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
