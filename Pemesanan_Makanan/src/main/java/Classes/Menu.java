import java.util.StringTokenizer;

public class Menu {
    private String nama;
    private String harga;
    private String rating;
    private String jenis;

    public Menu(){

    }

    public Menu(String datatemp){
        try {
            String Data[] = new String[10];
            int i = 0;
            StringTokenizer sToken = new StringTokenizer(datatemp, ",");

            while (sToken.hasMoreTokens()) {
                Data[i++] = sToken.nextToken();
            }
            this.nama = Data[0];
            this.harga = Data[1];
            this.rating = Data[2];
            this.jenis = Data[3];

        } catch (Exception e) {
        }
    }

    public String getNama() {
        return this.nama;
    }

    public String getHarga() {
        return this.harga;
    }

    public String getRating() {
        return this.rating;
    }

    public String getJenis() {
        return this.jenis;
    }
}
