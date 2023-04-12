package stepsDefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tema17si18si19si20 {

    public static void main(String[] arg) {
       //Exercitiu 1
        String raspuns1 = "sa previna defectele";
        String raspuns2 = "sa reduca cantitatea de defecte din productie";
        String raspuns3 = "sa asigure ca defectele din productie nu afecteaza financiar compania(profitabilitatea)";
        String raspuns4 = "sa creasca calitatea produsului software";
        String raspuns5 = "sa se asigure ca cerintele sunt implementate complet si corect";
        String raspuns6 = "sa valideze ca produsul se comporta in concordanta cu scopul acestuia";
        String raspuns7 = "sa mentina reputatia companiei";
        String totalraspunsuri = raspuns1 + raspuns2 + raspuns3 + raspuns4 + raspuns5 + raspuns6 + raspuns7;

        //b.
        if (totalraspunsuri.contains("defectele") && totalraspunsuri.contains("sa") && totalraspunsuri.contains("asigure")) {
            System.out.println("Textul contine cuvintele: 'defectele', 'sa', 'asigure'.");
        }
        //c.
        System.out.print("Numarul de caractere din frazele 1,3,5,7: ");
        System.out.println(raspuns1.length() + raspuns3.length() + raspuns5.length() + raspuns7.length());

        //d.
        double x =(raspuns2.length() + raspuns4.length()) * 100 / totalraspunsuri.length();
        System.out.println(x + " %");

        triunghi();
    }

    //Exercitiu 2
    public static void triunghi() {

        Scanner in = new Scanner(System.in);


        System.out.println("Introduceti marimea1 ");
        double a = in.nextDouble();

        System.out.println("Introduceti marimea2 ");
        double b = in.nextDouble();

        System.out.println("Introduceti marimea3 ");
        double c = in.nextDouble();

        if (a == b && b == c && c == a) {
            System.out.println("Triunghiul este echilateral");
        } else if (a != b && b != c && c != a) {

            List<Double> marimi =new ArrayList<Double>();
            marimi.add(a);
            marimi.add(b);
            marimi.add(c);

            Collections.sort(marimi);

            double cateta1 = marimi.get(0);
            double cateta2 = marimi.get(1);
            double ipotenuza = marimi.get(2);

            //ex 34, 30, 16
            if(Math.pow(cateta1, 2)+Math.pow(cateta2, 2) == Math.pow(ipotenuza, 2)){
                System.out.println("Triunghiul este dreptunghic");
            }
        } else if (a == b || b == c || c == a) {
            System.out.println("Triunghiul este isoscel");

        }
        else {
            System.out.println("Triunghiul este necunoscut");
        }
    }
    // Exercitiu 3

    public static void adjectiv(){
        String adjectiv = "frumoasa";
        switch(adjectiv){
            case "preventiva" -> {
                System.out.println("sa previna defectele");
            }
            case "impecabil" -> {
                System.out.println("să reducă cantitatea de defecte din producție");
            }
            case "profitabil" -> {
                System.out.println("să asigure că defectele din producție nu afectează financiar compania");
            }
            case "calitativa" -> {
                System.out.println("să crească calitatea produsului software");
            }
            case "fiabil" -> {
                System.out.println("să se asigure ca cerințele sunt implementate complet și corect");
            }
            case "valid" -> {
                System.out.println("să valideze că produsul se comportă în concordanță cu scopul acestuia");
            }
            case "incredintat" -> {
                System.out.println("să mențină reputația companiei");
            }
            default -> {
                System.out.println("Testarea este necesara");
            }


        }
    }



}
