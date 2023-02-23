package Ejercicio3_FilaB;

public class CreatorCamiseta extends CreatorELEMENTOS{
    @Override
    public Camiseta create(int precio) {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("Roja");
        camiseta.setTamano("M");
        camiseta.setGarantia("2 meses");
        camiseta.setPrecio(precio);
        return camiseta;
    }
}
