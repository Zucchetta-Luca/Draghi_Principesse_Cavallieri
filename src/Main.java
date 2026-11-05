//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    StringBuilder storytelling= new StringBuilder();
    ArrayList<Thread> dragos= new ArrayList<>();
    for(int i=0; i<3; i++){
        Thread t= new Thread(new D_SputaFuoco(String.valueOf(i)));
        dragos.add(t);
    }

    Thread sanGiorgio=new Thread(new Cavalliere("giorgio", dragos.get(1)));
    for(Thread t:dragos){
        t.start();
    }

    System.out.println("draghi partiti");

    sanGiorgio.start();

}
