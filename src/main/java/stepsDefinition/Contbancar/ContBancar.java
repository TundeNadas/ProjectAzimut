package stepsDefinition.Contbancar;

public class ContBancar extends Client {

    private String numeContBancarAlias;
    private int numarContBancar;
    private double valoareCont;

    public ContBancar(String numeClient, String adresaClient, String numeContBancarAlias, int numarContBancar, double valoareCont) {
        super(numeClient, adresaClient);
        this.numeContBancarAlias = numeContBancarAlias;
        this.numarContBancar = numarContBancar;
        this.valoareCont = valoareCont;
    }

    public String getNumeContBancarAlias() {
        return numeContBancarAlias;
    }

    public int getNumarContBancar() {
        return numarContBancar;
    }

    public void setValoareCont(double valoareCont) {
        this.valoareCont = valoareCont;
    }

    public double getValoareCont() {
        return valoareCont;
    }

    public void alimentareContBancar(double sumaDebani) {
        if (sumaDebani > 0) {
            valoareCont = valoareCont + sumaDebani;
            System.out.println("Contul a fost alimentat cu " + sumaDebani);
        } else System.out.println("Contul nu a putut fi alimentat");
    }

    public void retragereSuma(double sumaDeBani) {
        if (sumaDeBani > 0) {
            if (valoareCont - sumaDeBani > 0) {
                valoareCont = valoareCont - sumaDeBani;
                System.out.println("Contului i-au fost retrasi " + sumaDeBani + " lei, astfel contul are valoarea " + valoareCont);
            } else System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
        } else System.out.println("Suma introdusa nu este corecta");
    }

    public void exchangeInEuro(String moneda) {
        switch (moneda) {
            case "EURO" -> {
                setValoareCont(getValoareCont() / 5);
                System.out.println("Valoarea contului in EURO este: " + getValoareCont());
            }
            case "LIRA" -> {
                setValoareCont(getValoareCont() / 5.6);
                System.out.println("Valoarea contului in LIRA este: " + getValoareCont());
            }
            default -> System.out.println("Valoarea contului in RON este: " + getValoareCont());
        }

    }

    public void plataFactura(double sumaDeBani) {
        if (sumaDeBani > 0) {
            if (valoareCont - sumaDeBani > 0) {
                valoareCont = valoareCont - sumaDeBani;
                System.out.println("Factura de " + sumaDeBani + " lei a fost platita! Contul are valoarea " + valoareCont);
            } else System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
        } else System.out.println("Deja factura a fost platita");
    }
}
