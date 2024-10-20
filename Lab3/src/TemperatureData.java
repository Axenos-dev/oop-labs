public class TemperatureData {
    final private double temperature;

    // Constructor assigns temperature value
    public TemperatureData(double temperature) {
        this.temperature = temperature;
    }

    public void processTemperature() {
        System.out.println("Processing temperature: " + temperature + "°C");
        if (temperature > 30) {
            System.out.println("Alert: High temperature!");
        } else if (temperature < 0) {
            System.out.println("Alert: Low temperature!");
        } else {
            System.out.println("Temperature is within normal range.");
        }
    }
}
