Descripción
La librería Estadística es una utilidad Java que proporciona métodos para realizar cálculos estadísticos básicos y operaciones financieras comunes. Su propósito es simplificar operaciones como:
-	Cálculos de IVA (agregar o quitar)
-	Cálculos de porcentajes
-	Operaciones con descuentos
-	Cálculos estadísticos (promedio, mediana, moda)

Explicación del código
Clase principal: Formulas
Contiene todos los métodos estáticos para realizar los cálculos.

Métodos disponibles:

1.	Cálculos de IVA
-	IVA(double x): Calcula el 16% de IVA sobre un valor
-	IVA(double x, double porcentaje): Calcula IVA con porcentaje personalizado
-	menosIVA(double x): Quita el 16% de IVA de un valor
-	menosIVA(double x, double porcentaje): Quita IVA con porcentaje personalizado

2.	Cálculos de porcentajes
-	porcentajeDe(double valor, double porcentaje): Calcula qué valor es un porcentaje de otro
-	calcularPorcentaje(double parte, double total): Calcula qué porcentaje representa una parte del total

3.	Estadísticas básicas
-	promedio(double[] numeros): Calcula la media aritmética
-	mediana(double[] numeros): Calcula la mediana (ordena los datos internamente)
-	moda(double[] numeros): Encuentra el valor más frecuente



4.	Operaciones con descuentos
-	descuento (double precioOriginal, double porcentajeDescuento): Calcula el monto del descuento
-	precioConDescuento(double precioOriginal, double porcentajeDescuento): Calcula el precio final con descuento

Variables:
Todos los métodos reciben parámetros necesarios para sus cálculos y devuelven resultados. No hay variables de clase ya que todos los métodos son estáticos.

 Validaciones:
-	Los métodos estadísticos (promedio, mediana, moda) verifican si el array está vacío para devolver 0
-	tienen validacion en que no se pueden agregar letras u otro caracter que no sea un numero

Instrucciones para importar el .jar en otro proyecto

 VIDEO: 
 https://youtu.be/0JD6jw8yBec




