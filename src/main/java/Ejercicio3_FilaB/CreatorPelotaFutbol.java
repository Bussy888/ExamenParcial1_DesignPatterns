package Ejercicio3_FilaB;

public class CreatorPelotaFutbol  extends CreatorELEMENTOS{
    @Override
    public PelotaFutbol create(int precio) {
        PelotaFutbol pelotaFutbol = new PelotaFutbol();
        pelotaFutbol.setColor("Negro con blanco");
        pelotaFutbol.setTamano("Regular");
        pelotaFutbol.setGarantia("6 meses");
        pelotaFutbol.setPrecio(precio);
        return pelotaFutbol;
    }
}
