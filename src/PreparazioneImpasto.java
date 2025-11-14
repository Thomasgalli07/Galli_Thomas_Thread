//Thread che simula la preparazione dell'impasto e la formatura delle piatsrelle
public class PreparazioneImpasto extends Thread{
    public void run(){
        try{
            System.out.println("Inizio a mischiare i materiali per fare l'impasto");
            Thread.sleep(200);//simula il tempo necessario
            System.out.println("formatura delle piastrelle negli stampi");
            Thread.sleep(800);//simula il tempo necessario
            System.out.println("Preparazione impasto completata");
        }catch (InterruptedException e ){
            System.out.println("la preparazione dell'impasto è stata interrotta");
        }
    }
}
