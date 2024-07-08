public class Thermostat 
{
    private int minTemp;
    private int maxTemp;
    private int currentTemp;

    public Thermostat(int minTemp, int maxTemp) 
    {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public void setTemp(int temp) throws TemperatureOutOfRange 
    {
        if (temp < minTemp) 
        {
            throw new TemperatureTooLow("Temperature is too low");
        } 
        else if (temp > maxTemp) 
        {
            throw new TemperatureTooHigh("Temperature is too high");
        } 
        else 
        {
            currentTemp = temp;
        }
    }

    public int getCurrentTemp() { return currentTemp; }
}
