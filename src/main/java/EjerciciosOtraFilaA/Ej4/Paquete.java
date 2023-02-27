package EjerciciosOtraFilaA.Ej4;

public class Paquete {
    private String tipo;
    private String pipocas;
    private String vasos;
    private String chocolates;

    public String getTipo() {
        return tipo;
    }

    public Paquete setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getPipocas() {
        return pipocas;
    }

    public Paquete setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }

    public String getVasos() {
        return vasos;
    }

    public Paquete setVasos(String vasos) {
        this.vasos = vasos;
        return this;
    }

    public String getChocolates() {
        return chocolates;
    }

    public Paquete setChocolates(String chocolates) {
        this.chocolates = chocolates;
        return this;
    }
    public void showInfo(){
        System.out.println("+++++PAQUETE "+tipo+"++++++");
        System.out.println("Tamano de Pipocas:  "+pipocas);
        System.out.println("Vasos de refresco:  "+vasos);
        System.out.println("Cantidad de Chocolates:  "+chocolates);
        System.out.println(" ");
    }


}
