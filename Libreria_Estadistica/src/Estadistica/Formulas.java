
/*
 * Librería de fórmulas estadísticas y financieras
 * Incluye cálculos de promedio, moda, mediana, IVA, porcentajes y descuentos
 */

package Estadistica;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que proporciona métodos para cálculos estadísticos y financieros comunes.
 * <p>
 * Esta clase incluye funcionalidades para:
 * <ul>
 *   <li>Cálculos con IVA (agregar o quitar)</li>
 *   <li>Operaciones con porcentajes</li>
 *   <li>Cálculos estadísticos básicos (promedio, mediana, moda)</li>
 *   <li>Cálculos de descuentos</li>
 * </ul>
 * 
 * @author Ana Santiago
 * @version 2.0 (con validaciones mejoradas)
 */

public class Formulas {
    
    /**
     * Calcula el IVA estándar (16%) de una cantidad.
     * 
     * @param x Cantidad base sobre la cual se calculará el IVA
     * @return El valor del IVA correspondiente al 16% de x
     * @throws IllegalArgumentException Si la cantidad es negativa
     */
    public static double IVA(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        return x * 0.16;
    }
    
    /**
     * Calcula el IVA con porcentaje personalizado de una cantidad.
     * 
     * @param x Cantidad base sobre la cual se calculará el IVA
     * @param porcentaje Porcentaje de IVA a aplicar
     * @return El valor del IVA correspondiente al porcentaje especificado de x
     * @throws IllegalArgumentException Si la cantidad o el porcentaje son negativos
     */
    public static double IVA(double x, double porcentaje) {
        if (x < 0 || porcentaje < 0) {
            throw new IllegalArgumentException("Ni la cantidad ni el porcentaje pueden ser negativos");
        }
        return x * (porcentaje / 100);
    }
    
    /**
     * Calcula el valor original (sin IVA) de una cantidad que incluye el 16% de IVA.
     * 
     * @param x Cantidad que incluye el IVA
     * @return El valor original sin el 16% de IVA
     * @throws IllegalArgumentException Si la cantidad es negativa
     */
    public static double menosIVA(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        return x / 1.16;
    }
    
    /**
     * Calcula el valor original (sin IVA) de una cantidad que incluye un porcentaje personalizado de IVA.
     * 
     * @param x Cantidad que incluye el IVA
     * @param porcentaje Porcentaje de IVA incluido
     * @return El valor original sin el IVA especificado
     * @throws IllegalArgumentException Si la cantidad o el porcentaje son negativos
     */
    public static double menosIVA(double x, double porcentaje) {
        if (x < 0 || porcentaje < 0) {
            throw new IllegalArgumentException("Ni la cantidad ni el porcentaje pueden ser negativos");
        }
        return x / (1 + (porcentaje / 100));
    }
    
