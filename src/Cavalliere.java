import java.util.ArrayList;

public class Cavalliere implements Runnable{
    private String nome; //nome cavalliere
    private Thread dragoDaUccidere;
    private ArrayList<Thread> draghiUccisi; //array draghi uccisi
    private ArrayList<Cavalliere> seguaci; //array cavallieri seguaci

    public Cavalliere(String nome, Thread dragoDaUccidere) {
        this.nome = nome;
        this.dragoDaUccidere=dragoDaUccidere;
    }

    @Override
    public void run() {
        for(int i=0; 1<10 &&(!dragoDaUccidere.isInterrupted()); i++){
            try {
                Thread.sleep(5);
                dragoDaUccidere.interrupt();
                draghiUccisi.add(dragoDaUccidere);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
