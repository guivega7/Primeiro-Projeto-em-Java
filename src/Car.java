public class Car {
    private String model;
    private String color;
    private int year;
    private int id;
    private double value;
    private int stock;

    public Car(String model, String color, int year, double value) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.value = value;
    }

    @Override
    public String toString(){
        return "Car: " + model + " Color: " + color + " Year: " + year + " Value: " + value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
