package Ejercicio3_FilaB;

public class CreatorShorts  extends CreatorELEMENTOS{
    @Override
    public Shorts create(int precio) {
        Shorts shorts = new Shorts();
        shorts.setColor("Azules");
        shorts.setTamano("XL");
        shorts.setGarantia("1 mes");
        shorts.setPrecio(precio);
        return shorts;
    }
}
