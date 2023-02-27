package EjerciciosOtraFilaA.Ej3;

public class Radio implements IElectrodomestico {
    private String nombre;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void showInfo() {
        System.out.println("++++++RADIO++++++");
        System.out.println("Electrodomestico: " + nombre);
        System.out.println("Precio: " + precio);
    }
}
