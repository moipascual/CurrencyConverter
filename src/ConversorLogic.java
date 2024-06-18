import java.util.Map;

public class ConversorLogic {
    private final Conversion conversion;

    public ConversorLogic(Conversion conversion) {
        this.conversion = conversion;
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        Map<String, Double> rates = conversion.conversion_rates();

        // Verificar si las monedas existen en el mapa
        if (!rates.containsKey(fromCurrency)) {
            throw new IllegalArgumentException("La moneda de origen no es válida: " + fromCurrency);
        }
        if (!rates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("La moneda de destino no es válida: " + toCurrency);
        }

        double fromRate = rates.get(fromCurrency);
        double toRate = rates.get(toCurrency);
        return (amount / fromRate) * toRate;
    }

    public Map<String, Double> getConversionRates() {
        return conversion.conversion_rates();
    }

    public void showAvailableCurrencies() {
        System.out.println("Monedas permitidas:");
        conversion.conversion_rates().keySet().forEach(System.out::println);
    }
}
