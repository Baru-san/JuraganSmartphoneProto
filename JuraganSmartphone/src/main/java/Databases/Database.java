package Databases;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.StringTokenizer;

import Classes.Pembeli;
import Classes.Smartphone;

public class Database {
    private static String[] data;
    static StringTokenizer stringtoken;
    private final String fileRegistrasi;
    private final String fileSmartphone;
    private final String fileRecordPembelian;

    public Database(){
        this.fileRecordPembelian = "src/main/java/database/RecordPembelian.txt";
        this.fileSmartphone = "src/main/java/database/Data_Andro.txt";
        this.fileRegistrasi = "src/main/java/database/registrasi.txt";
    }

    public String[] cekDataUser(String email, String password) throws IOException{
        try(FileReader fileinput = new FileReader(fileRegistrasi);
            BufferedReader bufferedReader = new BufferedReader(fileinput);) {
                String Data;
                bufferedReader.mark(500);
                bufferedReader.reset();

                while(!(Data = bufferedReader.readLine()).isEmpty()){
                    int i = 0;
                    stringtoken = new StringTokenizer(Data, ",");
                    while (stringtoken.hasMoreTokens()){
                        data[i] = stringtoken.nextToken();
                        i++;
                    }

                    if (email.equals(data[0]) && password.equals(data[2])) {
                        return data;
                    }                
                }
            } catch (Exception e){
                return data;
            }
            return data;
    }

    public String[] cekEmailUser(String email){
        try(FileReader fileinput = new FileReader(fileRegistrasi);
            BufferedReader bufferedReader = new BufferedReader(fileinput);) {
                String Data;
                bufferedReader.mark(500);
                bufferedReader.reset();

                while(!(Data = bufferedReader.readLine()).isEmpty()){
                    int i = 0;
                    stringtoken = new StringTokenizer(Data, ",");
                    while (stringtoken.hasMoreTokens()){
                        data[i] = stringtoken.nextToken();
                        i++;
                    }

                    if (email.equals(data[0])) {
                        return data;
                    }
                }
            } catch(Exception e){
                return data;
            }
            return data;
    }

    private String[] DataSmartphone(){

        try(FileReader fileinput = new FileReader(fileSmartphone);
        BufferedReader smartphone = new BufferedReader(fileinput);) {
            smartphone.mark(500);
            smartphone.reset();
            String Data = smartphone.readLine();
            int i = 0;
            while(Data != null){
                data[i] = Data;
                Data = smartphone.readLine();
                i++;
            }
        } catch(Exception e){
        }
        return data;
    }

    public Smartphone[] buatObjekSmartphone(){
        data = DataSmartphone();

        Smartphone[] smartphone = new Smartphone[1000];
        try{
            for(int i = 0; i < 165; i++ ){
                smartphone[i] = new Smartphone(data[i]);
            }
        }catch(IndexOutOfBoundsException exception){
        }
        return smartphone;
    }

    public void tulisDataUser(String nama, String email, String password) throws IOException{
        FileWriter fileOutput = new FileWriter(fileRegistrasi, true);
        try(BufferedWriter bufferOutput = new BufferedWriter(fileOutput);){
            bufferOutput.newLine();
            bufferOutput.write(email + "," + nama + "," + password);
        } catch (Exception e){
        }
    }

    public void recordPembelian(Pembeli pembeli, String kode, String time) throws IOException{
        FileWriter fileOutput = new FileWriter(this.fileRecordPembelian, true);
        try(BufferedWriter bufferOutput = new BufferedWriter(fileOutput);){
            bufferOutput.newLine();
            bufferOutput.write(pembeli.getEmail() + "," + kode + "," + time);
        } catch (Exception e){
        }
    }
}
