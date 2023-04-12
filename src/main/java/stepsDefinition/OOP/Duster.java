package stepsDefinition.OOP;

public class Duster extends Masini{
    private String transmisie;

    public Duster(String culoare, String tip, int roti, int locuri, String plafon, Boolean areAsigurare,
                  String cutieViteze, int numarTrepteViteza, int vechime, String transmisie) {
        super("Duster", culoare, tip, roti, locuri, plafon, areAsigurare, cutieViteze, numarTrepteViteza, vechime);
        this.transmisie=transmisie;
    }
}
