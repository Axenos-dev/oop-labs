public class PressureData {
    final private double pressure;

    public PressureData(double pressure) {
        this.pressure = pressure;
    }

    public void processPressure() {
        System.out.println("Processing pressure: " + pressure + " hPa");
        if (pressure > 1020) {
            System.out.println("High pressure detected.");
        } else if (pressure < 1000) {
            System.out.println("Low pressure detected.");
        } else {
            System.out.println("Pressure is within normal range.");
        }
    }
}
