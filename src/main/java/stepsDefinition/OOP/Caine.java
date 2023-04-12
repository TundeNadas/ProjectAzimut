package stepsDefinition.OOP;

public class Caine extends Animale2 {
    private String culoareOchi;
    private String tipBlana;
    private int picioare;
    private boolean areCoada;

    @Override
    public void comunicare() {
        System.out.println(getNume()+ " latra");
    }

    public Caine(String nume, String rasa, int varsta, String culoare, int greutate, int lungime, String culoareOchi, String tipBlana, int picioare, boolean areCoada) {
        super(nume, rasa, varsta, culoare, greutate, lungime);
        this.culoareOchi = culoareOchi;
        this.tipBlana = tipBlana;
        this.picioare = picioare;
        this.areCoada = areCoada;
    }
  }
