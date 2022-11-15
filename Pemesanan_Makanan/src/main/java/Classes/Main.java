package Classes;

import Databases.Database;

public class Main {
    public static void main(String[] args) {
        Database PCT = new Database();
        Menu[] namamenu = new Menu[20];
    
        
        namamenu = PCT.buatObjekMenu();
        
        for(int i=0;i<3;i++){
            System.out.println(namamenu[i].getNama());
            System.out.println(namamenu[i].getHarga());
            System.out.println(namamenu[i].getRating());
            //System.out.println(namamenu[i].getJenis());
        }
    }
    
}
