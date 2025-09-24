package bison;

import java.time.YearMonth;

public class Bison {
    private String tag;
    private int poidsKg;
    private YearMonth anniversaire;

    public Bison(String tag, int poidsKg){
        this.tag = tag;
        this.poidsKg = poidsKg;
        this.anniversaire = YearMonth.now();
    }

    public Bison(String tag, int poidKg, YearMonth anniversaire){
        this.tag = tag;
        this.poidsKg = poidKg;
        this.anniversaire = anniversaire;
    }

    public String getTag(){
        return tag;
    }
    public int getPoidsKg(){
        return poidsKg;
    }
    public YearMonth getAnniversaire(){
        return anniversaire;
    }
    public boolean estUnBebe(){
        return YearMonth.now().equals(this.anniversaire);
    }




}
