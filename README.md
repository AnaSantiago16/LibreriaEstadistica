```markdown
# Librería Estadística - Documentación

## 📊 Descripción

La **Librería Estadística** es una utilidad Java diseñada para simplificar cálculos estadísticos y operaciones financieras comunes. Proporciona métodos estáticos listos para usar en tus proyectos.

**Funcionalidades principales:**
- 🧮 Cálculos de IVA (agregar/remover)
- 📈 Operaciones con porcentajes
- 💰 Cálculos de descuentos
- 📊 Estadísticas básicas (promedio, mediana, moda)

## 🧠 Explicación del Código

### Clase Principal: `Formulas`
Contiene todos los métodos estáticos para realizar los cálculos.

---

## 🔢 Métodos Disponibles

### 1. Cálculos de IVA
```java
static double IVA(double x)
```
Calcula el 16% de IVA sobre un valor

```java
static double IVA(double x, double porcentaje)
```
Calcula IVA con porcentaje personalizado

```java
static double menosIVA(double x)
```
Quita el 16% de IVA de un valor

```java
static double menosIVA(double x, double porcentaje)
```
Quita IVA con porcentaje personalizado

### 2. Operaciones con Porcentajes
```java
static double porcentajeDe(double valor, double porcentaje)
```
Calcula qué valor es un porcentaje de otro

```java
static double calcularPorcentaje(double parte, double total)
```
Calcula qué porcentaje representa una parte del total

### 3. Estadísticas Básicas
```java
static double promedio(double[] numeros)
```
Calcula la media aritmética

```java
static double mediana(double[] numeros)
```
Calcula la mediana (ordena los datos automáticamente)

```java
static double moda(double[] numeros)
```
Encuentra el valor más frecuente

### 4. Operaciones con Descuentos
```java
static double descuento(double precioOriginal, double porcentajeDescuento)
```
Calcula el monto del descuento

```java
static double precioConDescuento(double precioOriginal, double porcentajeDescuento)
```
Calcula el precio final con descuento aplicado

---

## 🛡️ Validaciones y Seguridad

- Todos los métodos estadísticos verifican arrays vacíos (devuelven 0)
- Validación de tipos de datos (solo acepta números)
- Manejo seguro de divisiones por cero
- Protección contra valores nulos

---

## 📥 Instrucciones de Importación

1. **Descargar** el archivo `Estadistica.jar`
2. En tu proyecto NetBeans:
   - Click derecho en **"Libraries"** (en el panel Projects)
   - Seleccionar **"Add JAR/Folder..."**
   - Buscar y seleccionar el archivo `Estadistica.jar`
   - Click en **"Abrir"**



3. **Uso en código:**
```java
import com.tulibreria.estadistica.Formulas;

public class MiClase {
    public static void main(String[] args) {
        double iva = Formulas.IVA(100); // Ejemplo de uso
    }
}
```

---

## ▶️ Video Demostrativo

[![Ver video tutorial](https://img.youtube.com/vi/0JD6jw8yBec/0.jpg)](https://youtu.be/0JD6jw8yBec)

---

## 📌 Notas Importantes

- Todos los métodos son `static` (no requiere instanciar la clase)
- Precisión de decimales configurada para operaciones financieras
- Compatible con Java 8 y versiones superiores
- Licencia MIT - Uso libre en proyectos comerciales
``` 
