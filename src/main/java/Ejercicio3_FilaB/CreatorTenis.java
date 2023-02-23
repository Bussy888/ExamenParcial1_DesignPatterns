package Ejercicio3_FilaB;

public class CreatorTenis  extends CreatorELEMENTOS{
    @Override
    public Tenis create(int precio) {
        Tenis tenis = new Tenis();
        tenis.setColor("Negro");
        tenis.setTamano("45");
        tenis.setGarantia("1 anno");
        tenis.setPrecio(precio);
        return tenis;
    }
}
