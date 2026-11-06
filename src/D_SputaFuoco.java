public class D_SputaFuoco extends Drago implements Runnable {
    public D_SputaFuoco(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        for (int i = 0; (i < 5) && !Thread.interrupted(); i++) {
            //gebnerazione di un numero random da 0 a 1, se supere 0.5, viene catturata la principessa
            //da catturare se è libera e il suo stato viene ora impostato a catturato
            System.out.println(this.getNome() +
                    " sputa fuoco e si libra nell'aria! Gioia immensa, al battito " + (1 + i));
        }
    }
}
