package stepsDefinition;

public class Lectia21VectoriForWhile {
    public static void main(String [] args) {
        //................ VECTORI INITIALIZARE................

//        //numere intregi
//        int[] numere = new int[3];
//        numere[0] = 20;
//        numere[1] = 21;
//        numere[2] = 22;
//
//        int[] nrDocumente = {453, 456, 77, 65};
//        System.out.println(nrDocumente[3]);
//
//        System.out.println(numere[0]);
//        System.out.println(numere[1]);
//        System.out.println(numere[2]);
//
//
//        //siruri de caractere
////        String[] caractere = new String[2];
////        caractere[0] = "Azimut";
////        caractere[1] = "Vision";
//        String[] caractere = {"Azimut", "Vision"};
//
//        System.out.println(caractere[0]);
//        System.out.println(caractere[1]);
//
//
//        String[] curs = {"Testare", "Manuala", "Automaata"};
//        System.out.println(curs[2]);
//
//        //alte tipuri de date
//        boolean[] oparatoriLogici = {true, false, true};
//        System.out.println(oparatoriLogici[2]);
//
//        double[] numereMari = {234.455, 654,67};
//        System.out.println(numereMari[2]);
//
//
//
//        String sirDeCaractere = "Acesta este un sir de caractere";
//        System.out.println(sirDeCaractere.charAt(3));
//        System.out.println(sirDeCaractere.substring(4));
//        System.out.println(sirDeCaractere.substring(2,8));
//
        String sirDeCaractere = "Acesta este un sir de caractere";
        String[] curs = {"Testare", "Manuala", "Automata"};
        int[] nrDocumente = {453, 456, 77, 65};
//
//        //........WHILE
//        int[] nrDocumente = {453, 456, 77, 65};
//
//        int numar = 3;
//        int i = 0;
//        while (numar !=0){
//            if (nrDocumente[i] != 77){
//                i++;
//                System.out.println(nrDocumente[i]);
//                numar--;
//            }
//            else break;
//        }
//
//
//        String sirDeCaractere
//        int i = 0;
//        while (sirDeCaractere.length()<=31){
//            i++;
//            System.out.println(sirDeCaractere.charAt(i));
//        }
//
//        int i = 0;
//        System.out.println(curs.length);
//        while (curs.length<=2) {
//            i++;
//            System.out.println(curs[i]);
//        }
//
//        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};
//
//        int i=0;
//        int maxim=0;
//        System.out.println(exercitiulUnu.length); //7
//        while (i< exercitiulUnu.length){ // 0<7 ->true
//            if (exercitiulUnu[i]>maxim){ // exercitiulUnu[0]=34 -> true
//                maxim = exercitiulUnu[i];// maxim = 34
//            }
//            i++; //0+1 = 1
//        }
//        System.out.println("Valoarea maxima a sirului este:" + maxim);



//        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};
//        int i=0;
//        int maxim=0;
//        System.out.println(exercitiulUnu.length); //7
//       do{ // 0<7 ->true
//            if (exercitiulUnu[i]>maxim){ // exercitiulUnu[0]=34 -> true
//                maxim = exercitiulUnu[i];// maxim = 34
//            }
//            i++; //0+1 = 1
//        }
//       while (i< exercitiulUnu.length);
//        System.out.println("Valoarea maxima a sirului este:" + maxim);
//
//
//
        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};
        int maxim=0;
        for(int i=0;i<exercitiulUnu.length; i++) {
            if (exercitiulUnu[i]>maxim) {
                maxim = exercitiulUnu[i];
            }
        }
            System.out.println("Valoarea maxima a sirului este:" + maxim);


        int minim =exercitiulUnu[0];
        for(int i=0;i<exercitiulUnu.length; i++) {
            if (exercitiulUnu[i]<minim) {
                minim = exercitiulUnu[i];
            }
        }
        System.out.println("Valoarea minima a sirului este:" + minim);


//        for (int i=0; i<sirDeCaractere.length(); i++) {
//            System.out.println(sirDeCaractere.charAt(i));
//        }







    }
}
