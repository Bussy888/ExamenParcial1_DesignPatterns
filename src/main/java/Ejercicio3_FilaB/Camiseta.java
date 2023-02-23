package Ejercicio3_FilaB;

public class Camiseta implements IElementos {
    private String tamano;
    private String color;
    private String garantia;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public void showInfo() {
        System.out.println("Color: "+color);
        System.out.println("Tamano:"+tamano);
        System.out.println("Garantia: "+garantia);

    }

    @Override
    public void create() {
        System.out.println("Vendiendo Camiseta...");
    }
}
