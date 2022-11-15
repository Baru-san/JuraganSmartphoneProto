import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class DataMenu  {
public static String[] data = new String[3];

static String filepath = "D:\\AlGoritma\\menu.txt";

public DataMenu(){
}

private String[] DataMenu() {

    try (FileReader fileReader = new FileReader(filepath); BufferedReader menu = new BufferedReader(fileReader);) {
        menu.mark(500);
        menu.reset();
        String Data = menu.readLine();
        int i = 0;
        while (i<5) {
            data[i] = Data;
            Data = menu.readLine();
            i++;
        }
    } catch (Exception e) {
    }
    return data;
}

public Menu[] buatObjekMenu() {
    data = DataMenu();

    Menu[] menu = new Menu[20];
    try {
        for (int i = 0; i < 10; i++) {
            menu[i] = new Menu(data[i]);
            // System.out.println(buku[i].getNama());
            // System.out.println(buku[i].getHarga());
            // System.out.println(buku[i].getRating());
        }
    } catch (IndexOutOfBoundsException exception) {
    }
    return menu;
}

public static void main(String[] args) {
    DataMenu PCT = new DataMenu();
    Menu[] namamenu = new Menu[20];

    PCT.DataMenu();
    namamenu = PCT.buatObjekMenu();
    
    for(int i=0;i<3;i++){
        System.out.println(namamenu[i].getNama());
        System.out.println(namamenu[i].getHarga());
        System.out.println(namamenu[i].getRating());
        System.out.println(namamenu[i].getJenis());
    }
}
}
