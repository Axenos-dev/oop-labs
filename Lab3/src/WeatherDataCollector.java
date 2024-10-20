public class WeatherDataCollector {
    // Singleton instance
    private static WeatherDataCollector instance;

    private double temperature;
    private double humidity;
    private double pressure;

    private WeatherDataCollector() {}

    public static synchronized WeatherDataCollector getInstance() {
        if (instance == null) {
            instance = new WeatherDataCollector();
        }
        return instance;
    }

    public void collectData() {
        // Temperature between 0 and 40°C
        this.temperature = Math.random() * 40;
        // Humidity between 0% and 100%
        this.humidity = Math.random() * 100;
        // Pressure between 950 and 1050 hPa
        this.pressure = 950 + Math.random() * 100;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
