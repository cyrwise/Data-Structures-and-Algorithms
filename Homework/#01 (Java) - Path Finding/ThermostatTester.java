public class ThermostatTester {
    public static void main(String[] args) {
        try {
            Thermostat t = new Thermostat(0,  100);

            // Setting temperature within range
            t.setTemp(50);
            System.out.println("Temperature set to: " + t.getCurrentTemp());

            // Attempting to set a temperature that's too high
            try {
                t.setTemp(150);
            } catch (TemperatureOutOfRange e) {
                System.out.println(e.getMessage());
            }

            // Attempting to set a temperature that's too low
            try {
                t.setTemp(-50);
            } catch (TemperatureOutOfRange e) {
                System.out.println(e.getMessage());
            }

            // Rethrowing exception
            try {
                throw new TemperatureTooHigh("Temperature is too high");
            } catch (TemperatureTooHigh e) {
                System.out.println(e.getMessage());
                throw e;
            }
        } catch (TemperatureOutOfRange e) {
            System.out.println("Superpass catch: " + e.getMessage());
        }
    }
}
