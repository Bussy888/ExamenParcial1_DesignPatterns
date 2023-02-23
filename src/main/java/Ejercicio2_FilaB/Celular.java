package Ejercicio2_FilaB;

public class Celular implements ICelular {
    private String modelo;
    private String tamano;
    private  int peso;
    private Camara camara;
    private int imei;
    private String origen;

    public Celular(){
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public Celular clone() {
        Celular clone = new Celular();
        clone.setCamara(this.getCamara());
        clone.setImei(this.getImei());
        clone.setModelo(this.getModelo());
        clone.setOrigen(this.getOrigen());
        clone.setPeso(this.getPeso());
        clone.setTamano(this.getTamano());
        return clone;
    }

    public void showInfo(){
        System.out.println("--------- Nuevo Celular -------");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Tamano: "+this.getTamano());
        System.out.println("Peso: "+this.getPeso());
        camara.showInfo();
        System.out.println("IMEI: "+this.getImei());
        System.out.println("Origen: "+this.getOrigen());
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
