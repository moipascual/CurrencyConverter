public class Main {
    public static void main(String[] args) {
        ConversionQuery query = new ConversionQuery();

        // Cambia "USD" por la moneda que desees
        Conversion conversion = query.doConversion("USD");

        // Acceder a las propiedades directamente
        System.out.println("Resultado: " + conversion.result());
        System.out.println("Documentación: " + conversion.documentation());
        System.out.println("Términos de uso: " + conversion.terms_of_use());
        System.out.println("Última actualización (Unix): " + conversion.time_last_update_unix());
        System.out.println("Última actualización (UTC): " + conversion.time_last_update_utc());
        System.out.println("Próxima actualización (Unix): " + conversion.time_next_update_unix());
        System.out.println("Próxima actualización (UTC): " + conversion.time_next_update_utc());
        System.out.println("Código base: " + conversion.base_code());

        // Imprimir todas las tasas de conversión
        conversion.conversion_rates().forEach((currency, rate) -> {
            System.out.println("Moneda: " + currency + " Tasa: " + rate);
        });
    }
}
