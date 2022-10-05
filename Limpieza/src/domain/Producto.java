package domain;

public class Producto {

    private Integer idProducto;
    private String nombreDeProducto;
    private Integer precio;
    private String detalle;
    private Integer cantidad;
    private String nivelDeToxi;

    public Producto() {
    }

    public Producto(Integer idProducto, String nombreDeProducto, Integer precio, String detalle, Integer cantidad, String nivelDeToxi) {
        this.idProducto = idProducto;
        this.nombreDeProducto = nombreDeProducto;
        this.precio = precio;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.nivelDeToxi = nivelDeToxi;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreDeProducto() {
        return nombreDeProducto;
    }

    public void setNombreDeProducto(String nombreDeProducto) {
        this.nombreDeProducto = nombreDeProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNivelDeToxi() {
        return nivelDeToxi;
    }

    public void setNivelDeToxi(String nivelDeToxi) {
        this.nivelDeToxi = nivelDeToxi;
    }

    @Override
    public String toString() {
        return "P R O D U C T O " +
                "\n-------------------" +
                "\n Serial De Producto= " + idProducto +
                ", \n Nombre De Producto=' " + nombreDeProducto + '\'' +
                ", \n Precio Del Producto= $ " + precio +
                ", \n Detalle Del Producto=' " + detalle + '\'' +
                ",\n Cantidad De unidades en stock= " + cantidad +
                ",\n Nivel De Toxicidad=' " + nivelDeToxi + '\'' ;
    }
}
