package Classes;

import java.util.HashMap;

public class Pembeli {
    private String email;
    private String nama;
    private String password;
    private HashMap<String, Smartphone> smartphone;

    public Pembeli(){
        this.nama = "guest";
    }

    public Pembeli(String email, String password){
        this.nama = "";
        this.email = email;
        this.password = password;
        this.smartphone = new HashMap<>();
    }   
    
    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public int getJumlahSmartphone(){
        return this.smartphone.size();
    }

    public java.util.Set<String> getKeySmartphone(){
        return this.smartphone.keySet();
    }

    public Smartphone getSmartphone(String kode){
        return this.smartphone.get(kode);
    }

    public void addSmartphone(String kode, Smartphone smartphone){
        this.smartphone.put(kode, smartphone);
    }

    public void removeSmartphone(String kode){
        this.smartphone.remove(kode);
    }
}