    /**
     * Calcula qué cantidad representa un porcentaje específico de un valor dado.
     * 
     * @param valor Cantidad base
     * @param porcentaje Porcentaje a calcular
     * @return La cantidad que representa el porcentaje especificado del valor
     * @throws IllegalArgumentException Si el valor es negativo
     */
    public static double porcentajeDe(double valor, double porcentaje) {
        if (valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
        return (valor * porcentaje) / 100;
    }
    
    /**
     * Calcula qué porcentaje representa una parte con respecto a un total.
     * 
     * @param parte Cantidad que se quiere expresar como porcentaje
     * @param total Cantidad total de referencia
     * @return El porcentaje que representa la parte con respecto al total
     * @throws IllegalArgumentException Si el total es cero o negativo, o si la parte es negativa
     */
    public static double calcularPorcentaje(double parte, double total) {
        if (total <= 0) {
            throw new IllegalArgumentException("El total debe ser mayor que cero");
        }
        if (parte < 0) {
            throw new IllegalArgumentException("La parte no puede ser negativa");
        }
        return (parte / total) * 100;
    }
    
    /**
     * Calcula el promedio (media aritmética) de un conjunto de números.
     * 
     * @param numeros Array de números para calcular el promedio
     * @return El valor promedio de los números en el array
     * @throws IllegalArgumentException Si el array está vacío
     */
    public static double promedio(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    
    /**
     * Calcula la mediana (valor central) de un conjunto de números.
     * 
     * @param numeros Array de números para calcular la mediana
     * @return El valor mediano de los números en el array
     * @throws IllegalArgumentException Si el array está vacío
     */
    public static double mediana(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        Arrays.sort(numeros);
        
        int mitad = numeros.length / 2;
        if (numeros.length % 2 == 1) {
            return numeros[mitad];
        } else {
            return (numeros[mitad - 1] + numeros[mitad]) / 2.0;
        }
    }
    
    /**
     * Calcula la moda (valor más frecuente) de un conjunto de números.
     * 
     * @param numeros Array de números para calcular la moda
     * @return El valor que aparece con más frecuencia en el array
     * @throws IllegalArgumentException Si el array está vacío
     */
    public static double moda(double[] numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        
        double maxValue = 0;
        int maxCount = 0;
        
        for (int i = 0; i < numeros.length; ++i) {
            int count = 0;
            for (int j = 0; j < numeros.length; ++j) {
                if (numeros[j] == numeros[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = numeros[i];
            }
        }
        
        return maxValue;
    }
    
    /**
     * Calcula el monto del descuento aplicado a un precio original.
     * 
     * @param precioOriginal Precio antes del descuento
     * @param porcentajeDescuento Porcentaje de descuento a aplicar
     * @return El monto del descuento calculado
     * @throws IllegalArgumentException Si el precio o porcentaje son negativos
     */
    public static double descuento(double precioOriginal, double porcentajeDescuento) {
        if (precioOriginal < 0 || porcentajeDescuento < 0) {
            throw new IllegalArgumentException("Ni el precio ni el porcentaje pueden ser negativos");
        }
        return precioOriginal * (porcentajeDescuento / 100);
    }
    
    /**
     * Calcula el precio final después de aplicar un descuento.
     * 
     * @param precioOriginal Precio antes del descuento
     * @param porcentajeDescuento Porcentaje de descuento a aplicar
     * @return El precio resultante después de aplicar el descuento
     * @throws IllegalArgumentException Si el precio o porcentaje son negativos
     */
    public static double precioConDescuento(double precioOriginal, double porcentajeDescuento) {
        if (precioOriginal < 0 || porcentajeDescuento < 0) {
            throw new IllegalArgumentException("Ni el precio ni el porcentaje pueden ser negativos");
        }
        return precioOriginal * (1 - (porcentajeDescuento / 100));
    }
    
    /**
     * Método para leer un valor double válido del usuario
     * 
     * @param scanner Objeto Scanner para leer la entrada
     * @param mensaje Mensaje a mostrar al usuario
     * @return Valor double válido ingresado por el usuario
     */
    private static double leerDouble(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                double valor = scanner.nextDouble();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un número válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }
    
    /**
     * Método para leer un valor double positivo del usuario
     * 
     * @param scanner Objeto Scanner para leer la entrada
     * @param mensaje Mensaje a mostrar al usuario
     * @return Valor double positivo ingresado por el usuario
     */
    private static double leerDoublePositivo(Scanner scanner, String mensaje) {
        while (true) {
            double valor = leerDouble(scanner, mensaje);
            if (valor >= 0) {
                return valor;
            }
            System.out.println("Error: El valor no puede ser negativo. Intente nuevamente.");
        }
    }
    
    /**
     * Método para leer un valor double positivo mayor que cero del usuario
     * 
     * @param scanner Objeto Scanner para leer la entrada
     * @param mensaje Mensaje a mostrar al usuario
     * @return Valor double positivo mayor que cero ingresado por el usuario
     */
    private static double leerDoublePositivoMayorQueCero(Scanner scanner, String mensaje) {
        while (true) {
            double valor = leerDouble(scanner, mensaje);
            if (valor > 0) {
                return valor;
            }
            System.out.println("Error: El valor debe ser mayor que cero. Intente nuevamente.");
        }
    }
    
    /**
     * Método para leer un entero positivo del usuario
     * 
     * @param scanner Objeto Scanner para leer la entrada
     * @param mensaje Mensaje a mostrar al usuario
     * @return Valor entero positivo ingresado por el usuario
     */
    private static int leerEnteroPositivo(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int valor = scanner.nextInt();
                if (valor > 0) {
                    return valor;
                }
                System.out.println("Error: El valor debe ser mayor que cero. Intente nuevamente.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingrese un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }
    
    /**
     * Método principal que demuestra el uso de las funciones de la clase.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner tx = new Scanner(System.in);
        
        System.out.println("Calculadora de fórmulas estadísticas y financieras");
        
        try {
            // Ejemplos de IVA
            double cantidadIVA = leerDoublePositivo(tx, "\nIngrese cantidad para calcular IVA (16%): ");
            System.out.println("IVA de " + cantidadIVA + ": " + IVA(cantidadIVA));
            
            double cantidadIVAPersonal = leerDoublePositivo(tx, "Ingrese cantidad para calcular IVA personalizado: ");
            double porcentajeIVA = leerDoublePositivo(tx, "Ingrese porcentaje de IVA: ");
            System.out.println("IVA de " + cantidadIVAPersonal + " con " + porcentajeIVA + "%: " + 
                             IVA(cantidadIVAPersonal, porcentajeIVA));
            
            // Ejemplo sin IVA
            double precioConIVA = leerDoublePositivo(tx, "\nIngrese precio con IVA (16%) para calcular precio sin IVA: ");
            System.out.println("Precio sin IVA de " + precioConIVA + ": " + menosIVA(precioConIVA));
            
            double precioConIVAPersonal = leerDoublePositivo(tx, "Ingrese precio con IVA personalizado: ");
            double porcentajeIVAAplicado = leerDoublePositivo(tx, "Ingrese porcentaje de IVA aplicado: ");
            System.out.println("Precio sin IVA de " + precioConIVAPersonal + " con " + porcentajeIVAAplicado + "%: " + 
                             menosIVA(precioConIVAPersonal, porcentajeIVAAplicado));
            
            // Ejemplo porcentajes
            double valorPorcentaje = leerDoublePositivo(tx, "\nIngrese valor para calcular porcentaje: ");
            double porcentajeACalcular = leerDoublePositivo(tx, "Ingrese porcentaje a calcular: ");
            System.out.println(porcentajeACalcular + "% de " + valorPorcentaje + ": " + 
                             porcentajeDe(valorPorcentaje, porcentajeACalcular));
            
            double parte = leerDoublePositivo(tx, "Ingrese parte para calcular qué porcentaje es del total: ");
            double total = leerDoublePositivoMayorQueCero(tx, "Ingrese total: ");
            System.out.println(parte + " es qué % de " + total + ": " + 
                             calcularPorcentaje(parte, total) + "%");
            
            // Ejemplo estadísticas
            int n = leerEnteroPositivo(tx, "\nIngrese cantidad de datos para estadísticas: ");
            double[] datos = new double[n];
            System.out.println("Ingrese los datos uno por uno:");
            for (int i = 0; i < n; i++) {
                datos[i] = leerDouble(tx, "Dato " + (i + 1) + ": ");
            }
            
            System.out.println("\nResultados estadísticos:");
            System.out.println("Promedio: " + promedio(datos));
            System.out.println("Mediana: " + mediana(datos));
            System.out.println("Moda: " + moda(datos));
            
            // Ejemplo descuentos
            double precioOriginal = leerDoublePositivo(tx, "\nIngrese precio original para descuento: ");
            double porcentajeDescuento = leerDoublePositivo(tx, "Ingrese porcentaje de descuento: ");
            System.out.println("Descuento de " + porcentajeDescuento + "% sobre " + precioOriginal + ": " + 
                             descuento(precioOriginal, porcentajeDescuento));
            System.out.println("Precio con descuento de " + porcentajeDescuento + "% sobre " + precioOriginal + ": " + 
                             precioConDescuento(precioOriginal, porcentajeDescuento));
            
        } finally {
            tx.close();
        }
    }
}