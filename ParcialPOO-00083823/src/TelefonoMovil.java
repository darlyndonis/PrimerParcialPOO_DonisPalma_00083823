public class TelefonoMovil extends EquiposElectronicos implements PrecioDescripcion{
    private String marca;

    public TelefonoMovil(String marca) {
        this.marca = marca;
    }

    public TelefonoMovil(String modelo, String nombre, String descripcion, double precio, String marca) {
        super(modelo, nombre, descripcion, precio);
        this.marca = marca;
    }

    public TelefonoMovil() {
    }

    public TelefonoMovil(String modelo, String nombre, String descripcion, double precio) {
        super(modelo, nombre, descripcion, precio);
    }

    //Metodos para obtener el precio y la descripcion

}
