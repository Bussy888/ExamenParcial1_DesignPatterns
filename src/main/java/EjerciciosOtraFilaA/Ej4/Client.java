package EjerciciosOtraFilaA.Ej4;

public class Client {
    public static void main(String[] args) {
        VendedorCine vendedorCine = new VendedorCine();
        PaqueteNormal normal = new PaqueteNormal();
        PaqueteMediano mediano = new PaqueteMediano();
        PaqueteMega mega = new PaqueteMega();

        vendedorCine.setTipoPaquete(normal);
        vendedorCine.buildProduct();
        Paquete p1 = vendedorCine.getPaquete();
        p1.showInfo();

        vendedorCine.setTipoPaquete(mediano);
        vendedorCine.buildProduct();
        Paquete p2 = vendedorCine.getPaquete();
        p2.showInfo();

        vendedorCine.setTipoPaquete(mega);
        vendedorCine.buildProduct();
        Paquete p3 = vendedorCine.getPaquete();
        p3.showInfo();
    }
}
