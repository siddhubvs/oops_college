package extra0409_Vehicle;

public interface vehicle {
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlaramOn()
    {
        return "Turning the vehicle alarm on.";
    }
    default String turnAlarmOff()
    {
        return "Turning the vehicle alarm off.";
    }
}
class car implements vehicle
{
    String brand;
    car(String brand)
    {
        brand="Ferrari";
    }
    @Override
    public String getBrand()
    {
        return "Ferrari";
    }
    @Override
    public String speedUp()
    {
        return "The car is speeding up.";
    }
    @Override
    public String slowDown()
    {
        return "The car is slowing down.";
    }
}


