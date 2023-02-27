package EjerciciosOtraFilaA.Ej3;

public class Client {
    public static void main(String[] args) {
        ElectrodomesticoFactory eFactory = new ElectrodomesticoFactory();
        eFactory.make("Batidora").showInfo();
        eFactory.make("Microondas").showInfo();
        eFactory.make("Radio").showInfo();
        eFactory.make("Refrigerador").showInfo();
        eFactory.make("Televisor").showInfo();
    }
}
