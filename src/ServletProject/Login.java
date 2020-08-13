package ServletProject;

public class Login {
	
    public String ad, sifre, email;
    public Boolean karsilasmaAd;   
    static String karsilasma, karsilasmaSifre;
    
    AnaEkran anaEkran = new AnaEkran();
	
	public void girisEkrani(){
        email = ServletLogin.mail;
        karsilasma = "false";
            if(anaEkran.mailKarsilastir(email) == false){
                karsilasmaAd = false;
                System.out.println("Bu email adı bulunmuyor!");
            }
            else{
                System.out.println("Şifre: ");
                sifre = ServletLogin.password;
                    if(anaEkran.sifreMailKarsilastir(email, sifre) == false){                
                        karsilasmaSifre = "false";
                        System.out.println("Kullanıcı adı ve şifre uyuşmuyor!");
                    }
                    else{
                        karsilasma = "true";
                        System.out.print("Giris Basarili!\n");
                        /*
                        anaEkran.dosyadanOku(ad);
                        anaEkran.dosyayaYaz(ad);
                        */
                    }
            }
    }
}