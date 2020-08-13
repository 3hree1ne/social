package ServletProject;

import java.io.Serializable;
import java.util.ArrayList;

public class Socialize implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    static int tid = 0;
    static ArrayList<Kisi> Kisiler = new ArrayList<>();
    
    public Socialize() {
        AnaEkran anaEkran;
        anaEkran = new AnaEkran();
        tid = anaEkran.tidOku();
        anaEkran.objeleriOku();
    }
    
}