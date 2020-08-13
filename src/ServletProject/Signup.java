package ServletProject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Signup {
	
    public String ad, sifre, email;
    public Boolean karsilasmaAd;    
    public String karsilasmaSifre;
    static String karsilasma;
    Kisi kisi;
    AnaEkran anaEkran = new AnaEkran();
    	
	public void kisiOlustur(){
        ad = ServletSignup.name;
        karsilasma = "false";
        if(anaEkran.adKarsilastir(ad) == true){
            karsilasma = "true";
            System.out.println("Bu kullanıcı adı daha önce kullanılmış!");
        }
        else{
        System.out.println("Şifre: ");
        sifre = ServletSignup.password;
        email = ServletSignup.mail;
        kisi = new Kisi(ad, sifre, email, AnaEkran.tid);
        AnaEkran.Kisiler.add(AnaEkran.tid, kisi);
        try {
            FileOutputStream fos = new FileOutputStream("obje" + AnaEkran.tid);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(AnaEkran.Kisiler.get(AnaEkran.tid));
            oos.close();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        AnaEkran.tid++;
        anaEkran.tidYaz(AnaEkran.tid);
        }
    }
}
