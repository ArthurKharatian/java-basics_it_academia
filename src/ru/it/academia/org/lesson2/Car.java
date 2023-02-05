package ru.it.academia.org.lesson2;

public class Car {

    private String brand;
    private String model;
    private Integer seatPlace;
    private Long price;
    Double engineCapacity;
    private Boolean isNew;
    protected Color color;
    private int doorsCount;

    public Car() {

    }

    public Car(String brand, String model, Color color, Boolean isNew) {
        this.brand = brand;
        this.model = model;
        this.isNew = isNew;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seatPlace=" + seatPlace +
                ", price=" + price +
                ", engineCapacity=" + engineCapacity +
                ", isNew=" + isNew +
                ", color=" + color +
                ", doorsCount=" + doorsCount +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSeatPlace() {
        return seatPlace;
    }

    public void setSeatPlace(Integer seatPlace) {
        this.seatPlace = seatPlace;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
