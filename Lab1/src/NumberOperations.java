import java.math.BigDecimal;
import java.util.*;

public class NumberOperations {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2.2);
        numbers.add(0);
        numbers.add(1505);
        numbers.add(8.00093);
        
        System.out.println("Numbers " + numbers);

        System.out.println("Int numbers");
        for (Number number : numbers) {
            Integer intNum = number.intValue();
            System.out.printf("%d, ", intNum);
        }

        System.out.println("\nFloat numbers");
        for (Number number : numbers) {
            Float floatNum = number.floatValue();
            System.out.printf("%.2f, ", floatNum);
        }

        Map<Class<? extends Number>, List<Number>> numberMap = new HashMap<>();

        for (Number number : numbers) {
            Class<? extends Number> numberClass = number.getClass();
            numberMap.computeIfAbsent(numberClass, k -> new ArrayList<>()).add(number);
        }

        System.out.println("\n\nNumber map");
        for (Map.Entry<Class<? extends Number>, List<Number>> entry : numberMap.entrySet()) {
            System.out.printf("%s: %s\n", entry.getKey().getSimpleName(), entry.getValue());
        }

        ArrayList<BigDecimal> bigDecimals = new ArrayList<>();

        for (Number number : numbers) {
            BigDecimal bigDecimal = new BigDecimal(number.toString());
            bigDecimals.add(bigDecimal);
        }

        System.out.printf("\nBig Decimal numbers: \n%s\n", bigDecimals);
    }
}