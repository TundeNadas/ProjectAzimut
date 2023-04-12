package stepsDefinition.OOP;

public class Animale {

    //creare atribute
    private String nume;
    private  String rasa;
    private  int picioare;
    private boolean existaCoada;

    //constructor initial
    public Animale(){
        this.nume="Misha";
        this.rasa ="Siameza";
        this.picioare = 4;
        this.existaCoada=true;

    }

  //setter
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }

    public void setExistaCoada(boolean existaCoada) {
        this.existaCoada = existaCoada;
    }

    public void setRasa(String rasa){
        this.rasa = rasa;

    }

    //getter
    public String getRasa(){
        return this.rasa;
    }

    public String getNume() {
        return this.nume;
    }

    public int getPicioare() {
        return this.picioare;
    }

    public boolean getExistaCoada() {
        return this.existaCoada;
    }

}
