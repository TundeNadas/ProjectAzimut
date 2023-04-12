package stepsDefinition.OOP;

public class ContBancar {
    private int numarCont;
    private int balanta;
    private String numeClient;
    private String email;
    private int numarDeTelefon;

    public void setNumarcont(int numarcont) {
        this.numarCont = numarcont;
    }

    public void setBalanta(int balanta) {
        this.balanta = balanta;
    }

    public void setNumeClient(String numeClient) {
        numeClient = numeClient;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumardetelefon(int numardetelefon) {
        this.numarDeTelefon = numardetelefon;
    }

    public int getNumarcont() {
        return numarCont;
    }

    public int getBalanta() {
        return balanta;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getEmail() {
        return email;
    }

    public int getNumardetelefon() {
        return numarDeTelefon;
    }
    public void depozitnumerar(int valoare) {
        balanta = balanta + valoare;
    }

    public void retragereNumerar(int valoare) {
        if(balanta-valoare < 0) {
            System.out.println("Fonduri insuficiente!");
        }else {
            balanta = balanta-valoare;
        }
    }
}
