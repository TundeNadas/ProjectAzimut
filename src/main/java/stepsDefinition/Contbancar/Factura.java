package stepsDefinition.Contbancar;

public class Factura {

    private Client client;
    private int numarClient;
    private int dataFactura;
    private double totalFactura;

    public Factura(Client client, int numarClient, int dataFactura, double totalFactura) {
        this.client = client;
        this.numarClient = numarClient;
        this.dataFactura = dataFactura;
        this.totalFactura = totalFactura;
    }

    public Client getClient() {
        return client;
    }

    public int getNumarClient() {
        return numarClient;
    }

    public int getDataFactura() {
        return dataFactura;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    }

