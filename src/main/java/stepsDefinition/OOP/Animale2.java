package stepsDefinition.OOP;

public class Animale2 {

    private String nume;
    private String rasa;
    private int varsta;
    private String culoare;
    private int greutate;
    private int lungime;

    public String getNume() {
        return nume;
    }

    public String getRasa() {
        return rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getGreutate() {
        return greutate;
    }

    public int getLungime() {
        return lungime;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public Animale2(String nume, String rasa, int varsta, String culoare, int greutate, int lungime) {
        this.nume = nume;
        this.rasa = rasa;
        this.varsta = varsta;
        this.culoare = culoare;
        this.greutate = greutate;
        this.lungime = lungime;
    }
    public void mananca(){
        System.out.println(getNume()+" mananca");
    }
    public void alearga(int viteza){
        System.out.println(getNume()+" alearga"+ viteza + "km/ora");
    }
    public void comunicare(){
        System.out.println(getNume()+ " comunica");
    }
}
