public class HumidityData {
    final private double humidity;

    public HumidityData(double humidity) {
        this.humidity = humidity;
    }

    public void processHumidity() {
        System.out.println("Processing humidity: " + humidity + "%");
        if (humidity > 80) {
            System.out.println("Alert: High humidity!");
        } else if (humidity < 30) {
            System.out.println("Alert: Low humidity!");
        } else {
            System.out.println("Humidity is within normal range.");
        }
    }
}
