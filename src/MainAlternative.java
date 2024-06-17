import com.google.gson.Gson;

public class MainAlternative {
    public static void main(String[] args) {
        ConversionQuery query = new ConversionQuery();

        // Cambia "USD" por la moneda que desees
        Conversion conversion = query.doConversion("USD");

        // Crear un analizador de JSON para la respuesta
        JsonAnalyzer analyzer = new JsonAnalyzer(new Gson().toJson(conversion));

        // Mostrar algunas propiedades específicas del JSON utilizando JsonAnalyzer
        System.out.println("Resultado: " + analyzer.getResult());
        System.out.println("Documentación: " + analyzer.getDocumentation());
        System.out.println("Términos de uso: " + analyzer.getTermsOfUse());
        System.out.println("Última actualización (Unix): " + analyzer.getTimeLastUpdateUnix());
        System.out.println("Última actualización (UTC): " + analyzer.getTimeLastUpdateUtc());
        System.out.println("Próxima actualización (Unix): " + analyzer.getTimeNextUpdateUnix());
        System.out.println("Próxima actualización (UTC): " + analyzer.getTimeNextUpdateUtc());
        System.out.println("Código base: " + analyzer.getBaseCode());

        // Imprimir todas las tasas de conversión
        analyzer.getConversionRates().entrySet().forEach(entry -> {
            System.out.println("Moneda: " + entry.getKey() + " Tasa: " + entry.getValue());
        });
    }
}