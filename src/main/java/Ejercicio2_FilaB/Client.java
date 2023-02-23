package Ejercicio2_FilaB;

public class Client {
    public static void main(String[] args) {

        Celular celu = new Celular();
        celu.setModelo("A1");
        celu.setTamano("7.2");//No dice en el enunciado
        celu.setPeso(60);
        celu.setCamara(new Camara(10,"5mp"));
        celu.setImei(10001);
        celu.setOrigen("Bolivia");

        celu.showInfo();

        Celular celu1 = celu.clone();
        celu1.setImei(10002);
        Celular celu2 = celu.clone();
        celu2.setImei(10003);
        Celular celu3 = celu.clone();
        celu3.setImei(10004);
        Celular celu4 = celu.clone();
        celu4.setImei(10005);
        Celular celu5 = celu.clone();
        celu5.setImei(10006);

        celu1.showInfo();
        celu2.showInfo();
        celu3.showInfo();
        celu4.showInfo();
        celu5.showInfo();
    }
}
