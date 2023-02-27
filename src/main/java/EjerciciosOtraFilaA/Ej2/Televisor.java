package EjerciciosOtraFilaA.Ej2;

public class Televisor  implements ITV{
    private String oS;
    private  String versionOS;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHDMI;
    private int puertosUSB;
    private boolean controlRemoto;
    private boolean bluetooth;
    private int serialTV;

    @Override
    public Televisor clone() {
        Televisor clone = new Televisor();
        clone.setBluetooth(this.isBluetooth());
        clone.setControlRemoto(this.isControlRemoto());
        clone.setoS(this.getoS());
        clone.setPuertoHDMI(this.isPuertoHDMI());
        clone.setPulgadas(this.getPulgadas());
        clone.setResolucion(this.getResolucion());
        clone.setSerialTV(this.getSerialTV());
        clone.setVersionOS(this.getVersionOS());
        clone.setPuertosUSB(this.getPuertosUSB());
        return clone;
    }
    public void showInfo(){
        System.out.println("++++++TELEVISOR+++++++");
        System.out.println("Serial: "+serialTV+ " OS: "+oS+" Version OS: "+versionOS);
        System.out.println("Pulgadas: "+pulgadas+" Resolucion: "+resolucion);
        System.out.println("Puerto HDMI: "+puertoHDMI+" Puertos USB: "+puertosUSB);
        System.out.println("Control Remoto: "+controlRemoto+" Bluetooth: "+bluetooth);
    }

    public String getoS() {
        return oS;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }

    public String getVersionOS() {
        return versionOS;
    }

    public void setVersionOS(String versionOS) {
        this.versionOS = versionOS;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getSerialTV() {
        return serialTV;
    }

    public void setSerialTV(int serialTV) {
        this.serialTV = serialTV;
    }
}
