package stepsDefinition;

public class conditional {

    public static void main(String[] args) {
        int x = 10;
        int z;
        switch (x) {
            case 1 -> {
                z = 1;
                System.out.println(z);

            }
            case 2 -> {
                z = 2;
                System.out.println(z);
            }
            case 3 -> {
                z = 3;
                System.out.println(z);
            }
            default -> {
                z = 4;
                System.out.println(z);
            }
        }


        String ziua = "Marti";
        int a = 10;
        int b = 20;

        switch (ziua) {
            case "Luni" -> {
                System.out.println("se bea cafea");
            }
            case "Marti" -> {
                System.out.println("Aveti de plata: "+ (a+b));
            }
            case "Miercuri" -> {
                System.out.println("este lectie Azimut ");
            }
            case "Joi" -> {
                System.out.println("este inainte de week-end");
            }
            default -> {
                System.out.println("distractie");
            }


        }
    }
}