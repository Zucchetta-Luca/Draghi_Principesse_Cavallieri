public class D_SputaFuoco extends Drago implements Runnable{
    public D_SputaFuoco(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return "Sputa fuoco";

    }


    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(this.getNome()+"sputa fuoco e si libra nell'aria");
        }
    }
}
