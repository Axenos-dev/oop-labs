public class WeatherMonitoringSystem {
    public static void main(String[] args) {
        WeatherDataCollector collector = WeatherDataCollector.getInstance();

        collector.collectData();

        double temperature = collector.getTemperature();
        double humidity    = collector.getHumidity();
        double pressure    = collector.getPressure();

        TemperatureData tempData = new TemperatureData(temperature);
        tempData.processTemperature();

        HumidityData humidityData = new HumidityData(humidity);
        humidityData.processHumidity();

        PressureData pressureData = new PressureData(pressure);
        pressureData.processPressure();
    }
}
