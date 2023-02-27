package EjerciciosOtraFilaA.Ej2;

public class Client {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.setoS("android");
        tv.setVersionOS("11.0");
        tv.setPulgadas(80);
        tv.setResolucion(50);
        tv.setPuertoHDMI(true);
        tv.setPuertosUSB(4);
        tv.setControlRemoto(true);
        tv.setBluetooth(true);
        tv.setSerialTV(0);

        Televisor tv1 = tv.clone();
        Televisor tv2 = tv.clone();
        Televisor tv3 = tv.clone();
        Televisor tv4 = tv.clone();
        Televisor tv5 = tv.clone();

        tv1.setSerialTV(1234567890);
        tv2.setSerialTV(1276543210);
        tv3.setSerialTV(1154893355);
        tv4.setSerialTV(2045987456);
        tv5.setSerialTV(1188664422);

        tv1.showInfo();
        tv2.showInfo();
        tv3.showInfo();
        tv4.showInfo();
        tv5.showInfo();
    }
}
