//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProduzionePiastrelle { //creazione della classe
    public static void main(String[] args) {
        System.out.printf("Avvio il processo di produzione delle piastrelle"); //stampa della stringa che avvia il processo

        PreparazioneImpasto prep= new PreparazioneImpasto(); //creazione del primo Thread
        CotturaImpasto cott= new CotturaImpasto(); //creazione del secondo Thread

        prep.start(); //avvio del primo Thread
        cott.start(); // avvio del secondo Thread

        try{
            prep.join();//garantisce che il main aspetti la fine di entrambi i Thread
            cott.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Preparazione delle piastrelle completata"); //stampa finale della stringa
    }
}