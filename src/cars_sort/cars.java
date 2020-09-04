package cars_sort;

public class cars {
    int carno;
    String color;
    int capacity;

    public cars(int carno, String color, int capacity) {
        this.carno = carno;
        this.color = color;
        this.capacity = capacity;
    }

    public void setCarno(int carno) {
        this.carno = carno;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCarno() {
        return carno;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }



}
