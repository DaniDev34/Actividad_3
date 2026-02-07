import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Producto p1 = new Producto();
        Producto p2 = new Producto();

        try { // try-catch para manejar posibles errores basicos de entrada 
            
            System.out.println("---- INGRESA DATOS DEL PRODUCTO 1 ----");
            productosteclado(sc, p1); // cargar datos del producto 1

            System.out.println("---- INGRESA DATOS DEL PRODUCTO 2 ----");
            productosteclado(sc, p2); // cargar datos del producto 2

            System.out.println("---- DATOS DEL PRODUCTO 1 ----");
            p1.mostrarInfo();

            System.out.println("---- DATOS DEL PRODUCTO 2 ----");
            p2.mostrarInfo();
            
            System.out.print("Ingresa el porcentaje de utilidad: ");
            double utilidad = sc.nextDouble();
            
            String ProductoMayor = compararProductos(p1, p2, utilidad);

            System.out.println("---- RESULTADO DE COMPARACION ----");
            System.out.println("Producto con mayor precio de venta: " + ProductoMayor);

        } catch (InputMismatchException e) { // manejo de error en caso de ingresar un dato incorrecto (como texto en lugar de número)
            System.out.println(" Error: Ingresaste un dato incorrecto.");
        
        } catch (Exception e) { // manejo de cualquier otro error inesperado
            System.out.println(" Ocurrió un error ");

        } finally { // finally para finalizar el programa, cerrando scanner 
            sc.close();
            System.out.println("Programa finalizado.");
        }
    }

    
    private static void productosteclado(Scanner sc, Producto p) { // Método auxiliar para no repetir código

        sc.nextLine(); 

        System.out.println("Titulo: ");
        p.setTitulo(sc.nextLine());

        System.out.print("Descripcion: ");
        p.setDescripcion(sc.nextLine());

        System.out.print("ID: ");
        p.setIdProducto(sc.nextLine());

        System.out.print("Genero: ");
        p.setGenero(sc.nextLine());

        System.out.print("Costo: ");
        p.setCosto(sc.nextDouble());

        System.out.print("Impuesto (valor cualquiera, posteriormente se calcula): ");
        p.setImpuesto(sc.nextDouble());
    }

    
    public static String compararProductos(Producto a, Producto b, double utilidad) { // Para comparar dos productos por su precio

        double precioA = a.calcularPrecio(utilidad); 
        double precioB = b.calcularPrecio(utilidad);

        if (precioA > precioB) {
            return a.getTitulo();
        } else if (precioB > precioA) {
            return b.getTitulo();
        } else { // si ambos precios son iguales 
            return "Ambos productos tienen el mismo precio de venta";
        }
    }
}
