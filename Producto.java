public class Producto {

    // Atributos
    private String titulo;
    private String descripcion;
    private String idproducto;
    private String genero;
    private Double costo;
    private Double impuesto;
    private Double precioTotal;

    // Constructores
    
    // Constructor vacío

    public Producto() {
    }

    // Constructor 

    public Producto(String titulo, String descripcion, String idproducto, String genero, Double costo, Double impuesto, Double precioTotal) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.idproducto = idproducto;
        this.genero = genero;
        this.costo = costo;
        this.impuesto = impuesto;
        this.precioTotal = precioTotal;

    }


    // Getters

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getIdProducto() {
        return idproducto;
    }

    public String getGenero() {
        return genero;
    }

    public Double getCosto() {
        return costo;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdProducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }


    // Métodos


    public double calcularPrecio(double utilidad) {
        // Calcular impuesto
        double impuestoRecalculado = costo * 0.15;
        this.impuesto = impuestoRecalculado;

        // Calcular precio total
        double precioTotal = costo + impuestoRecalculado + (costo * utilidad / 100);
        return precioTotal;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("ID: " + idproducto);
        System.out.println("Género: " + genero);
        System.out.println("Costo: " + costo);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("precio total: " + precioTotal);
    }

}
