package Ejercicio3_FilaB;

public class Client {
    public static void main(String[] args) {


        PelotaFutbol pelotaFutbol = new CreatorPelotaFutbol().create(250);
        pelotaFutbol.create();
        pelotaFutbol.showInfo();

        Camiseta camiseta = new CreatorCamiseta().create(100);
        camiseta.create();
        camiseta.showInfo();

        Shorts shorts = new CreatorShorts().create(50);
        shorts.create();
        shorts.showInfo();

        Medias medias = new CreatorMedias().create(10);
        medias.create();
        medias.showInfo();

        Tenis tenis = new CreatorTenis().create(512);
        tenis.create();
        tenis.showInfo();
    }
}
