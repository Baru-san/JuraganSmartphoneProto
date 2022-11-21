package Classes;

import java.io.IOException;

import Databases.Database;

public class Registrasi extends Pembeli{
    private final String email;
    private final String password;

    public Registrasi(String email, String password){
        super(email, password);
        this.email = email;
        this.password = password;
    }

    public boolean cekNamaPembeli() throws IOException{
        String[] data;
        Database database = new Database();
        data = database.cekDataUser(this.email, this.password);

        if (this.email.equals(data[0]) && this.password.equals(data[2])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }
        
        return false;
    }

    public boolean cekEmailPembeli(){
        String[] data;
        Database database = new Database();
        data = database.cekEmailUser(this.email);

        if(this.email.equals(data[0])) {
            setNama(data[1]);
            setPassword(data[2]);
            setEmail(data[0]);
            return true;
        }
        
        return false;
    }

    public void registrasiUser() throws IOException{
        Database database = new Database();
        database.tulisDataUser(getNama(), getEmail(), getPassword());
    }
}
