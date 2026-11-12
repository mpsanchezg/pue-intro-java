# Actividades de la clase 3

Cada clase tiene su propio `main` y se ejecuta de forma independiente:

| Clase | Actividad |
|-------|-----------|
| `Class3UserValidation` | Compara el usuario introducido con `admin` mediante `equals()`, distinguiendo mayusculas y minusculas. |
| `Class3ProductStatistics` | Calcula la media, el maximo y el minimo de los precios unitarios de dos productos. |
| `Class3Practice` | Factura y reto final de gestion de una compra: cliente, dos productos, precios, unidades y descuento porcentual sobre el subtotal. |

## Compilar y ejecutar

Desde la raiz del repositorio, con un JDK instalado:

```sh
mkdir -p module2/target/class3
javac -d module2/target/class3 module2/src/main/java/cl/sangut/intro/java/module2/class3/*.java
java -cp module2/target/class3 cl.sangut.intro.java.module2.class3.Class3UserValidation
java -cp module2/target/class3 cl.sangut.intro.java.module2.class3.Class3ProductStatistics
java -cp module2/target/class3 cl.sangut.intro.java.module2.class3.Class3Practice
```

Ejecuta la clase correspondiente al reto que quieras probar. Introduce los
decimales con punto, por ejemplo `12.50`, y las unidades como numeros enteros.
Los precios deben ser finitos y no negativos, las unidades positivas y el
descuento debe estar entre 0 y 100. Los campos de texto de la factura no pueden
estar vacios. Una entrada numerica con formato incorrecto provoca un error
explicito de `Scanner`.

## Resultados de prueba

| Programa | Entrada (en orden) | Resultado |
|----------|--------------------|-----------|
| Usuario | `admin` | `Usuario valido.` |
| Usuario | `Admin` | `Usuario no valido.` |
| Estadisticas | `12.50`, `7.50` | Media: `10.00`; maximo: `12.50`; minimo: `7.50`. |
| Estadisticas | `5`, `5` | Media, maximo y minimo: `5.00`. |
| Estadisticas | `-1`, `5` | Error: los precios deben ser finitos y no negativos. |
| Compra | `Ana`, `Cuaderno`, `12.50`, `2`, `Boligrafo`, `3`, `4`, `10` | Subtotal: `37.00`; descuento: `3.70`; total: `33.30`. |
| Compra | `Ana`, `Cuaderno`, `12.50`, `2`, `Boligrafo`, `3`, `4`, `0` | Subtotal: `37.00`; descuento: `0.00`; total: `37.00`. |
| Compra | `Ana`, `Cuaderno`, `12.50`, `2`, `Boligrafo`, `3`, `4`, `100` | Subtotal: `37.00`; descuento: `37.00`; total: `0.00`. |
| Compra | `Ana`, `Cuaderno`, `12.50`, `2`, `Boligrafo`, `3`, `4`, `101` | Error: el descuento debe estar entre 0 y 100. |

Resumen del caso de compra con descuento del 10 %:

```text
FACTURA
Cliente: Ana
Producto                 Precio Unidades      Importe
Cuaderno                  12.50        2        25.00
Boligrafo                  3.00        4        12.00
Subtotal: 37.00
Descuento (10.00%): 3.70
Total a pagar: 33.30
```
