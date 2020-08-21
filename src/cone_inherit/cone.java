package cone_inherit;

public class cone extends circle {
    int height;

    public cone() {
    }

    public void setHeight(int height) {
        this.height = height;
    }
    double volume(){
        double volume=computearea()*height/3;
        return volume;
    }
}
