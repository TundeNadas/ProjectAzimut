package stepsDefinition.OOP;

public class Car {
    private String Brand;
    private String Model;
    private String Color;
    private int NrWheels;

    //setter
    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setNrWheels(int nrWheels) {
        NrWheels = nrWheels;
    }

    //getter
    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public int getNrWheels() {
        return NrWheels;
    }

    public Car() {
       this.Brand= "BMW";
       this.Model = "X5";
       this.Color = "Black";
       this.NrWheels = 4;
    }


    public Car(String Brand, String Model, String Color, int NrWheels){
        this.Brand= Brand;
        this.Model = Model;
        this.Color = Color;
        this.NrWheels = NrWheels;
    }
}

