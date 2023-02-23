package Ejercicio3_FilaB;

public class CreatorCamiseta extends CreatorELEMENTOS{
    @Override
    public IElementos create(int precio) {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("Roja");
        camiseta.setTamano("M");
        camiseta.setGarantia("2 meses");
        return camiseta;
    }
}
