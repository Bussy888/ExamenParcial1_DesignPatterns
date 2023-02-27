package EjerciciosOtraFilaA.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Peaje {
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private double dineroRecaudado;
    private static Peaje peaje;

    private Peaje(){
        this.vehiculos = new ArrayList<>();
    }
    public static Peaje getInstance(){
        if(peaje == null){
            peaje = new Peaje();
        }
        return peaje;
    }
    public void showLista(){
        for(Vehiculo vehiculo:vehiculos){
            vehiculo.showInfo();
        }
    }
    public void registro(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        if(vehiculos.size() < 7){
            showLista();
        }
    }
}
