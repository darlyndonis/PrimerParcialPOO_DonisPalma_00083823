public class Laptop extends EquiposElectronicos implements PrecioDescripcion{
    private String color;
    public Laptop() {
    }

    public Laptop(String modelo, String nombre, String descripcion, double precio) {
        super(modelo, nombre, descripcion, precio);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Metodos para obtener el precio y la descripcion
    public void DescripcionProducto(){
        System.out.println("Descripción del producto");
        System.out.println("Excelentes componentes del dispositivo electrónico.");
    }

    public void Precio(){


    }

}
