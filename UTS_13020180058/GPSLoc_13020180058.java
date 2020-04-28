public class GPSLoc_13020180058 {
    int Lat, Long;
    String Nama, Deskripsi;
    public GPSLoc_13020180058(){
        this.Lat = 0;
        this.Long = 0;
        this.Nama = "Apriani Magfira";
        this.Deskripsi = "ini deskripsi";
    }
    public void GPSLoc_13020180058(int Lat, int Long, String Nama, String Deskripsi){
        this.Lat = Lat;
        this.Long = Long;
        this.Nama = Nama;
        this.Deskripsi = Deskripsi;
    }
    public void moveTo(GPSLoc_13020180058 G, int dLat, int dLong){
        this.Lat += dLat;
        this.Long += dLong;
    }

}
class main{
    public static void main(String[] args)
    {
        GPSLoc_13020180058 TitikGPS = new GPSLoc_13020180058();
        System.out.println("Lat Awal : " + TitikGPS.Lat);
        System.out.println("Long Awal : " + TitikGPS.Long);
        System.out.println("Nama Awal : " + TitikGPS.Nama);
        System.out.println("Deskripsi Awal : " + TitikGPS.Deskripsi);
        System.out.println("-----------------------------");
        TitikGPS.GPSLoc_13020180058(10, 10, "Nama Baru", "Deskripsi Baru");
        System.out.println("Lat Setelah Konstruktor Kedua : " + TitikGPS.Lat);
        System.out.println("Long Setelah Konstruktor Kedua  : " + TitikGPS.Long);
        System.out.println("Nama Setelah Konstruktor Kedua  : " + TitikGPS.Nama);
        System.out.println("Deskripsi Setelah Konstruktor Kedua  : " + TitikGPS.Deskripsi); 
        System.out.println("-----------------------------");
        TitikGPS.moveTo(TitikGPS, 100, 100);
        System.out.println("Lat Setelah Move To : " + TitikGPS.Lat);
        System.out.println("Long Setelah Move To : " + TitikGPS.Long);
        System.out.println("Nama Setelah Move To : " + TitikGPS.Nama);
        System.out.println("Deskripsi Setelah Move To : " + TitikGPS.Deskripsi);
        
        
    }
}
 
