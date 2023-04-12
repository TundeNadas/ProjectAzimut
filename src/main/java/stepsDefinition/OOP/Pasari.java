package stepsDefinition.OOP;

import java.sql.SQLOutput;

public class Pasari extends Animale2 {
    private int aripi;
    private String cioc;
    private String pene;
    private boolean vedereNocturna;
    private boolean zburatoare;


    public Pasari(String nume, String rasa, int varsta, String culoare, int greutate, int lungime, int aripi, String cioc, String pene, boolean vedereNocturna, boolean zburatoare) {
        super(nume, rasa, varsta, culoare, greutate, lungime);
        this.aripi = aripi;
        this.cioc = cioc;
        this.pene = pene;
        this.vedereNocturna = vedereNocturna;
        this.zburatoare = zburatoare;
    }

    public int getAripi() {
        return aripi;
    }

    public String getCioc() {
        return cioc;
    }

    public String getPene() {
        return pene;
    }

    public boolean isVedereNocturna() {
        return vedereNocturna;
    }

    public boolean isZburatoare() {
        return zburatoare;
    }

    public void setAripi(int aripi) {
        this.aripi = aripi;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public void setPene(String pene) {
        this.pene = pene;
    }

    public void setVedereNocturna(boolean vedereNocturna) {
        this.vedereNocturna = vedereNocturna;
    }

    public void setZburatoare(boolean zburatoare) {
        this.zburatoare = zburatoare;
    }

    public void tipDePasare(){
        if(vedereNocturna == true) {
            System.out.println(getNume()+ " este pasare de noapte");
        }
        else System.out.println(getNume()+ " este pasare de zi");
    }

    @Override
    public void comunicare() {
        System.out.println(getNume()+ " face buhuhu!");
        super.comunicare();
    }
}
