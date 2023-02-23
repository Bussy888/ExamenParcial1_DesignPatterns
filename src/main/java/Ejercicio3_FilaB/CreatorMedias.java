package Ejercicio3_FilaB;

public class CreatorMedias  extends CreatorELEMENTOS{

    @Override
    public Medias create(int precio) {
        Medias medias = new Medias();
        medias.setColor("Blancas");
        medias.setTamano("L");
        medias.setGarantia("1 semana");
        medias.setPrecio(precio);
        return medias;
    }
}
