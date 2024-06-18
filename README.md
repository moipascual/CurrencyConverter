# Currency Converter

Este es un proyecto de convertidor de divisas en Java que utiliza la API de ExchangeRate-API para obtener tasas de conversión de divisas en tiempo real. La aplicación permite al usuario convertir entre diferentes monedas, ver tasas de conversión y listar las monedas permitidas.

## Características

- Convertir entre diferentes monedas.
- Ver las tasas de conversión actuales.
- Listar todas las monedas permitidas.
- Interfaz de usuario basada en consola.

## Requisitos

- Java 11 o superior.
- Dependencia de Gson para el manejo de JSON.

## Instalación

1. Clona el repositorio:

    ```sh
    git clone https://github.com/tu-usuario/tu-repositorio.git
    ```

2. Navega al directorio del proyecto:

    ```sh
    cd tu-repositorio
    ```

3. Asegúrate de tener la biblioteca Gson. Puedes descargar el JAR desde [Gson GitHub Releases](https://github.com/google/gson/releases) y añadirlo a tu proyecto.

## Uso

1. Compila el proyecto:

    ```sh
    javac -cp ".:gson-2.8.6.jar" *.java
    ```

2. Ejecuta la aplicación:

    ```sh
    java -cp ".:gson-2.8.6.jar" Main
    ```

3. Sigue las instrucciones en pantalla para interactuar con el convertidor de divisas.

## Estructura del Proyecto

- **ConversionQuery.java**: Clase para realizar consultas a la API y obtener las tasas de conversión.
- **ConversorLogic.java**: Clase que contiene la lógica de conversión de monedas.
- **Conversion.java**: Record que representa la respuesta JSON de la API.
- **Main.java**: Punto de entrada principal de la aplicación.
- **MainAlternative.java**: Punto de entrada alternativo que utiliza la clase `JsonAnalyzer` para analizar el JSON.
- **JsonAnalyzer.java**: Clase para analizar y extraer propiedades específicas del JSON (opcional).

## Ejemplo de Uso

```sh
Ingrese la moneda base (por ejemplo, USD): 
USD

Menú de opciones:
1. Convertir moneda
2. Ver tasas de conversión
3. Ver monedas permitidas
4. Salir
Seleccione una opción: 1
Ingrese la moneda de origen: 
USD
Ingrese la moneda de destino: 
EUR
Ingrese la cantidad a convertir: 
100
Resultado: 100.0 USD = 93.45 EUR

## Agradecimientos

- [ExchangeRate-API](https://www.exchangerate-api.com/) por proporcionar una API gratuita para obtener tasas de cambio de divisas.
- [Gson](https://github.com/google/gson) por la biblioteca para el manejo de JSON.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:

1. Haz un fork del proyecto.
2. Crea una rama para tu nueva funcionalidad (`git checkout -b feature/nueva-funcionalidad`).
3. Haz commit de tus cambios (`git commit -am 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Crea un nuevo Pull Request.