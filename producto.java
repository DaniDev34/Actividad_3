public class producto {

    //Atributos 

    private String descripcion;
    private String idproducto;
    private String tipo;
    private double costo;
    private double impuesto;

    //constructor


    public producto (String descripcion, String idproducto, String tipo, double costo, double impuesto) {
        this.descripcion = descripcion;
        this.idproducto = idproducto;
        this.tipo = tipo;
        this.costo = costo;
        this.impuesto = impuesto;
    }

    //getters

    public String getDescripcion(){
        return descripcion;
    }

    public String getIdProducto(){
        return idproducto;
    }

    public String getTipo(){
        return tipo;
    }

    public double getCosto(){
        return costo;
    }

    public double getImpuesto(){
        return impuesto;
    }

    //Setters 

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdProducto(String idproducto){
        this.idproducto = idproducto;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }

    public void setImpuesto(double impuesto){
        this.impuesto = impuesto;
    }
}