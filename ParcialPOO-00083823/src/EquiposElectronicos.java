public abstract class EquiposElectronicos {
    protected String modelo;
    protected String nombre;
    protected String descripcion;
    protected double precio;


    public EquiposElectronicos(){
    }
    public EquiposElectronicos(String modelo, String nombre, String descripcion, double precio) {
        this.modelo = modelo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }


    //Metodos Setter y Getter
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodos abstractos


}
