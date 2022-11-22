package Classes;

import java.util.StringTokenizer;

public class Smartphone {
    private String kode;
    private String nama;
    private String merek;
    private String harga;
    private String rating;
    private String gambar;

    public Smartphone(){
        
    }
    
    public Smartphone(String data){
        try {
            String Data[] = new String[10];
            int i =0;
            StringTokenizer sToken = new StringTokenizer(data, ",");

            while (sToken.hasMoreTokens()){
                Data[i++] = sToken.nextToken();
            }

            this.kode = Data[0];
            this.nama = Data[1];
            this.merek = Data[2];
            this.harga = Data[3];
            this.rating = Data[4];
            //this.gambar = Data[5];
        } catch(Exception e){
        }
    }

    public String getNama(){
        return this.nama;
    }

    public String getKode(){
        return this.kode;
    }

    public String getMerek(){
        return this.merek;
    }

    public double getHarga(){
        return Double.parseDouble(this.harga);
    }   

    public double getRating(){
        return Double.parseDouble(this.rating);
    }

    public String getGambar(){
        return this.gambar;
    }
}
