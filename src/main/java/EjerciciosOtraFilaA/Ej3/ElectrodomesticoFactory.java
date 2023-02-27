package EjerciciosOtraFilaA.Ej3;

public class ElectrodomesticoFactory {
    public static IElectrodomestico make(String electro){

        switch (electro) {
            case "Televisor":
                Televisor tv = new Televisor();
                tv.setNombre("XIAOMI TV 50'");
                tv.setPrecio(5000);
                return  tv;
            case "Batidora":
                Batidora batidora = new Batidora();
                batidora.setNombre("Batidora Oster");
                batidora.setPrecio(230);
                return batidora;
            case "Microondas":
                Microondas microondas = new Microondas();
                microondas.setNombre("Microondas Daewoo");
                microondas.setPrecio(500);
                return microondas;
            case "Radio":
                Radio radio = new Radio();
                radio.setNombre("Radio Radioshack");
                radio.setPrecio(120);
                return radio;
            case "Refrigerador":
                Refrigerador refrigerador = new Refrigerador();
                refrigerador.setNombre("Refrigerador MABE");
                refrigerador.setPrecio(2000);
                return refrigerador;
            default:
                return null;
        }
    }
}
