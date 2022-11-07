package web.model;

public class Car {

    private int id;
    private String manufacturer;
    private String model;

    public Car(int id, String manufacturer, String model) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.getClass() != o.getClass() || o.getClass() == null) return false;
        Car car = (Car) o;
        return this.manufacturer.equals(car.manufacturer) && this.model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int seed = 31;
        int result = 1;
        result = seed * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = seed * result + (model == null ? 0 : model.hashCode());
        return result;
    }

   /* @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }*/
}
