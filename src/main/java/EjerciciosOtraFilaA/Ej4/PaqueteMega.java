package EjerciciosOtraFilaA.Ej4;

public class PaqueteMega extends BuilderPaquete {

    @Override
    public void buildTipo() {
        paquete.setTipo("MEGA");
    }

    @Override
    public void buildPipocas() {
        paquete.setPipocas("Extragrandes");
    }

    @Override
    public void buildVasos() {
        paquete.setVasos("3 extragrandes con regarga ilimitada");
    }

    @Override
    public void buildChocolate() {
        paquete.setChocolates("2 grandes");

    }
}
