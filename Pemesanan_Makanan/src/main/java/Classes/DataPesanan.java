package Classes;

public class DataPesanan {

    private String Makanan;
    private String Minuman;
    private int IdPesanan;
    private int TotalHarga;

    public DataPesanan(){

    }

    public String getMakanan() {
        return Makanan;
    }
    
    public void setMakanan(String makanan) {
        Makanan = makanan;
    }

    public String getMinuman() {
        return Minuman;
    }

    public void setMinuman(String minuman) {
        Minuman = minuman;
    }

    public int getIdPesanan() {
        return IdPesanan;
    }
    
    public void setIdPesanan(int idPesanan) {
        IdPesanan = idPesanan;
    }

    public int getTotalHarga() {
        return TotalHarga;
    }
    
    public void setTotalHarga(int totalHarga) {
        TotalHarga = totalHarga;
    }
}
