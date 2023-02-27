package EjerciciosOtraFilaA.Ej5;

public class Client {

    public static void main(String[] args) {
        String msg = "2 * 3 + 5 + 5 + 5";
        Evaluator evaluator = new Evaluator(msg);
        System.out.println("Resultado: "+evaluator.resolver());
    }
}
