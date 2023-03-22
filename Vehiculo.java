package alc;

/**
 *
 * @author falberto
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private Integer precio;
    private int cantidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(Integer precio){
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
