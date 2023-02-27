package EjerciciosOtraFilaA.Ej1;

public class Client {
    public static void main(String[] args) {
        Peaje peaje = Peaje.getInstance();

        Vehiculo vehiculo[] = {
                new Vehiculo("402KLL","Ford Bronco","Rojo"),
                new Vehiculo("1234WER", "Toyota Cressida","Azul"),
                new Vehiculo("4321TRE","Dodge Challenger","Naranja"),
                new Vehiculo("434POP", "BMW X5","Blanco"),
                new Vehiculo("649LEL","Jeep Compass", "Gris"),
                new Vehiculo("1998HTL", "Chevrolet Camaro", "Amarillo"),
                new Vehiculo("5433GRE", "Ford Mustang","Negro"),
                new Vehiculo("5403PER","Rezvani Vengeance", "Gris")
        };
        for(Vehiculo vehiculo1 : vehiculo){
            peaje.registro(vehiculo1);
        }
    }
}
