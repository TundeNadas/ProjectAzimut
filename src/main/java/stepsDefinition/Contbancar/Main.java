package stepsDefinition.Contbancar;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
      Client client1 = new Client("Maria", "Brasov");
      System.out.println(client1.getNumeClient());
      client1.setNumeClient("Magdalena");
      System.out.println(client1.getNumeClient());

        ContBancar contTunde = new ContBancar("Tunde", "Mures","economii",123, 225.50);

      Date dataFactura = new Date("2023-03-01");

        Factura facturaElecetricitate = new Factura(client1, 23,2023-02-9,115.5);
        contTunde.plataFactura(facturaElecetricitate.getTotalFactura());


    }
}
