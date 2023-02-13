package web.model;

public class Car {
    private String model;
    private String series;
    private int powerOfEngine;

    public Car(String model, String series, int powerOfEngine) {
        this.model = model;
        this.series = series;
        this.powerOfEngine = powerOfEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", powerOfEngine=" + powerOfEngine +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }
}
