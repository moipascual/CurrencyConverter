import java.util.Map;
import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversionQuery query = new ConversionQuery();

        System.out.println("Ingrese la moneda base (por ejemplo, USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        Conversion conversion = query.doConversion(baseCurrency);
        ConversorLogic conversorLogic = new ConversorLogic(conversion);

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Ver tasas de conversión");
            System.out.println("3. Ver monedas permitidas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Validación de entrada numérica para la opción
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Por favor, ingrese un número.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Ingrese la moneda de origen: ");
                    String fromCurrency = scanner.nextLine().toUpperCase();
                    System.out.println("Ingrese la moneda de destino: ");
                    String toCurrency = scanner.nextLine().toUpperCase();
                    System.out.println("Ingrese la cantidad a convertir: ");

                    // Validación de entrada numérica para la cantidad
                    double amount;
                    try {
                        amount = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Cantidad no válida. Por favor, ingrese un número.");
                        continue;
                    }

                    try {
                        double result = conversorLogic.convert(fromCurrency, toCurrency, amount);
                        System.out.println("Resultado: " + amount + " " + fromCurrency + " = " + result + " " + toCurrency);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Tasas de conversión:");
                    for (Map.Entry<String, Double> entry : conversorLogic.getConversionRates().entrySet()) {
                        System.out.println("Moneda: " + entry.getKey() + " Tasa: " + entry.getValue());
                    }
                    break;

                case 3:
                    conversorLogic.showAvailableCurrencies();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
