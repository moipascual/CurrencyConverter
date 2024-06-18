public class MainCalculadora {
    public static void main(String[] args) {
        ConversionQuery query = new ConversionQuery();

        // Cambia "USD" por la moneda que desees como base
        Conversion conversion = query.doConversion("USD");

        // Crear instancia de ConversorLogic con las tasas de conversión
        ConversorLogic conversor = new ConversorLogic(conversion.conversion_rates());

        // Ejemplo de conversión
        double cantidad = 100.0;
        String monedaOrigen = "USD";
        String monedaDestino = "EUR";
        try {
            double resultado = conversor.convertir(cantidad, monedaOrigen, monedaDestino);
            System.out.println(cantidad + " " + monedaOrigen + " = " + resultado + " " + monedaDestino);
        } catch (IllegalArgumentException e) {
            System.err.println("Error en la conversión: " + e.getMessage());
        }
    }
}
