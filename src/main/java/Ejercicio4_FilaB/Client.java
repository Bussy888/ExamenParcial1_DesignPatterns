package Ejercicio4_FilaB;

public class Client {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        ContratoAmazon amazon = new ContratoAmazon();
        ContratoHBO hbo = new ContratoHBO();
        ContratoNetflix netflix = new ContratoNetflix();

        usuario1.setTipoContrato(amazon);
        usuario1.buildContrato();

        Contrato contrato1 = usuario1.getContrato();
        contrato1.showInfo();

        Usuario usuario2 = new Usuario();
        usuario2.setTipoContrato(hbo);
        usuario2.buildContrato();
        Contrato contrato2 = usuario2.getContrato();
        contrato2.showInfo();

        Usuario usuario3 = new Usuario();
        usuario3.setTipoContrato(netflix);
        usuario3.buildContrato();
        Contrato contrato3 = usuario3.getContrato();
        contrato3.showInfo();

    }
}
