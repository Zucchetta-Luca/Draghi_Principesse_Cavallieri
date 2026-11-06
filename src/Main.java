import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Principessa sissy = new Principessa("Sissy");
        ArrayList<Thread> dragos = new ArrayList<>();
        for (int i = 0; (i < 3); i++) {
            Thread t = new Thread(new D_SputaFuoco(String.valueOf(i)));
            dragos.add(t);
        }
        System.out.println("I draghi sono nati epronti per uccidere");
        Thread sangiorgio = new Thread(new Cavaliere("giorgio", dragos.get(1)));
        System.out.println("Un cavalliere è destinato a entrare nella storia e ad ucciderne uno");
        for (Thread t : dragos) {
            t.start();
        }
        System.out.println("I draghi sono partiti per distruggere i villaggi");
        sangiorgio.start();
        try {
            int a = 0;
            a = 6 / 0;
            System.out.println("Risultato= " + a);
        } catch (ArithmeticException x) {
            System.out.println(x);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Stampare il risultato");
        }
        System.out.println("Giorgio si prepara anchegli alla battaglia e li insegue");
        try {
            for (Thread t : dragos) {
                t.join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Il cavaliere ha atterrato il drago");

    }
}