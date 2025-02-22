package Exercise2;

public class Airplane implements Flight {
    private String model;
    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public void fly() {
        System.out.print(": I'm an airplane that relies on an engine to fly.");
    }

    @Override
    public String toString() {
        return String.format("Airplane [model=%s, year=%d]", model, yearBuilt);
    }
}
