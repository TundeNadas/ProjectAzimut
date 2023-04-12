package stepsDefinition;

public class Practice {


    public static void tiparire(String parametru){
        System.out.println(parametru);
    }

    public static void main(String[] args) {
        String[] primavara = {"Astazi incepe primavara!", "Astazi este 1 martie", "Astazi este miercuri"};

        for (String i: primavara){
            tiparire(i);
        }
    }

        }

