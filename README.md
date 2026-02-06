# Actividad 3 

Dentro de est repositorio se encuentra la documentación de la actividad 3, cuyo objetivo es aplicar los
conocimientos adquiridos en las sesiones para crear clases que incluyan métodos avanzados, así como para construir 
y usar objetos a partir de esas clases. 

---

## Instrucciones 

1. En Java, crea una clase llamada Producto con las siguientes características:
- La clase debe tener los siguientes atributos privados (private):

| Atributo         | Tipo |
|------------------|------|
|Descripción       | String |
| Código           | String |
|Tipo              | String |
| Costo            | double |
| Impuesto         | double |

- Incluye un método de acceso (get) para cada atributo privado. Recuerda que estos elementos devuelven el valor del atributo y, por tanto, deben ser públicos (public).

- Incluye un método “establecedor” (set) para cada atributo privado. Recuerda que estos elementos asignan un valor a los atributos, por lo que no devuelven ningún valor y, por ese motivo, también deben ser públicos.

- Incluye un método público llamado muestraProducto que presente el valor de todos los atributos en pantalla.

- Incluye un método funcional que calcule y devuelva el precio de venta del producto, de acuerdo con los siguientes requisitos:
    - El método debe recibir un parámetro de tipo double que se llame utilidad, cuyo valor corresponde al porcentaje de utilidad que se quiere manejar para el producto.

   - Al costo, se le debe sumar el porcentaje de utilidad; por ejemplo, si el primero es de $100 y la segunda de 20%, el precio antes de impuestos es de $120.

  - Finalmente, a dicho precio, se le debe sumar el impuesto; entonces, si este es del 16%, el precio de venta total se calcula a partir de la suma de $120 + $16.2, la cual arroja un total de $139.2. Este es el valor que debe devolver el método.

  - El nombre del método debe ser calcularPrecio.

2. En la clase principal (main) del programa, realiza las siguientes acciones:
- Crea dos objetos de la clase Producto, pide al usuario el valor de todos los atributos y asígnalos mediante los métodos establecedores (set).

- Incluye sentencias try-catch para captar excepciones que se puedan presentar en la entrada de datos.

- Muestra, en pantalla, los valores de los atributos de los dos objetos a través del método mostrarProducto().

- Crea un método estático llamado compararProductos que reciba dos parámetros de tipo Producto; dentro de él, invoca el método de clase calcularPrecio para cada uno de los productos recibidos como argumentos y, luego, determina cuál es mayor. El método debe devolver un String con la descripción del producto con el mayor precio de venta.

- Desde la clase principal (main), invoca el método compararProductos y muestra el resultado en la pantalla.

## Desarrollo de la actividad   

A continuación se presenta el bloque de código de la clase **Producto** en Java.

