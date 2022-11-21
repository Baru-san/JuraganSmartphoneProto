package Classes;

public class DataBarang {
    private String kodeAndroid;
    private String namaAndroid;
    private double hargaAndroid;
    private int jumlahBeli;
    private double bayar;

    public String getKodeAndroid(){
        return kodeAndroid;
    }

    public void setKodeAndroid(String kodeAndroid){
        this.kodeAndroid = kodeAndroid;
    }

    public String getNamaAndroid(){
        return namaAndroid;
    }

    public void setNamaAndroid(String namaAndroid){
        this.namaAndroid = namaAndroid;
    }

    public double getHargaAndroid(){
        return hargaAndroid;
    }

    public void setHargaAndroid(double hargaAndroid){
        this.hargaAndroid = hargaAndroid;
    }

    public int getJumlahBeli(){
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli){
        this.jumlahBeli = jumlahBeli;
    }

    public double getBayar(){
        bayar = hargaAndroid * jumlahBeli;
        return bayar;
    }
}
