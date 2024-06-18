import java.util.Map;

public class ConversorLogic {
    private final Map<String, Double> conversionRates;

    // Constructor que inicializa las tasas de conversión
    public ConversorLogic(Map<String, Double> conversionRates) {
        this.conversionRates = conversionRates;
    }

    // Método para convertir una cantidad de una moneda a otra
    public double convertir(double cantidad, String monedaOrigen, String monedaDestino) {
        if (monedaOrigen.equals(monedaDestino)) {
            return cantidad; // No se requiere conversión si las monedas son las mismas
        }

        Double tasaOrigen = conversionRates.get(monedaOrigen);
        Double tasaDestino = conversionRates.get(monedaDestino);

        if (tasaOrigen == null || tasaDestino == null) {
            throw new IllegalArgumentException("Tasa de conversión no encontrada para una de las monedas.");
        }

        // Realizar la conversión
        return cantidad / tasaOrigen * tasaDestino;
    }

    // Otros métodos relacionados con la lógica de conversión de moneda según sea necesario
}
