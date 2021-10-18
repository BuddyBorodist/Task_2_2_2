package web.model;

public class Car {

    String model;
    int series;
    String type;

    public Car(String model, int series, String type) {
        this.model = model;
        this.series = series;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", type='" + type + '\'' +
                '}';
    }
}
