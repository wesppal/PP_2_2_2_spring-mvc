package web.model;

public class Car {
    private long id;
    private String carBrand;
    private String model;

    public Car(long id, String carBrand, String model) {
        this.id = id;
        this.carBrand = carBrand;
        this.model = model;
    }

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
