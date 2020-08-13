package ServletProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class AnaEkran implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    static int tid = 0;
    static ArrayList<Kisi> Kisiler = new ArrayList<>();
    static String karsilasma, karsilasmaSifre;
    
    Scanner scan = new Scanner(System.in);
    int secenek;
    public String ad, sifre, email;
    public Boolean karsilasmaAd;    
    Kisi kisi;
   
    public AnaEkran() {
    	tid = tidOku();
        objeleriOku();
    }
   
    //login screen
    /*
    public void girisEkrani(){
        ad = ServletSignup.name;
            if(adKarsilastir(ad) == false){
                karsilasmaAd = false;
                System.out.println("Bu kullanıcı adı bulunmuyor!");
            }
            else{
                System.out.println("Şifre: ");
                sifre = ServletSignup.password;
                    if(sifreKarsilastir(ad, sifre) == false){                
                        karsilasmaSifre = "false";
                        System.out.println("Kullanıcı adı ve şifre uyuşmuyor!");
                    }
                    else{
                        karsilasma = "true";
                        System.out.print("Giris Basarili!\n");
                        dosyadanOku(ad);
                        dosyayaYaz(ad);
                    }
            }
    }

 */
    
    
    //signup screen
 
    
    public void objeleriOku(){
       /*
        int i = 0;
        try {
                FileInputStream fos = new FileInputStream("obje");
                while(){
                    ObjectInputStream oos = new ObjectInputStream(fos);
                    NotDefteri.Kisiler.add(i, (Kisi)oos.readObject());
                    oos.close();
                    i++;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
         */
        int i = 0;
        try {
            while(i < tid){
                FileInputStream fos = new FileInputStream("obje" + i);
                ObjectInputStream oos = new ObjectInputStream(fos);
                Kisiler.add(i, (Kisi)oos.readObject());
                oos.close();
                i++;
            }
        } catch (Exception ex) {
        	System.out.println("Error: objeleriOku");
            ex.printStackTrace();
        }
    }
    
    

    boolean adKarsilastir(String name){
        boolean test = false;
        for(int i = 0; i < tid; i++){
            if(name.equals(Kisiler.get(i).getAd()) == true){
                test = true;
                break;
            }
        }
        return test;
    }
    
    boolean mailKarsilastir(String name){
        boolean test = false;
        for(int i = 0; i < tid; i++){
            if(name.equals(Kisiler.get(i).getEmail()) == true){
                test = true;
                break;
            }
        }
        return test;
    }

    boolean sifreKarsilastir(String name, String passwd){
        boolean test = false;
        for(int i = 0; i < tid; i++){
            if((name.equals(Kisiler.get(i).getAd()) == true) && (passwd.equals(Kisiler.get(i).getSifre()) == true)){
                test = true;
                break;
            }
        }
        return test;
    }
    
    boolean sifreMailKarsilastir(String name, String passwd){
        boolean test = false;
        for(int i = 0; i < tid; i++){
            if((name.equals(Kisiler.get(i).getEmail()) == true) && (passwd.equals(Kisiler.get(i).getSifre()) == true)){
                test = true;
                break;
            }
        }
        return test;
    }

    public void dosyadanOku(String name){
        int i;
        String buffer;
        i = tidBul(name);
        File f = Kisiler.get(i).fkisi;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(new FileReader(f));
            while((buffer = br.readLine()) != null){
                System.out.println(buffer);
            }
            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dosyayaYaz(String name){
        int i = 0;
        String buffer;
        i = tidBul(name);
        File f = Kisiler.get(i).fkisi;
        try {
            FileWriter fw = new FileWriter(f, true);
            buffer = scan.next();
            if(buffer.equals("cikis") == true){
                System.exit(0);
            }
            else{
                fw.write(buffer + "\n");
            fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int tidBul(String name){
        int test = 0;
        for(int i = 0; i <= tid; i++){
            if((name.equals(Kisiler.get(i).getAd())) == true){
                test = i;
                break;
            }
        }

    return test;
    }
    
    public void tidYaz(int no){
        try {
            FileWriter fw = new FileWriter("tid");
            fw.write(no);
            fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public int tidOku(){
            int no = 0;
            try {
            FileReader fr = new FileReader("tid");
            no = fr.read();
            fr.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return no;
    }
}
