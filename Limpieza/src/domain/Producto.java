package domain;

public class Producto {

    private Integer idProducto;
    private String nombreDeProducto;
    private Double precio;
    private String detalle;
    private Integer cantidad;
    private String nivelDeToxi;

    public Producto() {
    }

    public Producto(Integer idProducto, String nombreDeProducto, Double precio, String detalle, Integer cantidad, String nivelDeToxi) {
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreDeProducto='" + nombreDeProducto + '\'' +
                ", precio=" + precio +
                ", detalle='" + detalle + '\'' +
                ", cantidad=" + cantidad +
                ", nivelDeToxi='" + nivelDeToxi + '\'' +
                '}';
    }
}
