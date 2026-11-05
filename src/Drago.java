public abstract class Drago {
    private String nome; //nome del drago
    private Principessa principessa; //principessa catturata

    //Costruttore
    public Drago(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String Distruggi();

}
